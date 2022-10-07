package com.example.microserv.entity;

import javax.persistence.*;

@Entity
@Table(catalog = "tambo", name = "cliente")
public class EntidadCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dni")
    private Integer aDNI;


    @Column(name = "telefono")
    private Integer aTelefono;

    @Column(name = "nombres")
    private String aNombres;

    @Column(name = "apellidop")
    private String aApellidoP;

    @Column(name = "apellidom")
    private String aApellidoM;

    @Column(name = "sexo")
    private String aSexo;//otro tipo de dato

    @Column(name = "direccion")
    private String aDireccion;

    @Column(name = "edad")
    private Integer aEdad;

    @Column(name = "correo")
    private String aCorreo;

    @Column(name = "nacimiento")
    private String aNacimiento;

    public String getaNombres() {
        return aNombres;
    }

    public void setaNombres(String aNombres) {
        this.aNombres = aNombres;
    }

    public Integer getaDNI() {
        return aDNI;
    }

    public void setaDNI(Integer aDNI) {
        this.aDNI = aDNI;
    }

    public Integer getaTelefono() {
        return aTelefono;
    }

    public void setaTelefono(Integer aTelefono) {
        this.aTelefono = aTelefono;
    }

    public String getaApellidoP() {
        return aApellidoP;
    }

    public void setaApellidoP(String aApellidoP) {
        this.aApellidoP = aApellidoP;
    }

    public String getaApellidoM() {
        return aApellidoM;
    }

    public void setaApellidoM(String aApellidoM) {
        this.aApellidoM = aApellidoM;
    }

    public String getaSexo() {
        return aSexo;
    }

    public void setaSexo(String aSexo) {
        this.aSexo = aSexo;
    }

    public String getaDireccion() {
        return aDireccion;
    }

    public void setaDireccion(String aDireccion) {
        this.aDireccion = aDireccion;
    }

    public Integer getaEdad() {
        return aEdad;
    }

    public void setaEdad(Integer aEdad) {
        this.aEdad = aEdad;
    }

    public String getaCorreo() {
        return aCorreo;
    }

    public void setaCorreo(String aCorreo) {
        this.aCorreo = aCorreo;
    }

    public String getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }
}
