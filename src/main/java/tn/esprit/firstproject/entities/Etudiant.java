package tn.esprit.firstproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@ToString
@Entity
@Table( name = "Etudiant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Etudiant implements Serializable { //transformer le code en forme byte ll sécurité
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private
    Integer idEtudiant; // Clé primaire
    @Column(name = "prenom")
    private
    String prenomE;
    @Column(name = "nom")
    private
    String nomE;
    @Enumerated(EnumType.STRING)
    private
    Option op;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToMany
    private Set<Equipe> equipes;

}