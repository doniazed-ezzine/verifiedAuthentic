package Verified.Athentic.VA.App.Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Vente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vente;

    @OneToOne
    @JoinColumn(name = "code_produit")
    private Produit produit;

    @OneToOne(mappedBy = "vente")
    private Support support;

    // No-arg constructor
    public Vente() {}

    // All-args constructor
    public Vente(Long id_vente, Produit produit, Support support) {
        this.id_vente = id_vente;
        this.produit = produit;
        this.support = support;
    }

    // Getters and Setters
    public Long getId_vente() {
        return id_vente;
    }

    public void setId_vente(Long id_vente) {
        this.id_vente = id_vente;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    @Override
    public String toString() {
        return "Vente{" +
                "id_vente=" + id_vente +
                ", produit=" + produit +
                ", support=" + support +
                '}';
    }
}
