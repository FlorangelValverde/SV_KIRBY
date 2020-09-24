package pe.edu.upeu.SV_KIRBY.entity;

public class Producto {
private String nomprod;
private double precio;
private int cantidad;
private int idproducto;
public Producto() {
	
}
public Producto (int idproducto, String nomprod, double precio, int cantidad) {
	super();
	this.idproducto=idproducto;
	this.nomprod=nomprod;
	this.setPrecio(precio);
	this.setCantidad(cantidad);
}
public int getIdproducto() {
	return idproducto;
}
public void setIdproducto (int idproducto) {
	this.idproducto=idproducto;
}
public String getNomprod() {
	return nomprod;
}
public void setNomprod (String nomprod) {
	this.nomprod=nomprod;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

}
