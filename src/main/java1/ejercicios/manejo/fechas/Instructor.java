package ejercicios.manejo.fechas;

public class Instructor {
private String nombre;
private String apellido;
private String direccionDomicilio;

public String getDireccionDomicilio() {
	return direccionDomicilio;
}

public void setDireccionDomicilio(String direccionDomicilio) {
	this.direccionDomicilio = direccionDomicilio;
}

private int edad;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}


}
