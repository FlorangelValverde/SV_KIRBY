package pe.edu.upeu.SV_KIRBY.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.SV_KIRBY.dao.PersonaDao;
import pe.edu.upeu.SV_KIRBY.entity.Persona;
@Repository
public class PersonaDaoImp implements PersonaDao {
@Autowired
private JdbcTemplate JdbcTemplate;
	@Override
	public int create(Persona e) {
		// TODO Auto-generated method stub
		String SQL = "insert into persona (nombres, apellidos, dni) values (?,?,?)";
		return JdbcTemplate.update(SQL, e.getNombres(), e.getApellidos(), e.getDni());
	}

	@Override
	public int update(Persona e) {
		// TODO Auto-generated method stub
		String SQL = "update persona set nombres =?, apellidos =?, dni =? where idpersona=?";
		return JdbcTemplate.update(SQL,e.getNombres(),e.getApellidos(), e.getDni(), e.getIdpersona());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from persona where idpersona=?";
		return JdbcTemplate.update(SQL,id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from persona where idpersona=?";
		return JdbcTemplate.queryForObject(SQL, new Object [] {id}, new BeanPropertyRowMapper<Persona>(Persona.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select*from persona";
		return JdbcTemplate.queryForList(SQL);
	}

}
