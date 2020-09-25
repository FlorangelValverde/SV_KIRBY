package pe.edu.upeu.SV_KIRBY.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SV_KIRBY.entity.Persona;

public interface PersonaDao {
	int create (Persona e);
	int update (Persona e);
	int delete (int id);
	Persona read (int id);
	List<Map<String, Object>>readAll();
}
