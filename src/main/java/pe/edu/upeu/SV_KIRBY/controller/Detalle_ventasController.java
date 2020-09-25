package pe.edu.upeu.SV_KIRBY.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
