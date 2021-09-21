package ejercicios.manejo.fechas;

import java.time.LocalDate;

public class CursoVacacional {
 private String nombre;
 public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public LocalDate getFechaFin() {
	return fechaFin;
}
public void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
}
private LocalDate fechaInicio;
 private LocalDate fechaFin;
}
