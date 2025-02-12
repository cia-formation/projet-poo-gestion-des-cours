/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours.models;

import java.util.List;

/**
 *
 * @author Pierre
 */
public class Niveau {
    private String code;
    private String libelle;
    private int equivalentPostBac;
    
    private List<Matiere> matieres;
    private List<Etudiant> etudiants;

    public Niveau(String code, String libelle, int equivalentPostBac) {
        this.code = code;
        this.libelle = libelle;
        this.equivalentPostBac = equivalentPostBac;
    }

    public Niveau(String code, String libelle, int equivalentPostBac, List<Matiere> matieres, List<Etudiant> etudiants) {
        this.code = code;
        this.libelle = libelle;
        this.equivalentPostBac = equivalentPostBac;
        this.matieres = matieres;
        this.etudiants = etudiants;
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

    public int getEquivalentPostBac() {
        return equivalentPostBac;
    }

    public void setEquivalentPostBac(int equivalentPostBac) {
        this.equivalentPostBac = equivalentPostBac;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    
    
    
    
}
