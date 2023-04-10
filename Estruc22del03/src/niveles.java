
public class niveles <T,u,v> {

	private T codigo;
	private v nobmbre;
	private u tipoSangre;
	public niveles(T codigo, v nobmbre, u tipoSangre) {
		super();
		this.codigo = codigo;
		this.nobmbre = nobmbre;
		this.tipoSangre = tipoSangre;
	}
	public T getCodigo() {
		return codigo;
	}
	public void setCodigo(T codigo) {
		this.codigo = codigo;
	}
	public v getNobmbre() {
		return nobmbre;
	}
	public void setNobmbre(v nobmbre) {
		this.nobmbre = nobmbre;
	}
	public u getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(u tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	
	
	
	
}
