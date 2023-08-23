package Verified.Athentic.VA.App.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Entity
public class Support implements Serializable {

    @Id
    private String serial_number_support_prevue;
    private String dateAchat;

    @OneToOne
    @JoinColumn(name = "id_vente")
    private Vente vente;

    // No-arg constructor
    public Support() {}

    // All-args constructor
    public Support(String serial_number_support_prevue, String dateAchat, Vente vente) {
        this.serial_number_support_prevue = serial_number_support_prevue;
        this.dateAchat = dateAchat;
        this.vente = vente;
    }

    // Getters and Setters
    public String getSerial_number_support_prevue() {
        return serial_number_support_prevue;
    }

    public void setSerial_number_support_prevue(String serial_number_support_prevue) {
        this.serial_number_support_prevue = serial_number_support_prevue;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    @Override
    public String toString() {
        return "Support{" +
                "serial_number_support_prevue='" + serial_number_support_prevue + '\'' +
                ", dateAchat='" + dateAchat + '\'' +
                ", vente=" + vente +
                '}';
    }
}
