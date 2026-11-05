package Ejercicio3ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Principal {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Alumno> notasExamen = new ArrayList<Alumno>();
	
	public static void main(String[] args) throws IOException {
		
		int opcion = 0;
		
		do {
			System.out.println("*****Notas examen programacion*****\n [1]Agregar nota\n [2]Ordenar por nombre\n [3]Ordenar por nota\n [4]Salir");
			
			opcion = pedirOpcion();
			
			switch (opcion) {
			case 1:
				agregarNotas();
				break;
			case 2:
				mostrarOrdenPorNombre();
				break;
			case 3:
				mostrarOrdenPorNota();
				break;	

			default:
				System.out.println("*****Saliendo del programa*****");
				break;
			}
			
		} while (opcion != 4);
		
	}

	//Metodo para pedir la opcion que quiere y validarla
	private static int pedirOpcion() throws IOException {
		
		int opcion = 0;
		boolean valida = false;
		
		while (!valida) {
			try {
				System.out.print("¿Que quieres hacer?:");
				opcion = Integer.parseInt(entrada.readLine());
				
				if (opcion >= 1 && opcion <= 4) {
					valida = true;
				}else {
					System.out.println("Introduce un número entre 1 y 4");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce un valor valido (numeros)");
			}
		}
		
		return opcion;
	}
	
	//Metodo para agregar notas
	public static void agregarNotas() throws IOException {
		double nota = 0;
		String nombre;
		boolean notaValida = false;
		
		System.out.print("Nombre del alumno: ");	
		nombre = entrada.readLine();
		
		while (!notaValida) {
			try {
				System.out.print("Nota: ");
				nota = Double.parseDouble(entrada.readLine().replace(',', '.'));
				
				if (nota >= 0 && nota <= 10) {
					notaValida = true;
				}else {
					System.out.println("ERROR: La nota tiene que estar entre 0 y 10");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Inroduce valores numericos");
			}
		}
		
		Alumno alumno = new Alumno(nombre, nota);
		
		notasExamen.add(alumno);
		
	}
	
	//Metodo para mostrar ordenado por nombre
	private static void mostrarOrdenPorNombre() {
		
		Collections.sort(notasExamen, Comparator.comparing(Alumno::getNombre, String.CASE_INSENSITIVE_ORDER));
		
		for (Alumno alumno : notasExamen) {
			System.out.println("Alumno: " + alumno.getNombre() + " | " + "Nota: " + alumno.getNota());
		}
	}
	
	//Metodo para mostrar ordenado por nota
	private static void mostrarOrdenPorNota() {
		
		Collections.sort(notasExamen, Comparator.comparingDouble(Alumno::getNota));
		
		for (Alumno alumno : notasExamen) {
			System.out.println("Alumno: " + alumno.getNombre() + " | " + "Nota: " + alumno.getNota());
		}
		
	}
	

}
