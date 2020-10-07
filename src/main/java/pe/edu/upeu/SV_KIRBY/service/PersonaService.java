package pe.edu.upeu.SV_KIRBY.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.SV_KIRBY.entity.Persona;



public interface PersonaService {
	int create(Persona e);

    int update(Persona e);

    int delete(int id);

    Persona read(int id);

    List<Map<String, Object>> readAll();

}



