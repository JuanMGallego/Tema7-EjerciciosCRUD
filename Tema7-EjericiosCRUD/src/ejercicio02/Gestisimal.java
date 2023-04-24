package ejercicio02;

public class Gestisimal {

	String codigo;
	
	String desc;
	
	double precioCompra;
	
	double precioVenta;
	
	int stock;

	public Gestisimal() {
		super();
	}

	public Gestisimal(String codigo, String desc, double precioCompra, double precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.desc = desc;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + 
				"\nDescripción: " + desc + 
				"\nPrecio de compra: " + precioCompra + 
				"\nPrecio de venta: " + precioVenta + 
				"\nUnidades: " + stock;
	}
	
}
