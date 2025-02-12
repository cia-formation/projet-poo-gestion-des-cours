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
public class Etudiant extends Utilisateur {
    
    private int nombreAnneesPostBac;
    
    private Niveau niveau;
    private List<Note> notes;
    
    public Etudiant(String matricule, String nom, String prenom, int nombreAnneesPostBac, Date dateDeNaissance){
        
        super(matricule, nom, prenom, dateDeNaissance);
        
        this.nombreAnneesPostBac = nombreAnneesPostBac;
        
        this.niveau = null;
        this.notes = new ArrayList();
    }
    
    public Etudiant(String matricule, String nom, String prenom, int nombreAnneesPostBac, Date dateDeNaissance, Niveau niveau, List<Note> notes){
        super(matricule, nom, prenom, dateDeNaissance);
        
        this.nombreAnneesPostBac = nombreAnneesPostBac;
        
        inscrire(niveau);
        this.notes = notes;
    }
    

    public int getNombreAnneesPostBac() {
        return nombreAnneesPostBac;
    }

    public void setNombreAnneesPostBac(int nombreAnneesPostBac) {
        this.nombreAnneesPostBac = nombreAnneesPostBac;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void inscrire(Niveau niveau) {
        //if(niveau!=null && niveau.getEquivalentPostBac() == (nombreAnneesPostBac+1)){
        if(niveau!=null && (niveau.getEquivalentPostBac() - 1) == nombreAnneesPostBac){
            this.niveau = niveau;
        }else{
            System.out.println("Echec de l'inscription, l'etudiant n'a pas le niveau requis");
        } 
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    
    @Override
    public void afficherInfos(){
        // System.out.println("Utilisateur: matricule = "+matricule +", nom = "+nom +", prenom = "+prenom + ", date naissance = "+dateDeNaissance);
        System.out.println("Etudiant: matricule = "+matricule +", nom = "+nom +", prenom = "+prenom +", nombreAnneesPostBac = "+nombreAnneesPostBac);
    }
    
    
}
