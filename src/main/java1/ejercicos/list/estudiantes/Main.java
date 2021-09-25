package ejercicos.list.estudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
//		Estudiante estudiante1 = new Estudiante();
//		estudiante1.setNombre("Daniel");
//		estudiante1.setApelido("Teran");
//
//		Estudiante estudiante2 = new Estudiante();
//		estudiante2.setNombre("Andres");
//		estudiante2.setApelido("Prins");
//
//		Estudiante estudiante3 = new Estudiante();
//		estudiante3.setNombre("Pepito");
//		estudiante3.setApelido("Perez");
//
//		Estudiante listUniversidad[] = new Estudiante[1000];
//		listUniversidad[0] = estudiante1;
//		listUniversidad[1] = estudiante2;
//		listUniversidad[2] = estudiante3;
//
//		for (int i = 0; i < 1000; i++) {
//			Estudiante estudiante = new Estudiante();
//			System.out.println("Ingrese nombre del estudiante"+i);
//			String nombre=entrada.nextLine();
//			System.out.println("Ingrese apellido del estudiante"+i);
//			String apelido=entrada.nextLine();
//			estudiante.setNombre(nombre);
//			estudiante.setApelido(apelido);
//			listUniversidad[i]=estudiante;
//			
		int N;
		  do {
	             System.out.print("Número de libros? ");
	            N = entrada.nextInt();
	         } while (N < 0);
	         entrada.nextLine(); //limpiar el intro
		List <Estudiante> listUni=new ArrayList<Estudiante>();
		for (int i = 0; i < 1000; i++) {
			Estudiante estudiante = new Estudiante();
			System.out.println("Ingrese nombre del estudiante"+i);
			String nombre=entrada.nextLine();
			System.out.println("Ingrese apellido del estudiante"+i);
			String apelido=entrada.nextLine();
			estudiante.setNombre(nombre);
			estudiante.setApelido(apelido);
			listUni.add(estudiante);
			
	}	Estudiante estu=	listUni.get(0);	
	System.out.println(estu);
		for (int i = 0; i < listUni.size(); i++) {
			Estudiante estu1=listUni.get(i);	
			System.out.println(estu1);
			
		}
		
}
}