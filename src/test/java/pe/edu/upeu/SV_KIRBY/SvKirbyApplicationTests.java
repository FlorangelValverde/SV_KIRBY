package pe.edu.upeu.SV_KIRBY;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SV_KIRBY.dao.PersonaDao;
import pe.edu.upeu.SV_KIRBY.dao.ProductoDao;
import pe.edu.upeu.SV_KIRBY.dao.RolDao;
import pe.edu.upeu.SV_KIRBY.dao.UsuarioDao;
import pe.edu.upeu.SV_KIRBY.entity.Persona;
import pe.edu.upeu.SV_KIRBY.entity.Producto;
import pe.edu.upeu.SV_KIRBY.entity.Rol;
import pe.edu.upeu.SV_KIRBY.entity.Usuario;
import pe.edu.upeu.SV_KIRBY.service.RolService;

@SpringBootTest
class SvKirbyApplicationTests {
@Autowired
	private ProductoDao productoDao;
	@Test
	void contextLoads() {
		
		Producto p = new Producto();
		p.setIdproducto(3);
		p.setNomprod("Lighstick");
		p.setPrecio(50);
		p.setCantidad(120);
		System.out.println(productoDao.update(p));

		//System.out.println(personaDao.read(1).getApellidos());
	}
}
