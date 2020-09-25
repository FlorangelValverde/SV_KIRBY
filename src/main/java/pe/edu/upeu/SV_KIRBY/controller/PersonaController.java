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

import pe.edu.upeu.SV_KIRBY.entity.Persona;
import pe.edu.upeu.SV_KIRBY.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/lista")
	public List<Map<String, Object>>listar(){
		return personaService.readAll();
	}
	@GetMapping("/{id}")
	public Persona read (@PathVariable int id) {
		return personaService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete (@PathVariable int id) {
		return personaService.delete(id);
	}
	@PostMapping("/persona")
	public int create (@RequestBody Persona persona) {
		return personaService.create(persona);
	}
	@PutMapping("edit/{id}")
	public int update (@RequestBody Persona persona, @PathVariable int id) {
		Persona e = personaService.read(id);
		e.setNombres(persona.getNombres());
		e.setApellidos(persona.getApellidos());
		e.setDni(persona.getDni());
		return personaService.update(e);
	}
}
