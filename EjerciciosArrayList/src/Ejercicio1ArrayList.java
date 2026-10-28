import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1ArrayList {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> lista = leerValores();
		
		mostrarResultados(lista);
 		
	}
	
	//Metodo para rellenar el arrayList
	public static ArrayList<Integer> leerValores() throws IOException{
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
			
		System.out.print("Dime el valor que vas a introducir, -99 dejas de introducir: ");
		int numero = Integer.parseInt(entrada.readLine());
			
		while (numero != -99) {
			listaNumeros.add(numero);
			
			System.out.print("Dime el valor: ");
			numero = Integer.parseInt(entrada.readLine());
		}
		
		return listaNumeros;
	}
	
	//Metodo para calcular la suma
	public static int calcularSuma(ArrayList<Integer> listaNumeros) {
		
		int suma = 0;
		
		Iterator<Integer> it = listaNumeros.iterator(); //Para recorrer el arrayList
		
		while (it.hasNext()) { //Le pregunta si hay un elemento despues del que está
			int valor = it.next(); //Avanza una posicion y devuelve el que acaba de pasar
			suma += valor;
		}
		
		return suma;
	}
	
	//Metodo para calcular la media
	public static double calcularMedia(ArrayList<Integer> listaNumeros) {
		
		int suma = calcularSuma(listaNumeros);
		double media = 0;
		
		if (listaNumeros.isEmpty()) { //Si esta vacia devuelve 0
			return 0;
		}
		
		media = (double)suma / listaNumeros.size();
		
		return media;
	}
	
	//Metodo para mostrar los datos y comprobar los numeros que son superiores a la media
	public static void mostrarResultados(ArrayList<Integer> listaNumeros) {
		
		int suma = calcularSuma(listaNumeros);
		double media = calcularMedia(listaNumeros);
		int numSupAMedia = 0;
		
		for (Integer num : listaNumeros) {
			if (num > media) {
				numSupAMedia++;
			}
		}
		
		System.out.println("El arraylist es el siguiente: " + listaNumeros);
		System.out.println("La suma de sus valores es: " + suma);
		System.out.printf("La media del arraylist es: %.2f", media);
		System.out.println();
		System.out.println("En el arraylist hay " + numSupAMedia + " números superiores a la media");
		
	}

}
