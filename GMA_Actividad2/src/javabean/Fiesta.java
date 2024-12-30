package javabean;


public class Fiesta {
	/*Atributos privados de la Clase. Encapsula los atributos, para poder
	 trabajar con ellos la clase proporciona métodos de clase */
	
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;
	
	
	/*Los métodos getters y setters permiten obtener y modificar los valores
	de los atributos privados de la clase Fiesta.
    setNombreAtributo; -> dar valor inicial o cambiar el valor existente 
    de un atributo.
    getNombreAtributo;-> me sirve para obtener el contenido de un atributo.*/
	
	public String getTipoFiesta() {
		return tipoFiesta;
	}
	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getBocadillos() {
		return bocadillos;
	}
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}
	public int getBebidas() {
		return bebidas;
	}
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	/*Los constructores inicializan los atributos de la clase, ya sea
	  con valores predeterminados (constructor por defecto) o con 
	  valores proporcionados por el usuario (constructor con parámetros).*/
	
	public Fiesta() {
		
	}
	
	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	
	/*El método toString() devuelve una representación en cadena del objeto Fiesta,
	 útil para depuración o para mostrar los datos de la fiesta.*/
	
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
	/*Los métodos invitar() y cancelarInvitacion() gestionan el número 
	 de invitados, aumentando o disminuyendo el contador. También hay 
	 versiones sobrecargadas que permiten añadir o restar varios 
	 invitados de una sola vez.*/
	
	public int invitar() {
		invitados++;
		return invitados;
	}
	
	public int cancelarInvitacion() {
		if (invitados >0) {
		invitados--;
	}
		return invitados;
		
	}
	
	public int invitar(int cantidad) {
		return invitados += cantidad;
	}
	
	public int cancelarInvitacion(int cantidad) {
		if (invitados > cantidad){
		return invitados -= cantidad;}
		return cantidad;
	}
	

	/*El método precioFiesta() calcula el costo total de la fiesta 
	 en función de los bocadillos, bebidas e invitados*/
	
	public int precioFiesta() {
		return invitados*5 + bebidas*2 + bocadillos*3;
	}
	
	
	
	
	

}
