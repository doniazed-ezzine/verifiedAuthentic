package Verified.Athentic.VA.App.Entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
    public class Produit implements Serializable {

        @Id
        private String code_produit;
        private String Nom_produit;
        private String designation_produit;
        private String Descriptif_produit;
        private String Part_Number_produit;

        @ManyToOne
        @JoinColumn(name = "id_categorie_produit")
        private CategorieProduit categorie;

        @ManyToOne
        @JoinColumn(name = "code_marque")
        private Marque marque;

        @OneToMany(mappedBy = "produit")
        private List<ProvisionMarque> provisionMarques;


    // No-arg constructor
    public Produit() {}

    // All-args constructor
    public Produit(String code_produit, String Nom_produit, String designation_produit, String Descriptif_produit, String Part_Number_produit, CategorieProduit categorie, Marque marque, List<ProvisionMarque> provisionMarques) {
        this.code_produit = code_produit;
        this.Nom_produit = Nom_produit;
        this.designation_produit = designation_produit;
        this.Descriptif_produit = Descriptif_produit;
        this.Part_Number_produit = Part_Number_produit;
        this.categorie = categorie;
        this.marque = marque;
        this.provisionMarques = provisionMarques;
    }

    // Getters and Setters
    public String getCode_produit() {
        return code_produit;
    }

    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    public String getNom_produit() {
        return Nom_produit;
    }

    public void setNom_produit(String Nom_produit) {
        this.Nom_produit = Nom_produit;
    }

    public String getDesignation_produit() {
        return designation_produit;
    }

    public void setDesignation_produit(String designation_produit) {
        this.designation_produit = designation_produit;
    }

    public String getDescriptif_produit() {
        return Descriptif_produit;
    }

    public void setDescriptif_produit(String Descriptif_produit) {
        this.Descriptif_produit = Descriptif_produit;
    }

    public String getPart_Number_produit() {
        return Part_Number_produit;
    }

    public void setPart_Number_produit(String Part_Number_produit) {
        this.Part_Number_produit = Part_Number_produit;
    }

    public CategorieProduit getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieProduit categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public List<ProvisionMarque> getProvisionMarques() {
        return provisionMarques;
    }

    public void setProvisionMarques(List<ProvisionMarque> provisionMarques) {
        this.provisionMarques = provisionMarques;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "code_produit='" + code_produit + '\'' +
                ", Nom_produit='" + Nom_produit + '\'' +
                ", designation_produit='" + designation_produit + '\'' +
                ", Descriptif_produit='" + Descriptif_produit + '\'' +
                ", Part_Number_produit='" + Part_Number_produit + '\'' +
                ", categorie=" + categorie +
                ", marque=" + marque +
                ", provisionMarques=" + provisionMarques +
                '}';
    }

    }