package pe.edu.upeu.SV_KIRBY.entity;

public class Rol {
private int idrol;
private String nombre;
public Rol() {
	
}
public Rol (int idrol, String nombre) {
	super();
	this.idrol=idrol;
	this.nombre=nombre;
}
public int getIdrol() {
	return idrol;
}
public void setIdrol (int idrol) {
	this.idrol=idrol;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
}
