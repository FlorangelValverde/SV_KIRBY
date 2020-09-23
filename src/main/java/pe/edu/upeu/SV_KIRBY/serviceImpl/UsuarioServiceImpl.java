package pe.edu.upeu.SV_KIRBY.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.SV_KIRBY.dao.UsuarioDao;
import pe.edu.upeu.SV_KIRBY.entity.Usuario;
import pe.edu.upeu.SV_KIRBY.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{
@Autowired
private UsuarioDao usuarioDao;
	@Override
	public int create(Usuario r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

}
