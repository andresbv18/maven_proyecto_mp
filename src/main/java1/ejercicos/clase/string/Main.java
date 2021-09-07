package ejercicos.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.contains
		// es una clase utilitaria para manejo de cadenas
		// modulo
		// modulo
//1.contains
		String frase = "Programacion de algoritmos módulo II";
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el titulo del libro");
		String palabra = entrada.nextLine();

		boolean resultado = frase.contains(palabra);
		System.out.print("Contiene la palbra" + resultado);

		// 2.equals

		System.out.println("******************************************************************");
		String cadena1 = "Edison";
		System.out.print("Ingrese la segunda cadena: ");
		String cadena2 = entrada.nextLine();

		boolean resultado2 = cadena1.equals(cadena2);
		System.out.print("Las cadenas son iguales : " + resultado2);

		// 3.4.Upper_Lower
		
		System.out.println("******************************************************************");
		String nombre = "Juanaito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("nombre en mayuscula  " + nombreEnMayuscula);

		System.out.println("******************************************************************");
		String nombre2 = "JOSE";
		String nombreEnMinuscula = nombre2.toLowerCase();
		System.out.println("nombre en minuscula  " + nombreEnMinuscula);
	}

}
