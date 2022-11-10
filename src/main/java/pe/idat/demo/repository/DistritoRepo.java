package pe.idat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.idat.demo.entity.Distrito;

public interface DistritoRepo extends JpaRepository<Distrito, Long> {

    @Query("select d from Distrito d where d.estado=1")
    List<Distrito> findAllCustom();
}
