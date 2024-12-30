/*Ejercicio 4.
•	Leer números hasta que se introduzca un cero. Para cada uno indicar si es par o impar. 
	Al final mostrar las siguientes Estadísticas:
o	cuantos son pares e impares
o	cuanto suman los pares y cuanto los impares.*/

package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int pares = 0, impares = 0, sumapares = 0, sumaimpares = 0;

		System.out.println("Escribe un número ENTERO, si escribes 0 se termina el programa.");
		int numero = entrada.nextInt(); // declaro el tipo de variable.

		while (numero != 0) { // comienza el bucle y...

			if (numero % 2 == 0) {
				pares++;
				sumapares+=numero;
				
			} else {
				impares++;
				sumaimpares += numero;
			}	
			
			

			System.out.println("Escribe un número ENTERO, si escribes 0 se termina el programa");
			numero = entrada.nextInt();// aquí NO hay que declarar otra vez el tipo de variable, ya que se duplica.
		} // ... como termina aquí, hay que escribir/leer de nuevo para que no termine
			// hasta que se cumpla la condición.

		System.out.println("La cantidad de números pares es: " + pares);
		System.out.println("La cantidad de números impares es: " + impares);
		System.out.println("La suma de los numeros pares es " + sumapares);
		System.out.println("La suma de los numeros impares es " + sumaimpares);
		entrada.close();
	}

}
