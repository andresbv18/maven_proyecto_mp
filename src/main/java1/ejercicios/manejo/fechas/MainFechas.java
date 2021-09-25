package ejercicios.manejo.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Date date =new Date();//DEprecada ya na se deberia usar

		LocalDate diaHoy = LocalDate.now();// fecha actual
		LocalDate diaFin = diaHoy.plusDays(15);
		System.out.println(diaHoy);
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Voley principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaHoy);
		//// Aumentar 15 dias
		diaHoy.plusDays(15);
		curso1.setFechaFin(diaFin);

		System.out.println("Nombre:" + curso1.getNombre());
		System.out.println("F I :" + curso1.getFechaInicio());
		System.out.println("F F :" + curso1.getFechaFin());

		// ***********************************************************************************
		LocalDate diaHoy2 = LocalDate.now();// fecha actual

		LocalDate diaQueInicio = diaHoy2.minusDays(2);
		LocalDate diaQueFinaliza = diaQueInicio.plusDays(20);

		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natacion principiantes");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQueFinaliza);
		System.out.println("Nombre:" + curso2.getNombre());
		System.out.println("F I :" + curso2.getFechaInicio());
		System.out.println("F F :" + curso2.getFechaFin());
		// **************************************************************************************

		// FEchas especificas
		LocalDate fechaEspecificaIni = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspecificaFin = LocalDate.of(2022, 7, 10);
		System.out.println(fechaEspecificaIni);
		// Ejercicios
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspecificaIni);
		curso3.setFechaFin(fechaEspecificaFin);

		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		curso3.setFechaFin(fechaVistaNueva);

		System.out.println("Nombre:" + curso3.getNombre());
		System.out.println("F I :" + curso3.getFechaInicio());
		System.out.println("F F :" + curso3.getFechaFin());

		////
		// FEchas especificas
		LocalDate fechaEspecificaInic = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspecificaFinn = LocalDate.of(2022, 7, 10);
		System.out.println(fechaEspecificaIni);
		// Ejercicios
		CursoVacacional curso4 = new CursoVacacional();
		curso4.setNombre("Karate");
		curso4.setFechaInicio(fechaEspecificaIni);
		curso4.setFechaFin(fechaEspecificaFin);

		LocalDate fechaVista1 = curso4.getFechaFin();
		LocalDate fechaVistaNueva1 = fechaVista1.plusDays(3);
		curso3.setFechaFin(fechaVistaNueva1);

		System.out.println("Nombre:" + curso4.getNombre());
		System.out.println("F I :" + curso4.getFechaInicio());
		System.out.println("F F Formateada:" + curso4.getFechaFin().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));

		System.out.println("Que dia es hoy");
		LocalDate diaHoy3 = LocalDate.now();
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
	}
}
