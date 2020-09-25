package pe.edu.upeu.SV_KIRBY.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SV_KIRBY.entity.Producto;
public interface ProductoService {

	int create (Producto p);
	int update (Producto p);
	int delete (int id);
	Producto read (int id);
	List<Map<String, Object>> readAll();
}
