//IGNORAR ESTO PARA SER EVALUADO.

/*Pruebas para meter atributos de las clases LocalDateTime y poder
 * crear un objeto con formato (DateTimeFormatter)*/



package pruebasfiesta;

import java.time.LocalDateTime;


public class TestFiestaPrueba {

	public static void main(String[] args) {
		FiestaPrueba fest1,fest2;
		
		
		fest1= new FiestaPrueba();
		fest1.setBebidas(32);
		fest1.setBocadillos(30);
		fest1.setDireccion("Gran Avenida 54");
		fest1.setFechaHora(LocalDateTime.of(2024, 12 , 20 , 18 , 00));
		fest1.setInvitados(28);
		fest1.setTipoFiesta("Infantil");
		fest1.invitar();
		fest1.cancelarInvitacion(5);
		
		
		
		fest2= new FiestaPrueba();
		fest2.setBebidas(121);
		fest2.setBocadillos(5);
		fest2.setDireccion("Armando Guerra 15");
		
		fest2.setInvitados(31);
		fest2.setTipoFiesta("Despedida soltero");
		fest2.invitar(3);
		fest2.cancelarInvitacion();
		
		
		FiestaPrueba fest3 = new FiestaPrueba("Disfraces","Paquito el Chocolatero 22"
		,43,50,35,"","");/*No me gusta, prefiero el metodo orco.*/
		
		
	
		
		System.out.println(fest1);
		System.out.println(fest2);
		System.out.println(fest3);
		System.out.println("-------------------------------------------------");
		System.out.println("El precio de la fiesta infantil es: " + 
		fest1.precioFiesta() + " euros");
		System.out.println("El precio de la despedida soltero es: " + 
		fest2.precioFiesta() +" euros");
		System.out.println("El precio de la fiesta de disfraces es: "  + 
		fest3.precioFiesta()+ " euros");
		
	}
	}


