package Verified.Athentic.VA.App.Entities;
import jakarta.persistence.*;

import java.io.Serializable;


@Entity
    public class ProvisionMarque implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String serial_number_produit;
        private String serial_number_support_prevue;
        private String code_confidentiel_produit_pos;
        private String code_confidentiel_produit_consumer;
        private String date_activation;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "provision_id")
    private Provision provision;
    // No-arg constructor
    public ProvisionMarque() {}

    // All-args constructor
    public ProvisionMarque(Long id, String serial_number_produit, String serial_number_support_prevue, String code_confidentiel_produit_pos, String code_confidentiel_produit_consumer, String date_activation, Produit produit, Provision provision) {
        this.id = id;
        this.serial_number_produit = serial_number_produit;
        this.serial_number_support_prevue = serial_number_support_prevue;
        this.code_confidentiel_produit_pos = code_confidentiel_produit_pos;
        this.code_confidentiel_produit_consumer = code_confidentiel_produit_consumer;
        this.date_activation = date_activation;
        this.produit = produit;
        this.provision = provision;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial_number_produit() {
        return serial_number_produit;
    }

    public void setSerial_number_produit(String serial_number_produit) {
        this.serial_number_produit = serial_number_produit;
    }

    public String getSerial_number_support_prevue() {
        return serial_number_support_prevue;
    }

    public void setSerial_number_support_prevue(String serial_number_support_prevue) {
        this.serial_number_support_prevue = serial_number_support_prevue;
    }

    public String getCode_confidentiel_produit_pos() {
        return code_confidentiel_produit_pos;
    }

    public void setCode_confidentiel_produit_pos(String code_confidentiel_produit_pos) {
        this.code_confidentiel_produit_pos = code_confidentiel_produit_pos;
    }

    public String getCode_confidentiel_produit_consumer() {
        return code_confidentiel_produit_consumer;
    }

    public void setCode_confidentiel_produit_consumer(String code_confidentiel_produit_consumer) {
        this.code_confidentiel_produit_consumer = code_confidentiel_produit_consumer;
    }

    public String getDate_activation() {
        return date_activation;
    }

    public void setDate_activation(String date_activation) {
        this.date_activation = date_activation;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Provision getProvision() {
        return provision;
    }

    public void setProvision(Provision provision) {
        this.provision = provision;
    }

    @Override
    public String toString() {
        return "ProvisionMarque{" +
                "id=" + id +
                ", serial_number_produit='" + serial_number_produit + '\'' +
                ", serial_number_support_prevue='" + serial_number_support_prevue + '\'' +
                ", code_confidentiel_produit_pos='" + code_confidentiel_produit_pos + '\'' +
                ", code_confidentiel_produit_consumer='" + code_confidentiel_produit_consumer + '\'' +
                ", date_activation='" + date_activation + '\'' +
                ", produit=" + produit +
                ", provision=" + provision +
                '}';
    }


    }

