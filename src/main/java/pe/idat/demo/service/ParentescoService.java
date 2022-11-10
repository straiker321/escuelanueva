package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;

import pe.idat.demo.entity.Parentesco;

public interface ParentescoService {

    List<Parentesco> findAll();

    List<Parentesco> findAllCustom();

    Optional<Parentesco> findById(Long id);

    Parentesco add(Parentesco p);

    Parentesco update(Parentesco p);

    Parentesco delete(Parentesco p);
}