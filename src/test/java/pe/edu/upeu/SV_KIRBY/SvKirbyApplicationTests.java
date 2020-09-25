package pe.edu.upeu.SV_KIRBY;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SV_KIRBY.dao.PersonaDao;
import pe.edu.upeu.SV_KIRBY.entity.Persona;




@SpringBootTest
class SvKirbyApplicationTests {
	@Autowired
	private PersonaDao personaDao;
    @Test
    void contextLoads() {

        Persona e = new Persona();
        e.setIdpersona(1);
        e.setNombres("Alessandro");
        e.setApellidos("Caceres");
        e.setDni("76588987");
        System.out.println(personaDao.update(e));
	}

}
	