package pe.edu.upeu.SV_KIRBY.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;

public interface Detalle_ventasService {

	int create (Detalle_ventas d);
	int update (Detalle_ventas d);
	int delete (int id);
	Detalle_ventas read (int id);
	List<Map<String, Object>> readAll();
}
