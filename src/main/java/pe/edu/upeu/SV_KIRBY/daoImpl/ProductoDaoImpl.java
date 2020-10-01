package pe.edu.upeu.SV_KIRBY.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.SV_KIRBY.dao.ProductoDao;
import pe.edu.upeu.SV_KIRBY.entity.Producto;
@Repository
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private JdbcTemplate JdbcTemplate;
	    @Override
	    public int create(Producto p) {
	        // TODO Auto-generated method stub
	        String SQL = "insert into producto (nomprod, precio, cantidad) values (?,?,?)";
	        return JdbcTemplate.update(SQL,p.getNomprod(), p.getPrecio(), p.getCantidad());
	    }

	    @Override
	    public int update(Producto p) {
	        // TODO Auto-generated method stub
	        String SQL = "update producto set nomprod =?, precio =?, cantidad =? where idproducto=?";
	        return JdbcTemplate.update(SQL, p.getNomprod(), p.getPrecio(), p.getCantidad(), p.getIdproducto());
	    }

	    @Override
	    public int delete(int id) {
	        // TODO Auto-generated method stub
	        String SQL = "delete from producto where idproducto=?";
	        return JdbcTemplate.update(SQL,id);
	    }

	    @Override
	    public Producto read (int id) {
	        // TODO Auto-generated method stub
	        String SQL = "select ¨from producto where idrol =?";
	        return JdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Producto>(Producto.class));
	    }
	    @Override
	    public List<Map<String, Object>> readAll() {
	        // TODO Auto-generated method stub
	        String SQL = "select * from producto";
	        return JdbcTemplate.queryForList(SQL);
	    }

	}