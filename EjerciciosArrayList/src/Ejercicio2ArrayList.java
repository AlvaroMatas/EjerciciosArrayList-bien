import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2ArrayList {

	public static void main(String[] args) throws IOException {
		menu();

	}
	
	//Metodo para mostrar el menu y se elija la opcion
	public static void menu() throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int eleccion;
		
		do {
			
			System.out.println("*****ACCIONES***** \n"
					+ "[1] Agregar elemento\n"
					+ "[2] Buscar elemento\n"
					+ "[3] Modificar elemento\n"
					+ "[4] Eliminar elemento\n"
					+ "[5] Insertar elemento\n"
					+ "[6] Mostrar elementos\n"
					+ "[7] Orden ascendente\n"
					+ "[8] Orden descendente\n"
					+ "[9] Salir\n");
			
			System.out.print("Introduzca acción (1-9): ");
			eleccion = Integer.parseInt(entrada.readLine());
			
		} while (eleccion != 9);
	}
	
	//Metodo para pedir la operacion a realizar
	public static int eleccionMenu(int eleccion) {
		
		for (int i = 0; i <= 9; i++) {
			if (i == eleccion) {
				eleccion = i;
				break;
			}
		}
		
		return eleccion;
	}
	
}
