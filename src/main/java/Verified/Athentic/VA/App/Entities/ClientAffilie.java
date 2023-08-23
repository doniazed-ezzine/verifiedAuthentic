package Verified.Athentic.VA.App.Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ClientAffilie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client_affilie;
    private String nom_pre_resp;
    private String nom_resp_juridique;
    private String nom_resp_operations;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;



    // Constructeur par défaut
    public ClientAffilie() {
    }

    // Constructeur avec tous les attributs sauf l'utilisateur
    public ClientAffilie(String nom_pre_resp, String nom_resp_juridique, String nom_resp_operations) {
        this.nom_pre_resp = nom_pre_resp;
        this.nom_resp_juridique = nom_resp_juridique;
        this.nom_resp_operations = nom_resp_operations;
    }

    // Constructeur avec tous les attributs
    public ClientAffilie(String nom_pre_resp, String nom_resp_juridique, String nom_resp_operations, Utilisateur utilisateur) {
        this.nom_pre_resp = nom_pre_resp;
        this.nom_resp_juridique = nom_resp_juridique;
        this.nom_resp_operations = nom_resp_operations;
        this.utilisateur = utilisateur;
    }

    // Getters
    public Long getId_client_affilie() {
        return id_client_affilie;
    }

    public String getNom_pre_resp() {
        return nom_pre_resp;
    }

    public String getNom_resp_juridique() {
        return nom_resp_juridique;
    }

    public String getNom_resp_operations() {
        return nom_resp_operations;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    // Setters
    public void setId_client_affilie(Long id_client_affilie) {
        this.id_client_affilie = id_client_affilie;
    }

    public void setNom_pre_resp(String nom_pre_resp) {
        this.nom_pre_resp = nom_pre_resp;
    }

    public void setNom_resp_juridique(String nom_resp_juridique) {
        this.nom_resp_juridique = nom_resp_juridique;
    }

    public void setNom_resp_operations(String nom_resp_operations) {
        this.nom_resp_operations = nom_resp_operations;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        return "ClientAffilie{" +
                "id_client_affilie=" + id_client_affilie +
                ", nom_pre_resp='" + nom_pre_resp + '\'' +
                ", nom_resp_juridique='" + nom_resp_juridique + '\'' +
                ", nom_resp_operations='" + nom_resp_operations + '\'' +
                ", utilisateur=" + utilisateur +
                '}';
    }

}
