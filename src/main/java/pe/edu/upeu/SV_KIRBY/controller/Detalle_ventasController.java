package pe.edu.upeu.SV_KIRBY.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.SV_KIRBY.entity.Detalle_ventas;
import pe.edu.upeu.SV_KIRBY.service.Detalle_ventasService;

@RestController
@RequestMapping("/detalle_ventas")
public class Detalle_ventasController {

	@Autowired
	private Detalle_ventasService detalle_ventasService;
	
	@GetMapping("/lista")
	public List<Map<String, Object>> listar(){
		return detalle_ventasService.readAll();
	}
	@GetMapping("/{id}")
	public Detalle_ventas read (@PathVariable int id) {
		return detalle_ventasService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete (@PathVariable int id) {
		return detalle_ventasService.delete(id);
	}
	@PostMapping("/detalle_venta")
	public int create (@RequestBody Detalle_ventas detalle_ventas) {
		return detalle_ventasService.create(detalle_ventas);
	}
	@PutMapping("edit/{id}")
	public int update (@RequestBody Detalle_ventas detalle_ventas, @PathVariable int id) {
		Detalle_ventas d = detalle_ventasService.read(id);
		d.setCantidad(detalle_ventas.getCantidad());
		d.setPrecio(detalle_ventas.getPrecio());
		d.setSubtotal(detalle_ventas.getSubtotal());
		return detalle_ventasService.update(d);
	}
}
