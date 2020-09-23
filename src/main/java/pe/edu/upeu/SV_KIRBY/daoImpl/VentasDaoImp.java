package pe.edu.upeu.SV_KIRBY.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.SV_KIRBY.dao.VentasDao;
import pe.edu.upeu.SV_KIRBY.entity.Ventas;
@Repository
public class VentasDaoImp implements VentasDao{
@Autowired


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
		return null;
	}

}
