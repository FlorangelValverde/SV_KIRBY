package pe.edu.upeu.SV_KIRBY;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SV_KIRBY.dao.RolDao;
import pe.edu.upeu.SV_KIRBY.entity.Rol;
import pe.edu.upeu.SV_KIRBY.service.RolService;

@SpringBootTest
class SvKirbyApplicationTests {
@Autowired
	private RolService rolDao;
	@Test
	void contextLoads() {
		/*
		Rol r = new Rol();
		r.setNombre("Administrador");
		System.out.println(rolDao.create(r));
		*/
		System.out.println(rolDao.readAll());
	}

}
