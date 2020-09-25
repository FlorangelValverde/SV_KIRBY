package pe.edu.upeu.SV_KIRBY.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SV_KIRBY.entity.Producto;



public interface ProductoDao {
	 int create (Producto p);
	    int update (Producto p);
	    int delete (int id);
	    Producto read (int id);
	    List<Map<String, Object>>readAll();
	}
