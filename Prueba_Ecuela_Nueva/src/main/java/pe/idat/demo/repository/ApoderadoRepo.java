package pe.idat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.idat.demo.entity.Apoderado;

public interface ApoderadoRepo extends JpaRepository<Apoderado, Long> {

    @Query("select a from Apoderado a where a.estado=1")
    List<Apoderado> findAllCustom();
}
