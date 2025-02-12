/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondescours;

import gestiondescours.models.Enseignant;
import gestiondescours.models.Etudiant;
import gestiondescours.models.Utilisateur;
import java.util.Date;
import utils.DateConverter;

/**
 *
 * @author Pierre
 */
public class GestionDesCours {

    /**
     * @param args the command line arguments
     */
    
    static EtudiantService etudiantService = new EtudiantService();
    
    
    public static void main(String[] args) {
        
        int choix;
        do{
            choix = MenuConsole.afficherMenuPrincipal();
        
            Console.afficherln("Choix: "+choix);
            switch(choix){
                case 1:
                    gestionDesEtudiants();
                    break;
                case 2:
                    Console.afficherln("> Gestion: des enseignants");
                    break;
                case 3:
                    Console.afficherln("> Gestion: des niveaux");
                    break;
                case 4:
                    Console.afficherln("> Gestion: des matieres");
                    break;
                case 5:
                    Console.afficherln("> Gestion: des notes");
                    break;
                case 0:
                    Console.afficherln("Fermeture du programme");
                    break;
                default:
                    Console.afficherln("Erreur, choisissez une valeur entre 1 et 5 ou alors 0 pour quitter.");
                    break;
            }
                        
        }while(choix!=0);
    }
    
    static void gestionDesEtudiants(){
        Console.afficherln("> Gestion: des etudiants");
        
        int choix;
        do{
            choix = MenuConsole.afficherMenuGestionDesEtudiants();
        
            Console.afficherln("Choix: "+choix);
            switch(choix){
                case 1:
                    etudiantService.enregistrerEtudiant();
                    break;
                case 2:
                    Console.afficherln("> Mettre a jour un etudiant");
                    break;
                case 3:
                    etudiantService.afficherListeEtudiants();
                    break;
                case 4:
                    Console.afficherln("> Supprimer un etudiant");
                    break;
                case 0:
                    // retourner au menu principal
                    break;
                default:
                    Console.afficherln("Erreur, choisissez une valeur entre 1 et 4 ou alors 0 pour retourner au menu principal.");
                    break;
            }
                        
        }while(choix!=0);
    }
    
}
