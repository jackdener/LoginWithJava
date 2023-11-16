// Usuario.java
package com.example.integracao.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Usuario {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long cod;
 private String username;
 private String password;
}
