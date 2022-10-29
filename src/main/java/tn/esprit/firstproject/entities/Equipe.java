package tn.esprit.firstproject.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Equipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    Integer idEquipe; // Clé primaire
    String nomEquipe;
    @Enumerated(EnumType.STRING)
    Niveau niveau;
    @OneToOne
    DetailEquipe detailEquipe;
    @ManyToMany(mappedBy = "equipes")
    Set<Etudiant> etudiants;
}
