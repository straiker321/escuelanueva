
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
import pe.idat.demo.entity.Apoderado;
import pe.idat.demo.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {
    @Autowired
    private ApoderadoService service;
    
    @GetMapping
    public List<Apoderado> findAll(){
        return service.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Apoderado> findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/custom") 
    public List<Apoderado> findAllCustom(){
        return service.findAllCustom(); 
    } 
    
    @PostMapping
    public Apoderado add(@RequestBody Apoderado a){ 
    return service.add(a); 
    }
    
    @PutMapping("/{id}")
    public Apoderado update(@PathVariable long id, @RequestBody Apoderado a) {
    	a.setCodigo(id);
    	return service.update(a);
    }
    @DeleteMapping("/{id}")
    public Apoderado delete(@PathVariable long id) {
    	Apoderado obj = new Apoderado();
    	obj.setEstado(false);
        return service.delete(Apoderado.builder().codigo(id).build());
    	
    }
}
