package pe.edu.upeu.SV_KIRBY;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SV_KIRBY.dao.RolDao;
import pe.edu.upeu.SV_KIRBY.entity.Rol;




@SpringBootTest
class SvKirbyApplicationTests {
	@Autowired
    private RolDao rolDao;
    @Test
    void contextLoads() {

        Rol r = new Rol();
        r.setIdrol(9);
        r.setNomrol("Vendedor Nuevo");
        System.out.println(rolDao.delete(10));

    	//System.out.println(rolDao.read(1).getNomrol());	
    }
    }
