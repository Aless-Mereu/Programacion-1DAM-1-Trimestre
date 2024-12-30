

//IGNORAR ESTO PARA SER EVALUADO.

/*Pruebas para meter atributos de las clases LocalDateTime y poder
 * crear un objeto con formato (DateTimeFormatter)*/

package pruebasfiesta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FiestaPrueba {
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private LocalDateTime fechaHora;
	
	
	public void mostrarMomento() {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM=yyy+ HH:mm");
		System.out.println("Fecha y hora : " + fechaHora.format(formatter));
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
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
	
	
	
	public FiestaPrueba() {
		super();
	}
	
	public FiestaPrueba(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fechaHora = fechaHora;
	}
	
	
	
	
	@Override
	public String toString() {
		return "FiestaPrueba [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fechaHora=" + fechaHora + "]";
	}
	public int invitar() {
		return invitados+=1;
	}
	
	public int cancelarInvitacion() {
		return invitados-=1;
		
	}
	
	public int invitar(int cantidad) {
		return invitados += cantidad;
	}
	
	public int cancelarInvitacion(int cantidad) {
		return invitados -= cantidad;
	}
	
	public int precioFiesta() {
		return invitados*5 + bebidas*2 + bocadillos*3;
	}
	

	
	
	

}
