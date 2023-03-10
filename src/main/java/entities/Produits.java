package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Produits {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRODUIT")
    private Integer idProduit;
    @Basic
    @Column(name = "NOM_PRODUIT")
    private String nomProduit;
    @Basic
    @Column(name = "PRIX")
    private Double prix;

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produits produits = (Produits) o;
        return Objects.equals(idProduit, produits.idProduit) && Objects.equals(nomProduit, produits.nomProduit) && Objects.equals(prix, produits.prix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduit, nomProduit, prix);
    }

    public Produits() {
    }

    public Produits(String nomProduit, double prix) {
        this.nomProduit = nomProduit;
        this.prix = prix;
    }
}
