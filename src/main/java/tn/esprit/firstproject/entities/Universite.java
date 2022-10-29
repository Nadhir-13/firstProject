package tn.esprit.firstproject.entities;



import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    Integer idUniv; // Clé primaire
    String nomUniv;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Department> Departments;
}
