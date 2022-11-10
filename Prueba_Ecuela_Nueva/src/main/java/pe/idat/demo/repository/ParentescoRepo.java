package pe.idat.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.idat.demo.entity.Parentesco;

public interface ParentescoRepo extends JpaRepository<Parentesco, Long> {

    @Query("select p from Parentesco p where p.estado=1")
    List<Parentesco> findAllCustom();
}