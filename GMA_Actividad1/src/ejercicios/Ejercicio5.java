package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		String usuario = "sara";
		String contraseña = "sarita";

		System.out.println("Escriba nombre de usuario");
		usuario = leer.next();

		if (usuario.equals("sara")) { // El método equals() de la clase String compara la cadena de texto contra un
										// objeto. Devolverá true si las cadenas comparadas son iguales. En caso
										// contrario devolverá false.
			System.out.println("Usuario correcto");
			System.out.println("Escribe una contraseña");
			contraseña = leer.next();
		} else {
			System.out.println("Usuario incorrecto");
		}

		if (contraseña.equals("sarita") && usuario.equals("sara"))
			System.out.println("Usuario y contraseña correctos"); // Comparación desigualdad de string contra objeto:
		else if (usuario.equals("sara") && !contraseña.equals("sarita")) // https://stackoverflow.com/questions/8484668/java-does-not-equal-not-working
			System.out.println("contraseña incorrecta");

		leer.close();
	}

}
