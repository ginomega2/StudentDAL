package com.apol.student.dal.entities;


import javax.persistence.*;

@Entity
@Table(name = "studenttab")
public class Student {

    //******* PROPIEDADES DE ESTUDIANTE  ************
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sname")
    private String name;
    @Column(name = "scurso")
    private String curso;
    private double mensualidad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", curso='" + curso + '\'' +
                ", mensualidad=" + mensualidad +
                '}';
    }
}
