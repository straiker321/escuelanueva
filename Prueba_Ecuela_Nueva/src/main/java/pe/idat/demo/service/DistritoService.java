package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;

import pe.idat.demo.entity.Distrito;

public interface DistritoService {
	//funcion para mostrar todos los distritos
	 List<Distrito> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<Distrito> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<Distrito> findById(Long id);
	 //funcion para registrar
	 Distrito add(Distrito d);
	 //funcion para actualizar
	 Distrito update(Distrito d);
	 //funcion para eliminar
	 Distrito delete(Distrito d);
	}