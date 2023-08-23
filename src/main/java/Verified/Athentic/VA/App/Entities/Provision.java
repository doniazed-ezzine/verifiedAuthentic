package Verified.Athentic.VA.App.Entities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Provision implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_provision;
    private String data_provision;
    private String nom_marque;
    private String nom_client_affilie_b2b;
    private String nom_produit;
    private String num_serie_produit_debut;
    private String num_serie_produit_fin;
    private String date_previsionnelle_vente;

    @ManyToMany
    @JoinTable(name = "provision_marque",
            joinColumns = @JoinColumn(name = "id_provision"),
            inverseJoinColumns = @JoinColumn(name = "code_produit"))
    private List<Produit> produits;
    @OneToMany(mappedBy = "provision")
    private List<ProvisionMarque> provisionMarques;



    // No-arg constructor
    public Provision() {}

    // All-args constructor
    public Provision(Long id_provision, String data_provision, String nom_marque, String nom_client_affilie_b2b, String nom_produit, String num_serie_produit_debut, String num_serie_produit_fin, String date_previsionnelle_vente, List<Produit> produits, List<ProvisionMarque> provisionMarques) {
        this.id_provision = id_provision;
        this.data_provision = data_provision;
        this.nom_marque = nom_marque;
        this.nom_client_affilie_b2b = nom_client_affilie_b2b;
        this.nom_produit = nom_produit;
        this.num_serie_produit_debut = num_serie_produit_debut;
        this.num_serie_produit_fin = num_serie_produit_fin;
        this.date_previsionnelle_vente = date_previsionnelle_vente;
        this.produits = produits;
        this.provisionMarques = provisionMarques;
    }

    // Getters and Setters
    public Long getId_provision() {
        return id_provision;
    }

    public void setId_provision(Long id_provision) {
        this.id_provision = id_provision;
    }

    public String getData_provision() {
        return data_provision;
    }

    public void setData_provision(String data_provision) {
        this.data_provision = data_provision;
    }

    public String getNom_marque() {
        return nom_marque;
    }

    public void setNom_marque(String nom_marque) {
        this.nom_marque = nom_marque;
    }

    public String getNom_client_affilie_b2b() {
        return nom_client_affilie_b2b;
    }

    public void setNom_client_affilie_b2b(String nom_client_affilie_b2b) {
        this.nom_client_affilie_b2b = nom_client_affilie_b2b;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public String getNum_serie_produit_debut() {
        return num_serie_produit_debut;
    }

    public void setNum_serie_produit_debut(String num_serie_produit_debut) {
        this.num_serie_produit_debut = num_serie_produit_debut;
    }

    public String getNum_serie_produit_fin() {
        return num_serie_produit_fin;
    }

    public void setNum_serie_produit_fin(String num_serie_produit_fin) {
        this.num_serie_produit_fin = num_serie_produit_fin;
    }

    public String getDate_previsionnelle_vente() {
        return date_previsionnelle_vente;
    }

    public void setDate_previsionnelle_vente(String date_previsionnelle_vente) {
        this.date_previsionnelle_vente = date_previsionnelle_vente;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<ProvisionMarque> getProvisionMarques() {
        return provisionMarques;
    }

    public void setProvisionMarques(List<ProvisionMarque> provisionMarques) {
        this.provisionMarques = provisionMarques;
    }

    @Override
    public String toString() {
        return "Provision{" +
                "id_provision=" + id_provision +
                ", data_provision='" + data_provision + '\'' +
                ", nom_marque='" + nom_marque + '\'' +
                ", nom_client_affilie_b2b='" + nom_client_affilie_b2b + '\'' +
                ", nom_produit='" + nom_produit + '\'' +
                ", num_serie_produit_debut='" + num_serie_produit_debut + '\'' +
                ", num_serie_produit_fin='" + num_serie_produit_fin + '\'' +
                ", date_previsionnelle_vente='" + date_previsionnelle_vente + '\'' +
                ", produits=" + produits +
                ", provisionMarques=" + provisionMarques +
                '}';
    }
}
