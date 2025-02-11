/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours;

import java.util.Date;

/**
 *
 * @author Pierre
 */
public class Note {
    private int valeur;
    private Date dateEvaluation;
    
    private Matiere matiere;

    public Note(int valeur, Date dateEvaluation) {
        this.valeur = valeur;
        this.dateEvaluation = dateEvaluation;
    }

    public Note(int valeur, Date dateEvaluation, Matiere matiere) {
        this.valeur = valeur;
        this.dateEvaluation = dateEvaluation;
        this.matiere = matiere;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Date getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(Date dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
    
    
}
