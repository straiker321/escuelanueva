package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.demo.entity.Apoderado;
import pe.idat.demo.repository.ApoderadoRepo;
@Service
public class ApoderadoServiceImpl implements ApoderadoService{

    @Autowired
    private ApoderadoRepo repositorioapoderado;
    @Override
    public List<Apoderado> findAll() {
        return repositorioapoderado.findAll();
    }

    @Override
    public List<Apoderado> findAllCustom() {
        return repositorioapoderado.findAllCustom();
    }

    @Override
    public Optional<Apoderado> findById(Long id) {
        return repositorioapoderado.findById(id);
    }

    @Override
    public Apoderado add(Apoderado a) {
        return repositorioapoderado.save(a);
    }

    @Override
    public Apoderado update(Apoderado a) {
        Apoderado objapoderado = repositorioapoderado.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objapoderado);
        return repositorioapoderado.save(objapoderado);
    }

    @Override
    public Apoderado delete(Apoderado a) {
        Apoderado objapoderado = repositorioapoderado.getById(a.getCodigo());
        objapoderado.setEstado(false);
        return repositorioapoderado.save(objapoderado);

    }
    
}
