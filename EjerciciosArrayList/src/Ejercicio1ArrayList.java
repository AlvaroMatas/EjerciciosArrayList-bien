import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1ArrayList {

	public static void main(String[] args) {

		
	}
	
	//Metodo para rellenar el arrayList
	public static ArrayList<Integer> leerValores() throws IOException{
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
			
		System.out.println("Dime el valor que vas a introducir, -99 dejas de introducir");
		int numero = Integer.parseInt(entrada.readLine());
			
		while (numero != -99) {
			listaNumeros.add(numero);
			
			numero = Integer.parseInt(entrada.readLine());
		}
		
		return listaNumeros;
	}
	
	//Metodo para calcular la suma
	public int calcularSuma(ArrayList<Integer> listaNumeros) {
		
		int suma = 0;
		
		Iterator<Integer> it = listaNumeros.iterator(); //Para recorrer el arrayList
		
		while (it.hasNext()) { //Le pregunta si hay un elemento despues del que está
			int valor = it.next(); //Avanza una posicion y devuelve el que acaba de pasar
			suma += valor;
		}
		
		return suma;
	}

}
