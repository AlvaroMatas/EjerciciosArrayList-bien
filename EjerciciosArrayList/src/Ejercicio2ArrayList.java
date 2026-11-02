import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ejercicio2ArrayList {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Double> lista = new ArrayList<Double>();

	public static void main(String[] args) throws IOException {
		menu();

	}

	// Metodo para mostrar el menu y se elija la opcion
	public static void menu() throws IOException {
		int eleccion = 0;

		do {

			System.out.println("*****ACCIONES***** \n" + "[1] Agregar elemento\n" + "[2] Buscar elemento\n"
					+ "[3] Modificar elemento\n" + "[4] Eliminar elemento\n" + "[5] Insertar elemento\n"
					+ "[6] Mostrar elementos\n" + "[7] Orden ascendente\n" + "[8] Orden descendente\n" + "[9] Salir\n");

			eleccion = pedirEleccion();

			switch (eleccion) {
			case 1:
				System.out.println("Vas a agregar un elemento");
				agregarElemento();
				break;
			case 2:
				System.out.println("Vas a buscar un elemento");
				buscarElemento();
				break;
			case 3:
				System.out.println("Vas a modificar un elemento");
				modificarElemento();
				break;
			case 4:
				System.out.println("Vas a eliminar un elemento");
				eliminarElemento();
				break;
			case 5:
				System.out.println("Vas a insertar un elemento");
				insertarElemento();
				break;
			case 6:
				System.out.println("Vas a mostrar los elementos");
				mostrarElementos();
				break;
			case 7:
				System.out.println("Vas a mostrar en orden ascendente");
				mostrarAscendente();
				break;
			case 8:
				System.out.println("Vas a mostrar en orden descendente");
				mostrarDescendente();
				break;
			case 9:
				System.out.println("*****SALIENDO DEL PROGRAMA*****");
				break;

			default:
				break;
			}

		} while (eleccion != 9);

	}

	//Metodo para pedir la eleccion y comprobar que esté bien
	private static int pedirEleccion() throws IOException {
		
		int opcion = 0;
		boolean valida = false;
		
		while (!valida) {
			try {
				System.out.print("Introduzca acción (1-9): ");
				opcion = Integer.parseInt(entrada.readLine());
				
				if (opcion >= 1 && opcion <= 9) {
					valida = true;
				}
				else {
					System.out.println("ERROR: tienes que introducir un numero entre 1 y 9");
				}
			} catch (NumberFormatException e) {
				System.out.println("Debes introducir un numero entre 1 y 9");
			}
		}
		
		return opcion;
	}

	// Metodo para agregar elementos
	private static void agregarElemento() throws IOException { // 1
		/* Solicitará al usuario el elemento a insertar al final de la lista. */
		System.out.print("Dime el número que quieres añadir: ");
		double numero = Double.parseDouble(entrada.readLine().replace(',', '.')); // Replace para que deje poner comas
																					// en vez de puntos

		lista.add(numero);
		System.out.println("*****Elemento añadido con éxito*****");
		System.out.println();

	}

	// Metodo para buscar elemento
	private static void buscarElemento() throws IOException { // 2
		/*
		 * Solicitará al usuario el elemento a buscar en la lista. Si lo encuentra,
		 * mostrará por pantalla la posición en la que se encuentra
		 */
		if (lista.isEmpty()) {
			System.out.println("La lista está vacia");
			System.out.println();
			return;
		}

		System.out.print("Dime el elemento que quieres buscar: ");
		double elemento = Double.parseDouble(entrada.readLine().replace(',', '.'));
		int posicion = -1;
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == elemento) { //El .get devuelve el numero que hay en la posicion que le pasemos
				posicion = i + 1;
			}
		}
		
		if (elemento != -1) {
			System.out.println("La posición de " + elemento + " es: " + posicion);
			System.out.println();
		}else {
			System.out.println("El elemento " + elemento + " no está en la lista");
			System.out.println();
		}
	}
	
	// Metodo para modificar elemento
	private static void modificarElemento() throws IOException { // 3
		/*
		 * Solicitará al usuario el elemento a modificar en la lista. Si lo encuentra,
		 * solicitará al usuario el nuevo valor del elemento de la lista.
		 */

		if (lista.isEmpty()) {
			System.out.println("La lista está vacia");
			System.out.println();
			return;
		}
		
		System.out.print("Dime el elemento que quieres modificar: ");
		double elementoModif = Double.parseDouble(entrada.readLine().replace(',', '.'));
		int posicion = -1;
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == elementoModif) {
				posicion = i;
				break; //Para que cuando encuentre el numero deje de recorrer mas el arrayList
			}
		}
		
		if (posicion == -1) { //Para que diga que no lo ha encontrado
			System.out.println("Elemento no encontrado");
			System.out.println();
			return;
		}
		
		//Todo esto es para pedir el numero a cambiar si loencuentra
		System.out.print("Elemento encontrado. Dime porque elemento lo quieres cambiar: ");
		double elementoNuevo = Double.parseDouble(entrada.readLine().replace(',', '.'));
		
		lista.set(posicion, elementoNuevo); //Cambia el elemento de la posicion que le digamos por el nuevo que le digamos
		System.out.println("*****Elemento cambiado con éxito*****");
		System.out.println();
		
	}
	
	// Metodo para eliminar un elemento
	private static void eliminarElemento() throws IOException{ // 4
		/* Solicitará al usuario el elemento a eliminar de la lista. */

		if (lista.isEmpty()) {
			System.out.println("La lista está vacia");
			System.out.println();
			return;
		}
		
		System.out.print("Dime el elemento que quieres eliminar de la lista: ");
		double elementoEliminar = Double.parseDouble(entrada.readLine().replace(',', '.'));
		int numero = -1;
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == elementoEliminar) {
				numero = i;
				break;
			}
		}
		
		if (numero == -1) {
			System.out.println("No se ha encontrado el número");
			System.out.println();
			return;
		}
		
		lista.remove(numero);
		System.out.println("*****Elemento eliminado correctamente*****");
		System.out.println();
	}
	
	// Metodo para insertar un elemento
	private static void insertarElemento() throws IOException { // 5
		/*
		 * Solicitará al usuario el elemento a insertar y la posición en la que se
		 * insertará. Se debe comprobar si la posición es correcta, o dará un error.
		 */
		
		System.out.print("Dime el elemento que quieres insertar: ");
		double elementoNuevo = Double.parseDouble(entrada.readLine().replace(',', '.'));
		
		//Para pedir la posicion del elemento
		boolean posicionBien = false;
		int posElementoNuevo = 0;
		
		while (!posicionBien) {
			try {
				System.out.print("Dime la posición en la que quieres insertar este elemento (De 0 a" + lista.size() + ": ");
				posElementoNuevo = Integer.parseInt(entrada.readLine());
				
				if (posElementoNuevo >= 0 && posElementoNuevo <= lista.size()) {
					posicionBien = true;
				}else {
					System.out.println("ERROR: la posición debe estar entre 0 y " + lista.size());
				}
				
			} catch (NumberFormatException e) {
				System.out.println("La posición tiene que ser un número entero");			}
		}
		
		//Añadimos el elemento en la posicion
		lista.add(posElementoNuevo, elementoNuevo);
		System.out.println("*****Elemento añadido correctamente*****");
		System.out.println();
	}

	// Metodo para mostrar en orden descendente
	private static void mostrarDescendente() { // 8
		// TODO Auto-generated method stub

	}

	// Mostrar array en orden ascendente
	private static void mostrarAscendente() { // 7
		// TODO Auto-generated method stub

	}

	// Metodo para mostrar un elemento
	private static void mostrarElementos() { // 6
		/*
		 * Utiliza el método que prefieras para recorrer la lista. Deberá mostrar si la
		 * lista está vacía.
		 */

	}

}
