package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;

import pe.idat.demo.entity.Apoderado;

public interface ApoderadoService {
    List<Apoderado> findAll();

    List<Apoderado> findAllCustom();

    Optional<Apoderado> findById(Long id);

    Apoderado add(Apoderado a);

    Apoderado update(Apoderado a);

    Apoderado delete(Apoderado a);
}
