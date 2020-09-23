package pe.edu.upeu.SV_KIRBY.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.SV_KIRBY.entity.Rol;
import pe.edu.upeu.SV_KIRBY.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/lista")
    public List<Map<String, Object>>listar(){
        return rolService.readAll();
    }
    @GetMapping("/{id}")
    public Rol read(@PathVariable int id) {
    	return rolService.read(id);
    }
}