/**
 * 
 */
package arbolesbinarios;

/**
 * @author lenovo
 *
 */
public class binarytree {

	 private Node root;

	    private class Node {
	        private int value;
	        private Node leftChild;
	        private Node rightChild;

	        public Node(int value) {
	            this.value = value;
	            this.leftChild = null;
	            this.rightChild = null;
	        }
	    }

	  

	    public binarytree(Node root) {
			super();
			this.root = root;
		}

		public void insert(int value) {
	        if (this.root == null) {
	            this.root = new Node(value);
	        } else {
	            insertHelper(this.root, value);
	        }
	    }

	    private void insertHelper(Node node, int value) {
	        if (value < node.value) {
	            if (node.leftChild == null) {
	                node.leftChild = new Node(value);
	            } else {
	                insertHelper(node.leftChild, value);
	            }
	        } else {
	            if (node.rightChild == null) {
	                node.rightChild = new Node(value);
	            } else {
	                insertHelper(node.rightChild, value);
	            }
	        }
	    }
	    
	    
	    public void preOrderTraversal() {
	        preOrderHelper(this.root);
	    }

	    private void preOrderHelper(Node node) {
	        if (node != null) {
	            System.out.print(node.value + " ");
	            System.out.println();
	            preOrderHelper(node.leftChild);
	            preOrderHelper(node.rightChild);
	        }
	    }

}
