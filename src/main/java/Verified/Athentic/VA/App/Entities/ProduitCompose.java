package Verified.Athentic.VA.App.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class ProduitCompose extends Produit {

    @OneToMany(mappedBy = "produitCompose")
    private List<Produit> listeDesProduits;

    // No-arg constructor
    public ProduitCompose() {}

    // All-args constructor (considering only fields specific to this subclass)
    public ProduitCompose(List<Produit> listeDesProduits) {
        this.listeDesProduits = listeDesProduits;
    }

    // All-args constructor (considering fields from both this class and the superclass)
    public ProduitCompose(String code_produit, String Nom_produit, String designation_produit, String Descriptif_produit, String Part_Number_produit, CategorieProduit categorie, Marque marque, List<ProvisionMarque> provisionMarques, List<Produit> listeDesProduits) {
        super(code_produit, Nom_produit, designation_produit, Descriptif_produit, Part_Number_produit, categorie, marque, provisionMarques);
        this.listeDesProduits = listeDesProduits;
    }

    // Getters and Setters
    public List<Produit> getListeDesProduits() {
        return listeDesProduits;
    }

    public void setListeDesProduits(List<Produit> listeDesProduits) {
        this.listeDesProduits = listeDesProduits;
    }

    @Override
    public String toString() {
        return "ProduitCompose{" +
                "listeDesProduits=" + listeDesProduits +
                ", code_produit='" + getCode_produit() + '\'' +
                ", Nom_produit='" + getNom_produit() + '\'' +
                ", designation_produit='" + getDesignation_produit() + '\'' +
                ", Descriptif_produit='" + getDescriptif_produit() + '\'' +
                ", Part_Number_produit='" + getPart_Number_produit() + '\'' +
                ", categorie=" + getCategorie() +
                ", marque=" + getMarque() +
                ", provisionMarques=" + getProvisionMarques() +
                '}';
    }
}
