package Verified.Athentic.VA.App.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class CategorieProduit implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_categorie_produit;
        private String nom_categorie_produit;

        @OneToMany(mappedBy = "categorie")
        private List<Produit> produits;

        // Constructeur par défaut
        public CategorieProduit() {
        }

        // Constructeur avec tous les attributs, sauf la liste des produits
        public CategorieProduit(Long id_categorie_produit, String nom_categorie_produit) {
                this.id_categorie_produit = id_categorie_produit;
                this.nom_categorie_produit = nom_categorie_produit;
        }

        // Constructeur avec tous les attributs, y compris la liste des produits
        public CategorieProduit(Long id_categorie_produit, String nom_categorie_produit, List<Produit> produits) {
                this.id_categorie_produit = id_categorie_produit;
                this.nom_categorie_produit = nom_categorie_produit;
                this.produits = produits;
        }



        // Getters
        public Long getId_categorie_produit() {
                return id_categorie_produit;
        }

        public String getNom_categorie_produit() {
                return nom_categorie_produit;
        }

        public List<Produit> getProduits() {
                return produits;
        }

        // Setters
        public void setId_categorie_produit(Long id_categorie_produit) {
                this.id_categorie_produit = id_categorie_produit;
        }

        public void setNom_categorie_produit(String nom_categorie_produit) {
                this.nom_categorie_produit = nom_categorie_produit;
        }

        public void setProduits(List<Produit> produits) {
                this.produits = produits;
        }

        @Override
        public String toString() {
                return "CategorieProduit{" +
                        "id_categorie_produit=" + id_categorie_produit +
                        ", nom_categorie_produit='" + nom_categorie_produit + '\'' +
                        ", produits=" + produits +
                        '}';
        }
}
