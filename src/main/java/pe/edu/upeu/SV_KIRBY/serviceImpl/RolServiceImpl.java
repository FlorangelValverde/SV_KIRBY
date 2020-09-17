package pe.edu.upeu.SV_KIRBY.serviceImpl;

import java.util.Map;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.SV_KIRBY.service.RolService;
import pe.edu.upeu.SV_KIRBY.dao.RolDao;
import pe.edu.upeu.SV_KIRBY.entity.Rol;
@Service
public class RolServiceImpl implements RolService{
@Autowired
private RolDao rolDao;

	@Override
	public int  create(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override 
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override 
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override 
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	public List<Map<String,Object>>readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}
	
}
