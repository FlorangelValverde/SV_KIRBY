package pe.edu.upeu.SV_KIRBY.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.SV_KIRBY.dao.Detalle_ventasDao;
import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;
@Repository
public class Detalle_ventasDaoImp implements Detalle_ventasDao{
@Autowired


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
		return null;
	}
	

}
