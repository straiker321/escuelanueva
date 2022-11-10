package pe.idat.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.idat.demo.entity.Distrito;
import pe.idat.demo.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoService;
    
    @GetMapping
    public List<Distrito> findAll(){
        return distritoService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Distrito> findById(@PathVariable Long id){
        return distritoService.findById(id);
    }
    
    @GetMapping("/custom") 
    public List<Distrito> findAllCustom(){
        return distritoService.findAllCustom(); 
    } 
    
    @PostMapping
    public Distrito add(@RequestBody Distrito d){ 
    return distritoService.add(d); 
    }
    
    @PutMapping("/{id}")
    public Distrito update(@PathVariable long id, @RequestBody Distrito d) {
    	d.setCodigo(id);
    	return distritoService.update(d);
    }
    @DeleteMapping("/{id}")
    public Distrito delete(@PathVariable long id) {
    	Distrito objdistrito = new Distrito();
    	objdistrito.setEstado(false);
        return distritoService.delete(Distrito.builder().codigo(id).build());
    	
    }
    
}