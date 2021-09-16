package prueba.vi;

import java.util.Scanner;

public class PruebaVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int saldo_inicial = 2500;
	
		double  saldoActual = 0, retiro = 0;
		String claveIngresada;
		String opcionMenu;
		do {
			int numero;
			System.out.println("Ingrese la clave");
			Scanner entrada = new Scanner(System.in);
			claveIngresada = entrada.nextLine();
			if (claveIngresada.equals("85DB")) {
				System.out.println("Bienvenido al Sistema");

				do {

					System.out.println("Banco del Pichicaha:\nseleccione una opcion:\n");
					System.out.println("1. consultar pagos");
					System.out.println("2.realizar tranferencia");
					System.out.println("3.Salir\n");
					System.out.print("Ingresar un numero\n*");
					
					opcionMenu = entrada.nextLine();
					// } while (opcionMenu.equals("1")||opcionMenu.equals("2"));
				
			
				if (opcionMenu.equals("1")) {
					System.out.print("no tiene pagos pendientes_");
				} else if (opcionMenu.equals("2")) {
					System.out.print("Digite la cuenta a la que desea tranferir:_ ");
					int cuenta = entrada.nextInt();
					System.out.print("Digite la cantidad que desea tranferir:_ ");
					retiro = entrada.nextDouble();
					if (retiro <= saldo_inicial) {
						saldoActual = saldo_inicial - retiro;
						System.out.println("Dinero en cuenta:_ " + saldoActual);

					} else {
						System.out.println("NO cuenta con dinero suficiente");

					}

				}
			}while (!opcionMenu.equals("3"));
				claveIngresada = "0";
			}else {
				System.out.println("Nombre de Usuario o contraseña Incorrecto");
				System.out.println("Ingrese la clave");
			}

		} while (!claveIngresada.equals("-1"));

	}

}
