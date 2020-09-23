package pe.edu.upeu.SV_KIRBY.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.SV_KIRBY.dao.Detalle_ventasDao;
import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;
import pe.edu.upeu.SV_KIRBY.service.Detalle_ventasService;

public class Detalle_ventasServiceImpl implements Detalle_ventasService {
@Autowired
private Detalle_ventasDao detalle_ventasDao;
	@Override
	public int create(Detalle_ventas r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Detalle_ventas r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle_ventas read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_ventasDao.readAll();
	}

}
