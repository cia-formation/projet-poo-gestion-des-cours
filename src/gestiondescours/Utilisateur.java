/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours;

import java.util.Date;
import utils.DateConverter;

/**
 *
 * @author Pierre
 */
public class Utilisateur {
    protected String matricule;
    protected String nom = "Nom par defaut";
    protected String prenom;
    private Date dateDeNaissance;

    public Utilisateur() {
    }

    public Utilisateur(String matricule, String nom, String prenom, Date dateDeNaissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }
    
    
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
    
    void afficherInfos(){
        System.out.println("Utilisateur: matricule = "+matricule +", nom = "+nom +", prenom = "+prenom + ", date naissance = "+DateConverter.toString(dateDeNaissance));
    }
}
