package tn.esprit.firstproject.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    Integer idContrat; // Clé primaire
   @Temporal(TemporalType.DATE)
    Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    Specialite  specialite;
    Boolean archive;
    Integer montantContrat;

    @ManyToOne
    Etudiant etudiant;
}
