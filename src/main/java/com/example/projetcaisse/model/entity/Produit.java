package com.example.projetcaisse.model.entity;

import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "PRODUIT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produit implements Serializable {

    /**
     * generated serial ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Produit id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_generator")
    @SequenceGenerator(name = "prod_generator", sequenceName = "prod_SEQ", initialValue = 1, allocationSize = 1)
    @Column(name = "idProduit", updatable = false, nullable = false)
    private Long idProduit ;

    @Column(name="code")
    private String code ;

    @Column(name="libelle")
    private String libelle ;

    @Column(name="description")
    private String description ;

    @Column(name="prix")
    private float prix ;

    @Column(name="qte")
    private int qte ;

    @Column(name="dateAjout")
    private Date dateAjout ;

    @Column(name="dateModif")
    private Date dateModif ;

    @OneToMany(mappedBy="produit")
    private List<Quantite> quantites;

}

