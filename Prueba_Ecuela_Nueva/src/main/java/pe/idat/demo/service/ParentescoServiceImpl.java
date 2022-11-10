package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.demo.entity.Parentesco;
import pe.idat.demo.repository.ParentescoRepo;

@Service
public class ParentescoServiceImpl implements ParentescoService {

	@Autowired
    private ParentescoRepo repositorioparentesco;
    @Override
    public List<Parentesco> findAll() {
        return repositorioparentesco.findAll();
    }

    @Override
    public List<Parentesco> findAllCustom() {
        return repositorioparentesco.findAllCustom();
    }

    @Override
    public Optional<Parentesco> findById(Long id) {
        return repositorioparentesco.findById(id);
    }

    @Override
    public Parentesco add(Parentesco p) {
        return repositorioparentesco.save(p);
    }

    @Override
    public Parentesco update(Parentesco p) {
        Parentesco objparentesco = repositorioparentesco.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objparentesco);
        return repositorioparentesco.save(objparentesco);
    }

    @Override
    public Parentesco delete(Parentesco p) {
        Parentesco objparentesco = repositorioparentesco.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return repositorioparentesco.save(objparentesco);
    }
    

}
