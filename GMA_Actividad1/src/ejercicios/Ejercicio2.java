/*Ejercicio 2.
•	Diseñar un programa que muestre el producto y la suma de los 10 primeros números 
impares.
*/

package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		int cont = 0, suma = 0, prod = 1, num1 = 1;

		while (cont < 10) { // Contamos dede el número 0 hasta 9.
			/*
			 * System.out.println("cont " + cont); System.out.println("num1 " + num1);
			 * System.out.println("prod " + prod);
			 */

			suma += num1; // equivalente a suma = suma + num1
			prod *= num1;
			cont++;
			num1 += 2; // OJO! Incrementar en 2 para sumar solo impares!!
		}

		System.out.println("La suma de los primeros 10 números impares es: " + suma);
		System.out.println("El producto de los primeros 10 números impares es: " + prod);

	}

}
