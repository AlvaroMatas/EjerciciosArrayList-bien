package Ejercicio3ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
	public static void agregarNotas() {
		double nota;
		String nombre;
		
		
		
	}
	
	//Metodo para mostrar ordenado por nombre
	private static void mostrarOrdenPorNombre() {
		// TODO Auto-generated method stub
		
	}
	
	//Metodo para mostrar ordenado por nota
	private static void mostrarOrdenPorNota() {
		// TODO Auto-generated method stub
		
	}
	

}
