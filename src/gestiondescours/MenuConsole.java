/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours;

/**
 *
 * @author Pierre
 */
public class MenuConsole {
    
    static int afficherMenuPrincipal(){
        int choix;
        Console.afficherln("MENU PRINCIPAL");
        Console.afficherln("---------------");
        Console.afficherln("1. Gerer les etudiants");
        Console.afficherln("2. Gerer les enseignants");
        Console.afficherln("3. Gerer les niveaux");
        Console.afficherln("4. Gerer les matieres");
        Console.afficherln("5. Gerer les notes");
        Console.afficherln("0. Quiter le programme");
        
        Console.afficherln("Choisir une option: ");
        
        choix = Console.lireEntier();
        
        return choix;
        
    }
    
    static int afficherMenuGestionDesEtudiants(){
        int choix;
        Console.afficherln("GESTION DES ETUDIANTS");
        Console.afficherln("---------------------");
        Console.afficherln("1. Enregistrer un etudiant");
        Console.afficherln("2. Mettre a jour un etudiant");
        Console.afficherln("3. Afficher la liste des etudiants");
        Console.afficherln("4. Supprimer un etudiant");
        Console.afficherln("0. Menu principal");
        
        Console.afficherln("Choisir une option: ");
        
        choix = Console.lireEntier();
        
        return choix;
        
    }
}
