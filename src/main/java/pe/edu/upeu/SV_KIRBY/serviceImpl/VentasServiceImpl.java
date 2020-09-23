package pe.edu.upeu.SV_KIRBY.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.SV_KIRBY.dao.VentasDao;
import pe.edu.upeu.SV_KIRBY.entity.Ventas;

public class VentasServiceImpl implements VentasDao{
@Autowired
private VentasDao ventasDao;
	@Override
	public int create(Ventas r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Ventas r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ventasDao.readAll();
	}
	

}
