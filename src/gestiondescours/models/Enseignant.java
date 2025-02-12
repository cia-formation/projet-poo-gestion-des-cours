/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Pierre
 */
public class Enseignant extends Utilisateur {
    
    private int anneesEtudesPostBac;
    protected Date dateDebutEnciennete;
    
    private List<Matiere> matieres;

    public Enseignant() {
    }
    
    
    public Enseignant(String matricule, String nom, String prenom, int anneesEtudesPostBac, Date dateDeNaissance, Date dateDebutEnciennete){
        
        super(matricule, nom, prenom, dateDeNaissance);

        this.anneesEtudesPostBac = anneesEtudesPostBac;
        this.dateDebutEnciennete = dateDebutEnciennete;
        this.matieres = new ArrayList();
    }
    
    public Enseignant(String matricule, String nom, String prenom, int anneesEtudesPostBac, Date dateDeNaissance, Date dateDebutEnciennete, List<Matiere> matieres){
        
        super(matricule, nom, prenom, dateDeNaissance);
        
        this.anneesEtudesPostBac = anneesEtudesPostBac;
        this.dateDebutEnciennete = dateDebutEnciennete;
        this.matieres = matieres;
    }

    

    public int getAnneesEtudesPostBac() {
        return anneesEtudesPostBac;
    }

    public void setAnneesEtudesPostBac(int anneesEtudesPostBac) {
        this.anneesEtudesPostBac = anneesEtudesPostBac;
    }


    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        if(matieres != null && matieres.size() <= 2){
            this.matieres = matieres;
        } else {
            System.out.println("Le nombre de matieres doit etre inferieur ou egal a 2");
        }
    }
    
    @Override
    public void afficherInfos(){
        // System.out.println("Utilisateur: matricule = "+matricule +", nom = "+nom +", prenom = "+prenom + ", date naissance = "+dateDeNaissance);
        System.out.println("Enseignant: matricule = "+matricule +", nom = "+nom +", prenom = "+prenom + ", anneesEtudesPostBac = "+anneesEtudesPostBac );
    }
    
    
}
