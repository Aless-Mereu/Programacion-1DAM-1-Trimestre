/*Ejercicio 3.
•	Escribir todos los números del 100 al 0 de 7 en 7. Al final mostrar las siguientes Estadísticas.
o	Cuantos números has escrito
o	Cuanto suman los números escritos
o	Cuantos de estos números son pares.*/

package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {

		int cont = 0, suma = 0, par = 0;

		for (int i = 100; i > 0; i -= 7) {
			// System.out.println(i);// Meto esto, aunque no pida que imprima, para ver que
			// no la he liado y confirmar que recorre los números que requiere el ejercicio.
			cont++;
			suma += i;

			if (i % 2 == 0)
				par++;

		}
		System.out.println("---------------------ESTADÍSTICAS----------------------");
		System.out.println("Los números escritos son: " + cont);
		System.out.println("La suma de los números escritos es: " + suma);
		System.out.println("De los números escritos, los pares son: " + par);

	}

}
