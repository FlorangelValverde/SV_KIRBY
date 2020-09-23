package pe.edu.upeu.SV_KIRBY.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SV_KIRBY.entity.Usuario;

public interface UsuarioDao {
	 int create (Usuario r);
	    int update (Usuario r);
	    int delete (int id);
	    Usuario read (int id);
	    List<Map<String, Object>>readAll();
	}


