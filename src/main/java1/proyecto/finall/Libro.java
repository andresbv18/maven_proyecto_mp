package proyecto.finall;

public class Libro {
	public String codigo;
	public String nombre;
	public String autor;
	public int anyoPublicacion;
	public String editorial;
	public int cantidadPaginas;
	public int precio;
	public int ejemplares;
	public String codigoAutorizacion;
	public int tiempoAproxiLectura;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public String getCodigoAutorizacion() {
		return codigoAutorizacion;
	}
	public void setCodigoAutorizacion(String codigoAutorizacion) {
		this.codigoAutorizacion = codigoAutorizacion;
	}
	public int getTiempoAproxiLectura() {
		return tiempoAproxiLectura;
	}
	public void setTiempoAproxiLectura(int tiempoAproxiLectura) {
		this.tiempoAproxiLectura = tiempoAproxiLectura;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\nCodigo: ");
        sb.append(codigo);
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nAutor: ");
        sb.append(autor);
        sb.append("\nAño de publicacion: ");
        sb.append(anyoPublicacion);  
        sb.append("\nEditorial: ");
        sb.append(editorial);
        sb.append("\nCantidad de paginas: ");
        sb.append(cantidadPaginas);
        sb.append("\nPrecio: ");
        sb.append(precio);
        sb.append("\nCodigo de autorizacion: ");
        sb.append(codigoAutorizacion);
        sb.append("\nTiempo aproximado de lectura: ");
        sb.append(tiempoAproxiLectura);
        return sb.toString();
	}
	
}
