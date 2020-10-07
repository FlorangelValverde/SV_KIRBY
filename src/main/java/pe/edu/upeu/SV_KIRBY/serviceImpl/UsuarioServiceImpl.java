package pe.edu.upeu.SV_KIRBY.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.SV_KIRBY.dao.UsuarioDao;
import pe.edu.upeu.SV_KIRBY.entity.Usuario;
import pe.edu.upeu.SV_KIRBY.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService{
@Autowired
private UsuarioDao usuarioDao;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

}
