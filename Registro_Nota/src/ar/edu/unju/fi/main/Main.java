package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// Scanner
		Scanner leer = new Scanner(System.in);
		// Crear alumno
		Alumno alumno = generarAlumno(leer);

		registrarNotas(alumno, 2);
		leer.close();
	}

	public static Alumno generarAlumno(Scanner leer) {
		Alumno alumno = new Alumno();

		System.out.print("Ingrese legajo: ");
		Integer legajo = leer.nextInt();
		System.out.print("Ingrese apellido: ");
		String apellido = leer.next();
		System.out.print("Ingrese nombre: ");
		String nombre = leer.next();

		// asignar atributos
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		// leer.close();
		return alumno;
	}

	public static void registrarNotas(Alumno alumno, int numMaterias) {
		// Scanner
		Scanner leer = new Scanner(System.in);
		while (numMaterias > 0) {
			// cargar materia
			System.out.print("Ingrese codigo de materia: ");
			String codigoMateria = leer.next();
			System.out.print("Ingrese nombre de materia: ");
			String nombreMateria = leer.next();
			// Crear materia
			Materia materia = new Materia(codigoMateria, nombreMateria);

			System.out.print("Ingrese codigo de registro de nota: ");
			String codigoNota = leer.next();
			System.out.print("Ingrese la nota final: ");
			Float nota = leer.nextFloat();

			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);

			System.out.println(registroNota.toString());
			numMaterias--;
		}
		leer.close();
	}
}
