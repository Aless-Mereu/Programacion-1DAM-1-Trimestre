/*Ejercicio 1.
•	Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, 
Suficiente, Bien, Notable y sobresaliente. Si la nota introducida 
no está en el rango mostrar el mensaje “Nota errónea”.*/

package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); // Declarar clase Scanner, escribiendo directamente Scanner importa el
												// paquete java.util.
		System.out.println("Introduce la nota: ");
		Double nota = leer.nextDouble();

		if (nota < 5 && nota >= 0)
			System.out.println("Estás suspenso");
		else if (nota >= 5 && nota < 6) // Se puede colocar el "if" tabulado debajo del else, no recuerdo si es lo
										// standard, para mi es mas visual al lado.
			System.out.println("Tienes un Aprobado");
		else if (nota >= 6 && nota < 7)
			System.out.println("Tienes un Bien");
		else if (nota >= 7 && nota < 9)
			System.out.println("Tienes un Notable");
		else if (nota >= 9 && nota <= 10) {
			System.out.println("Tienes un Sobresaliente");
		} else {
			System.out.println("Nota incorrecta, por favor teclee la nota de nuevo.");
		}

		leer.close();

	}

}
