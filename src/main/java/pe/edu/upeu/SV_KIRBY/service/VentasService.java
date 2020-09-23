package pe.edu.upeu.SV_KIRBY.service;

import java.util.List;
import java.util.Map;


import pe.edu.upeu.SV_KIRBY.entity.Ventas;

public interface VentasService {
	 int create(Ventas r);

	    int update(Ventas r);

	    int delete(int id);

	    Ventas read(int id);

	    List<Map<String, Object>> readAll();

}
