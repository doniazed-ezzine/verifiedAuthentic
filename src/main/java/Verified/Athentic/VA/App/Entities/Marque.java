package Verified.Athentic.VA.App.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Marque implements Serializable {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long code_marque;
        private String nom_marque;
        private String Adresse;
        private String ville;
        private String pays;

        @OneToMany(mappedBy = "marque")
        private List<Produit> produits;




        // Constructeur par défaut
        public Marque() {
        }

        // Constructeur avec tous les attributs sauf la liste des produits
        public Marque(String nom_marque, String Adresse, String ville, String pays) {
                this.nom_marque = nom_marque;
                this.Adresse = Adresse;
                this.ville = ville;
                this.pays = pays;
        }

        // Constructeur avec tous les attributs
        public Marque(String nom_marque, String Adresse, String ville, String pays, List<Produit> produits) {
                this.nom_marque = nom_marque;
                this.Adresse = Adresse;
                this.ville = ville;
                this.pays = pays;
                this.produits = produits;
        }

        // Getters
        public Long getCode_marque() {
                return code_marque;
        }

        public String getNom_marque() {
                return nom_marque;
        }

        public String getAdresse() {
                return Adresse;
        }

        public String getVille() {
                return ville;
        }

        public String getPays() {
                return pays;
        }

        public List<Produit> getProduits() {
                return produits;
        }

        // Setters
        public void setCode_marque(Long code_marque) {
                this.code_marque = code_marque;
        }

        public void setNom_marque(String nom_marque) {
                this.nom_marque = nom_marque;
        }

        public void setAdresse(String adresse) {
                Adresse = adresse;
        }

        public void setVille(String ville) {
                this.ville = ville;
        }

        public void setPays(String pays) {
                this.pays = pays;
        }

        public void setProduits(List<Produit> produits) {
                this.produits = produits;
        }

        @Override
        public String toString() {
                return "Marque{" +
                        "code_marque=" + code_marque +
                        ", nom_marque='" + nom_marque + '\'' +
                        ", Adresse='" + Adresse + '\'' +
                        ", ville='" + ville + '\'' +
                        ", pays='" + pays + '\'' +
                        ", produits=" + produits +
                        '}';
        }
}
