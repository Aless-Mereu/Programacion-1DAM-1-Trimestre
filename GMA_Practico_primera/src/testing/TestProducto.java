package testing;

import javabean.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(123456,"camiseta verde",23,34.99,"M","azul");
		Producto producto2 = new Producto();
		
		producto2.setCantidadStock(20);
		producto2.setCodigoDeBarras(654321);
		producto2.setColor("negro");
		producto2.setDescripcion("pantalon");
		producto2.setPrecioUnitario(100);
		producto2.setTalla("L");
		
		System.out.println(producto1);
		
		producto2.precioConIva(21); //121
		System.out.println(producto2.precioConIva(21));
		
		producto1.aumentarStock(200); //223
		System.out.println(producto1.getCantidadStock());
		
		producto1.disminuirStock(50); //True 173
		System.out.println(producto1.getCantidadStock());
		
		producto1.disminuirStock(180); //False 173
		System.out.println(producto1.getCantidadStock());
		
		
        System.out.println(producto2.precioAplicado());
        System.out.println("---------------------------------");
        System.out.println("Precio aplicado con Array");
        String [] tallas = {"XS","S", "M", "L","XL","XXL","XXXL"};
        
        for (String talla: tallas) {
        	producto2.setTalla(talla);
        	System.out.println(producto2.getTalla() + "-" + producto2.precioAplicado());
        }
     }
}


