package com.aston.java.spring.orm.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;
import lombok.experimental.FieldDefaults;



/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = {"prenom"})
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String prenom;

    public Employe() {
    }
}
