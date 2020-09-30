package pe.edu.upeu.SV_KIRBY;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SV_KIRBY.dao.Detalle_ventasDao;
import pe.edu.upeu.SV_KIRBY.dao.PersonaDao;
import pe.edu.upeu.SV_KIRBY.dao.ProductoDao;
import pe.edu.upeu.SV_KIRBY.dao.RolDao;
import pe.edu.upeu.SV_KIRBY.dao.UsuarioDao;
import pe.edu.upeu.SV_KIRBY.dao.VentasDao;
import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;
import pe.edu.upeu.SV_KIRBY.entity.Persona;
import pe.edu.upeu.SV_KIRBY.entity.Producto;
import pe.edu.upeu.SV_KIRBY.entity.Rol;
import pe.edu.upeu.SV_KIRBY.entity.Usuario;
import pe.edu.upeu.SV_KIRBY.entity.Ventas;
import pe.edu.upeu.SV_KIRBY.service.RolService;

@SpringBootTest
class SvKirbyApplicationTests {
@Autowired
	private Detalle_ventasDao detalle_ventasDao;
	@Test
	void contextLoads() {
		
		Detalle_ventas d = new Detalle_ventas();
		d.setIddetalle_ventas(1);
		d.setPrecio(20.50);
		d.setCantidad(5);
		d.setSubtotal(102.5);
		System.out.println(detalle_ventasDao.update(d));

		//System.out.println(personaDao.read(1).getApellidos());
	}
}
