package pe.edu.upeu.SV_KIRBY;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SV_KIRBY.dao.Detalle_ventasDao;
import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;



@SpringBootTest
class SvKirbyApplicationTests {
	@Autowired
	private Detalle_ventasDao detalle_ventasDao;
    @Test
    void contextLoads() {

		Detalle_ventas d = new Detalle_ventas();
		d.setPrecio(5.50);
		d.setCantidad(3);
		d.setSubtotal(16.50);
		d.setIdventas(6);
		d.setIdproducto(2);
		
		
		
		 System.out.println(detalle_ventasDao.create(d));


		
	}
}

