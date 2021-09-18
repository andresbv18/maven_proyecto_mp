package ejercicios.seleccion.switchc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//El swithc asta antes de la vercion 1.7
		//Solo funcionaba para byte,short,char e int.
		Scanner entrada = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("Escoja una opcion");
			System.out.println("1_realizar tranferencia");
			System.out.println("2_Consultar pagos");
			System.out.println("3.Salir\n");
			opcion = entrada.nextLine();
			switch (opcion) {

			case "1":
				System.out.println("Ingrese numero de cuenta");
				break;
			case "2":
				System.out.println("No existen pagos");
				break;
			case "3":
				System.out.println("Cerrando el sistema");
				break;
				default:System.out.println("No ha elegido una opcion valida");
				break;
			}
		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}
}
