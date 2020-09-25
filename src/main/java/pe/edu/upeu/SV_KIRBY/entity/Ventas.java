package pe.edu.upeu.SV_KIRBY.entity;

public class Ventas {
	private int idventas;
	private String fecha;
	private char tipodoc;
	private String numdoc;
	private int idpersona;
	private int idcliente;
	public Ventas() {
	
	}
	public Ventas(int idventas, String fecha, char tipodoc, String numdoc, int idpersona, int idcliente) {
		super();
		this.idventas = idventas;
		this.fecha = fecha;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
		this.idpersona = idpersona;
		this.idcliente = idcliente;
	}
	public int getIdventas() {
		return idventas;
	}
	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public char getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(char tipodoc) {
		this.tipodoc = tipodoc;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	

}
