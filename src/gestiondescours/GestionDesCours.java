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
    public static void main(String[] args) {
        
        int choix;
        do{
            choix = MenuConsole.afficherMenuPrincipal();
        
            Console.afficher("Choix: "+choix);
            switch(choix){
                case 1:
                    gestionDesEtudiants();
                    break;
                case 2:
                    Console.afficher("> Gestion: des enseignants");
                    break;
                case 3:
                    Console.afficher("> Gestion: des niveaux");
                    break;
                case 4:
                    Console.afficher("> Gestion: des matieres");
                    break;
                case 5:
                    Console.afficher("> Gestion: des notes");
                    break;
                case 0:
                    Console.afficher("Fermeture du programme");
                    break;
                default:
                    Console.afficher("Erreur, choisissez une valeur entre 1 et 5 ou alors 0 pour quitter.");
                    break;
            }
                        
        }while(choix!=0);
    }
    
    static void gestionDesEtudiants(){
        Console.afficher("> Gestion: des etudiants");
        
        int choix;
        do{
            choix = MenuConsole.afficherMenuGestionDesEtudiants();
        
            Console.afficher("Choix: "+choix);
            switch(choix){
                case 1:
                    Console.afficher("> Enregistrer un etudiant");
                    break;
                case 2:
                    Console.afficher("> Mettre a jour un etudiant");
                    break;
                case 3:
                    Console.afficher("> Afficher la liste des etudiants");
                    break;
                case 4:
                    Console.afficher("> Supprimer un etudiants");
                    break;
                case 0:
                    // retourner au menu principal
                    break;
                default:
                    Console.afficher("Erreur, choisissez une valeur entre 1 et 4 ou alors 0 pour retourner au menu principal.");
                    break;
            }
                        
        }while(choix!=0);
    }
    
}
