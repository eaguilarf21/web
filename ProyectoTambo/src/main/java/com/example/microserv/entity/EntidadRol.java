package com.example.microserv.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(catalog = "tambo", name = "rol")
public class EntidadRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrol")
    private Integer aIdRol;

    @Column(name = "nombrerol")
    private String aNombreRol;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<EntidadUsuarioRol> usuariorol;

    public Integer getaIdRol() {
        return aIdRol;
    }

    public void setaIdRol(Integer aIdRol) {
        this.aIdRol = aIdRol;
    }

    public String getaNombreRol() {
        return aNombreRol;
    }

    public void setaNombreRol(String aNombreRol) {
        this.aNombreRol = aNombreRol;
    }

    public Set<EntidadUsuarioRol> getUsuariorol() {
        return usuariorol;
    }

    public void setUsuariorol(Set<EntidadUsuarioRol> usuariorol) {
        this.usuariorol = usuariorol;
    }
}
