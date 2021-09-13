package ejercicios.nonaccess.finall;

public final class EstudianteCiencias extends Estudiante {
	
	public final String horarioEntrada="08:00";
	public String ciudadNacimiento="Quito";
	
	public EstudianteCiencias() {
		//No se puede reasignar un valor a un atributo final
		
		horarioEntrada="08:00";
		
		ciudadNacimiento="Guayaquil";
	}

}
