package pe.edu.upeu.SV_KIRBY.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;


public interface Detalle_ventasDao {
	 int create (Detalle_ventas r);
	    int update (Detalle_ventas r);
	    int delete (int id);
	    Detalle_ventas read (int id);
	    List<Map<String, Object>>readAll();
	}


