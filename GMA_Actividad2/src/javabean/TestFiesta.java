package javabean;


public class TestFiesta {

	public static void main(String[] args) {
	
		Fiesta fest1,fest2;
			
		fest1= new Fiesta();
		fest1.setBebidas(32);
		fest1.setBocadillos(30);
		fest1.setDireccion("Gran Avenida 54");
		fest1.setFecha("20-12-2014");
		fest1.setHora("17:00");
		fest1.setInvitados(28);
		fest1.setTipoFiesta("Infantil");
		
		fest1.invitar();
		fest1.cancelarInvitacion(5);
		
		
		fest2= new Fiesta();
		fest2.setBebidas(121);
		fest2.setBocadillos(5);
		fest2.setDireccion("Armando Guerra 15");
		fest2.setFecha("30-11-2024");
		fest2.setHora("21:30");
		fest2.setInvitados(31);
		fest2.setTipoFiesta("Despedida soltero");
		
		fest2.invitar(6);
		fest2.cancelarInvitacion();
		
		
		Fiesta fest3 = new Fiesta("Disfraces","Paquito el Chocolatero 22"
		,43,50,35,"14-02-2025","17:30");/* Prefiero el método orco.*/
		
		Fiesta fest4 = new Fiesta("Cena de empresa "," Julio Iglesias 78",
		60,130,30, "16-11-2024","21:00");
		fest4.setInvitados(34);
		
		System.out.println("------------------DETALLE DE LOS OBJETOS-------------------");
		System.out.println(fest1);
		System.out.println(fest2);
		System.out.println(fest3);
		System.out.println(fest4);
		
		System.out.println(" ");
		
		System.out.println("-------------------------PRECIOS DE LAS FIESTAS--------------------");
		System.out.println("El precio de la fiesta infantil es: " + 
		fest1.precioFiesta() + " euros");
		System.out.println("El precio de la despedida soltero es: " + 
		fest2.precioFiesta() +" euros");
		System.out.println("El precio de la fiesta de disfraces es: "  + 
		fest3.precioFiesta()+ " euros");
		System.out.println("El precio de la cena de empresa es: "  + 
		fest4.precioFiesta()+ " euros");
		
		System.out.println(" ");
		
		System.out.println("-----------------COMPROBACIONES ALEATORIAS--------------");
		System.out.println("la cantidad de bebidas consumidas en el cumpleaños"
		+ " es: " + fest1.getBebidas());
		System.out.println("Los invitados a la cena de empresa al final son: "
		+ fest4.getInvitados());
		
	}

}
