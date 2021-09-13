package ejercicios.nonaccess.finall;

public class EstudianteMedicina extends Estudiante {
	// no se puede sobre escribir un metodo final del padre
	protected final void realizarPracticas() {

		System.out.println("Realiza 50 horas practicas");
	}

	protected void realizarPasantias() {
		System.out.println("Realiza 100 horas pasantia");
	}
}