package pe.edu.upeu.SV_KIRBY.service;

import java.util.List;
import java.util.Map;


import pe.edu.upeu.SV_KIRBY.entity.Usuario;

public interface UsuarioService {
	 int create(Usuario r);

	    int update(Usuario r);

	    int delete(int id);

	    Usuario read(int id);

	    List<Map<String, Object>> readAll();


}
