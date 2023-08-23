package Verified.Athentic.VA.App.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_utilisateur;
    private String nom_utilisateur;
    private String prenom_utilisateur;
    private String mail;
    private long tel;
    private String mp;  // mot de passe, à ne pas stocker en clair !
    private String adresse;
    private String ville;
    private String pays;

    @OneToMany(mappedBy = "utilisateur")
    private List<ClientAffilie> clientsAffilies;

    // No-arg constructor
    public Utilisateur() {}

    // All-args constructor
    public Utilisateur(Long id_utilisateur, String nom_utilisateur, String prenom_utilisateur, String mail, long tel, String mp, String adresse, String ville, String pays, List<ClientAffilie> clientsAffilies) {
        this.id_utilisateur = id_utilisateur;
        this.nom_utilisateur = nom_utilisateur;
        this.prenom_utilisateur = prenom_utilisateur;
        this.mail = mail;
        this.tel = tel;
        this.mp = mp;
        this.adresse = adresse;
        this.ville = ville;
        this.pays = pays;
        this.clientsAffilies = clientsAffilies;
    }

    // Getters and Setters
    public Long getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Long id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getPrenom_utilisateur() {
        return prenom_utilisateur;
    }

    public void setPrenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;  // In a real scenario, hash the password before setting.
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<ClientAffilie> getClientsAffilies() {
        return clientsAffilies;
    }

    public void setClientsAffilies(List<ClientAffilie> clientsAffilies) {
        this.clientsAffilies = clientsAffilies;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_utilisateur=" + id_utilisateur +
                ", nom_utilisateur='" + nom_utilisateur + '\'' +
                ", prenom_utilisateur='" + prenom_utilisateur + '\'' +
                ", mail='" + mail + '\'' +
                ", tel=" + tel +
                ", mp='******'" + // Always avoid displaying passwords, even if hashed
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", clientsAffilies=" + clientsAffilies +
                '}';
    }
}

