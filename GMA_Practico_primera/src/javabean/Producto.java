package javabean;

public class Producto {
	
	private long codigoDeBarras;
	private String descripcion;
	private int cantidadStock;
	private double precioUnitario;
	private String talla;
	private String color;
	
	
	
	public Producto() {
		super();
	}

	public Producto(long codigoDeBarras, String descripcion, int cantidadStock, double precioUnitario, String talla,
			String color) {
		super();
		this.codigoDeBarras = codigoDeBarras;
		this.descripcion = descripcion;
		this.cantidadStock = cantidadStock;
		this.precioUnitario = precioUnitario;
		this.talla = talla;
		this.color = color;
	}
	
	

	public long getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

	@Override
	public String toString() {
		return "Producto [codigoDeBarras=" + codigoDeBarras + ", descripcion=" + descripcion + ", cantidadStock="
				+ cantidadStock + ", precioUnitario=" + precioUnitario + ", talla=" + talla + ", color=" + color + "]";
	}
	
	public double precioConIva(int iva) {
        return precioUnitario * (1 + iva / 100.0);
	}
	
	public void aumentarStock(int cantidad) {
        cantidadStock += cantidad;
    }
	
	
	public boolean disminuirStock(int cantidad) {
		if (cantidad > cantidadStock)
			return false;
		else {
			cantidadStock -= cantidad;
			return true;
		}

		
	}
	
	public double precioAplicado() {
		
        switch (talla) {
            case "S":
            case "M":
            case "L":
            case "XL":
                return precioUnitario * 1.03;
            case "XXL":
            case "XXXL":
                return precioUnitario * 1.04;
            default:
                return precioUnitario; 
        }
		
			
		
	}
	
	
	
	


}
