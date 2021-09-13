package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

	//no se puede sobre escribir un metodo final del padre
	@Override
protected void realizarPracticas() {
		
		
		System.out.println("Realiza 100 horas practicas");
}
	
	protected  void realizarPasantias() {
		System.out.println("Realiza 200 horas pasantia");
}
}
