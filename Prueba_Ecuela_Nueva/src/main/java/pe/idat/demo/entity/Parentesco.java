package pe.idat.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Parentesco")
@Table(name = "parentesco")
public class Parentesco implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "codpar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "despar")
    private String descripcion;
    @Column(name = "estpar")
    private boolean estado;

   
    
}