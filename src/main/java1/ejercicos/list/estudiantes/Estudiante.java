package ejercicos.list.estudiantes;

public class Estudiante {
	private String nombre;
	private String apelido;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apelido=" + apelido + "]";
	}

}
