package com.sena.laboratorio.model;
import jakarta.persistence.*;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Usuario{
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Id
private Integer id;
private String nombre;
private String correo;
private String telefono;
private String ciudad;
private LocalDate fechaNacimiento;
public Usuario(){}
}