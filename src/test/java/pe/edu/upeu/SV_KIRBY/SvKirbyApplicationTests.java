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
	private RolDao rolDao;
	@Test
	void contextLoads() {
		
		Rol r = new Rol();
		r.setIdrol(3);
		r.setNomrol("Vendedor 3");
		System.out.println(rolDao.delete(3));
		
		//System.out.println(rolDao.read(1).getNomrol());
	}

}
