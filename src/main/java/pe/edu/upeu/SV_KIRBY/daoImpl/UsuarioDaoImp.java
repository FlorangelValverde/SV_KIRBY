package pe.edu.upeu.SV_KIRBY.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.SV_KIRBY.dao.UsuarioDao;
import pe.edu.upeu.SV_KIRBY.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao {
@Autowired
private JdbcTemplate JdbcTemplate;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "insert into usuario (nomuser, clave, estado,idrol) values(?,?,?,?)";
		return 	JdbcTemplate.update(SQL,u.getNomuser(), u.getClave(), u.getEstado(), u.getIdrol());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "update usuario set nomuser =?, clave =? where idpersona=?";
		return JdbcTemplate.update(SQL, u.getNomuser(), u.getClave(), u.getIdpersona());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from usuario where idpersona=?";
		return JdbcTemplate.update(SQL,id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where idpersona=?";
		return JdbcTemplate.queryForObject(SQL, new Object [] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario";
		return JdbcTemplate.queryForList(SQL);
	}

}
