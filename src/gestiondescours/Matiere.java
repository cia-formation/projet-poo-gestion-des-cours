/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours;

/**
 *
 * @author Pierre
 */
public class Matiere {
    private String code;
    private String libelle;
    private int nombreCredits;
    
    private Enseignant enseignant;

    public Matiere(String code, String libelle, int nombreCredits) {
        this.code = code;
        this.libelle = libelle;
        this.nombreCredits = nombreCredits;
        this.enseignant = null;
    }

    public Matiere(String code, String libelle, int nombreCredits, Enseignant enseignant) {
        this.code = code;
        this.libelle = libelle;
        this.nombreCredits = nombreCredits;
        this.enseignant = enseignant;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNombreCredits() {
        return nombreCredits;
    }

    public void setNombreCredits(int nombreCredits) {
        this.nombreCredits = nombreCredits;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
    
    
}
