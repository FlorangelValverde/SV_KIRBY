package pe.edu.upeu.SV_KIRBY.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.SV_KIRBY.dao.PersonaDao;
import pe.edu.upeu.SV_KIRBY.entity.Persona;
import pe.edu.upeu.SV_KIRBY.service.PersonaService;
@Service
public class PersonaServiceImpl implements PersonaService {
@Autowired
private PersonaDao personaDao;
	@Override
	public int create(Persona e) {
		// TODO Auto-generated method stub
		return personaDao.create(e);
	}

	@Override
	public int update(Persona e) {
		// TODO Auto-generated method stub
		return personaDao.update(e);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personaDao.delete(id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}

}
