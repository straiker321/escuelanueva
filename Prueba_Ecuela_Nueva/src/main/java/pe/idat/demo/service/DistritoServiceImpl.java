package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.demo.entity.Distrito;
import pe.idat.demo.repository.DistritoRepo;


@Service
public class DistritoServiceImpl implements DistritoService {

	@Autowired
    private DistritoRepo repositoriodistrito;

    @Override
    public List<Distrito> findAll() {
        return repositoriodistrito.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return repositoriodistrito.findAllCustom();
    }

    @Override
    public Optional<Distrito> findById(Long id) {
        return repositoriodistrito.findById(id);
    }

    @Override
    public Distrito add(Distrito d) {
        return repositoriodistrito.save(d);
    }

    @Override
    public Distrito update(Distrito d) {
        Distrito objdistrito= repositoriodistrito.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return repositoriodistrito.save(objdistrito);
    }

    @Override
    public Distrito delete(Distrito d) {
        Distrito objdistrito= repositoriodistrito.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return repositoriodistrito.save(objdistrito);    
    }
}
