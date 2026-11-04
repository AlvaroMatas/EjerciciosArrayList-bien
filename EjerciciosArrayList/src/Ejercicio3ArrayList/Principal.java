package Ejercicio3ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Object> notasExamen = new ArrayList<Object>();
	
	public static void main(String[] args) throws IOException {
		int opcion = 0;
		
		do {
			System.out.println("*****Notas examen programacion*****\n [1]Agregar nota\n [2]Salir");
			
			opcion = pedirOpcion();
			
			switch (opcion) {
			case 1:
				agregarNotas();
				break;

			default:
				break;
			}
			
		} while (opcion != 2);
		
		

	}
	

	//Metodo para pedir la opcion que quiere y validarla
	private static int pedirOpcion() throws IOException {
		
		int opcion = 0;
		boolean valida = false;
		
		while (!valida) {
			try {
				System.out.print("¿Que quieres hacer?:");
				opcion = Integer.parseInt(entrada.readLine());
				
				if (opcion >= 1 && opcion <= 2) {
					valida = true;
				}else {
					System.out.println("Introduce un número entre 1 y 2");
				}
			} catch (NumberFormatException e) {
				System.out.println("ERROR: Introduce un valor valido (numeros)");
			}
		}
		
		return opcion;
	}
	
	//Metodo para agregar notas
	private static void agregarNotas() {
		// TODO Auto-generated method stub
		
	}
	

}
