package pe.edu.upeu.SV_KIRBY.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.SV_KIRBY.dao.Detalle_ventasDao;
import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;

@Repository
public class Detalle_ventasDaoImpl implements Detalle_ventasDao {
	@Autowired
	private JdbcTemplate JdbcTemplate;
		@Override
		public int create(Detalle_ventas d) {
			// TODO Auto-generated method stub
			String SQL = "insert into detalle_ventas (precio, cantidad, subtotal, idventas, idproducto) values (?)";
			return JdbcTemplate.update(SQL,d.getPrecio(), d.getCantidad(), d.getSubtotal(), d.getIdventas(), d.getIdproducto());
		}

		@Override
		public int update(Detalle_ventas d) {
			// TODO Auto-generated method stub
			String SQL = "update detalle_ventas precio, cantidad, , idventas, idproducto =? where iddetalle_ventas";
			return JdbcTemplate.update(SQL, d.getPrecio(), d.getCantidad(), d.getIdventas(), d.getIdproducto(), d.getIddetalle_ventas());
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			String SQL = "delete from detalle_ventas where iddetalle_ventas=?";
			return JdbcTemplate.update(SQL,id);
		}

		@Override
		public Detalle_ventas read(int id) {
			// TODO Auto-generated method stub
			String SQL = "select * from detalle_ventas where iddetalle_ventas=?";
			return JdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Detalle_ventas>(Detalle_ventas.class));
		}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stubÇ
		String SQL = "select *from detalle_ventas";
		return JdbcTemplate.queryForList(SQL);
	}

}
