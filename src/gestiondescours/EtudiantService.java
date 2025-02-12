/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours;

import gestiondescours.models.Etudiant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.DateConverter;

/**
 *
 * @author Pierre
 */
public class EtudiantService {
    
    private final List<Etudiant> liste = new ArrayList();
    
    public Etudiant enregistrerEtudiant(){
        Console.afficherln("> Enregistrement d'un etudiant");
        String matricule, nom, prenom;
        Date dateDeNaissance;
        int nombreAnneePostBac;
        
        
        
        Console.afficher("Saisir le matricule: ");
        matricule = Console.lireChaineDeCaracteres();
        
        Console.afficher("Saisir le nom: ");
        nom = Console.lireChaineDeCaracteres();
        
        Console.afficher("Saisir le prenom: ");
        prenom = Console.lireChaineDeCaracteres();
        
        Console.afficher("Saisir le nombre d'annee post bac: ");
        nombreAnneePostBac = Console.lireEntier();
        
        Console.afficher("Saisir la date de naissance: ");
        dateDeNaissance = Console.lireDate();
        
        Etudiant etudiant = new Etudiant(matricule, nom, prenom, nombreAnneePostBac, dateDeNaissance);
        
        liste.add(etudiant);
        
        Console.afficherln("Enregistrement effectue !");
        
        return etudiant;
        
    }
    
    public void mettreAJourEtudiant(){
        
    }
    
    public void afficherListeEtudiants(){
        Console.afficherln("> Liste des etudiants");
        for(int i=0; i<liste.size(); i++){
            Etudiant e = liste.get(i);
            afficherUnEtudiant(e);
        }
        
    }
    
    public void afficherUnEtudiant(Etudiant e){
        Console.afficherln("> Etudiant  --------- ");
        Console.afficherln("matricule :"+e.getMatricule());
        Console.afficherln("nom :"+e.getNom());
        Console.afficherln("prenom :"+e.getPrenom());
        Console.afficherln("Nombre d'annees post bac :"+e.getNombreAnneesPostBac());
        Console.afficherln("Date de naissance :"+DateConverter.toString(e.getDateDeNaissance()));
        
    }
    
    public void supprimerEtudiant(){
        
    }
}
