package Prubas.del.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	  static Scanner sc = new Scanner(System.in);
	  
	  //Se crea un ArrayList para guardar objetos de tipo Coche.
	     static ArrayList<Coche> coches = new ArrayList();
	     
	     //m�todo main
	     public static void main(String[] args) {
	         leerCoches();
	         System.out.println("\nCoches introducidos:");
	        
	     } //fin m�todo main
	    
	     //M�todo para leer coches e introducirlos en el array
	     public static void leerCoches(){
	  
	         //Declaraci�n de variables para leer los datos de los coches
	         String matricula;
	         String marca;
	         String modelo;
	         int Km;
	   
	         //Variable auxiliar que contendr� la referencia a cada coche nuevo.
	         Coche aux;
	         int i, N;
	   
	         //se pide por teclado el n�mero de coches a leer
	         do {
	             System.out.print("N�mero de coches? ");
	             N = sc.nextInt();
	         } while (N < 0);
	         sc.nextLine(); //limpiar el intro
	   
	         //lectura de N coches
	         for (i = 1; i <= N; i++) {
	             //leer datos de cada coche
	             System.out.println("Coche " + i);
	             System.out.print("Matr�cula: ");
	             matricula = sc.nextLine();          
	             System.out.print("Marca: ");
	             marca = sc.nextLine();
	             System.out.print("Modelo: ");
	             modelo = sc.nextLine();
	             System.out.print("N�mero de Kil�metros: ");
	             Km = sc.nextInt();
	             sc.nextLine(); //limpiar el intro
	    
	             aux = new Coche(); //Se crea un objeto Coche y se asigna su referencia a aux                          
	    
	             //se asignan valores a los atributos del nuevo objeto
	             aux.setMatricula(matricula);
	             aux.setMarca(marca);
	             aux.setModelo(modelo);
	             aux.setKm(Km);
	                       
	             //se a�ade el objeto al final del array
	             coches.add(aux);
	         }
	     }} //fin m�todo leerCoches()