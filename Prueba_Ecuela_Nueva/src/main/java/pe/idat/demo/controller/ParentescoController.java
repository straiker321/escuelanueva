
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
import pe.idat.demo.entity.Parentesco;
import pe.idat.demo.service.ParentescoService;

@RestController
@RequestMapping("/parentesco")
public class ParentescoController {
    @Autowired
    private ParentescoService service;
    
    
    @GetMapping
    public List<Parentesco> findAll(){
        return service.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Parentesco> findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/custom") 
    public List<Parentesco> findAllCustom(){
        return service.findAllCustom(); 
    } 
    
    @PostMapping
    public Parentesco add(@RequestBody Parentesco p){ 
    return service.add(p); 
    }
    
    @PutMapping("/{id}")
    public Parentesco update(@PathVariable long id, @RequestBody Parentesco p) {
    	p.setCodigo(id);
    	return service.update(p);
    }
    @DeleteMapping("/{id}")
    public Parentesco delete(@PathVariable long id) {
    	Parentesco obj = new Parentesco();
    	obj.setEstado(false);
        return service.delete(Parentesco.builder().codigo(id).build());
    	
    }
}
