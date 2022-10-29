package tn.esprit.firstproject.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Table( name = "DetailEquipe")
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    Integer idDetailEquipe; // Clé primaire
    Integer salle;
    String thermatique;
    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
}
