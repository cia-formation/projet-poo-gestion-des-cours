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
        Console.afficher("MENU PRINCIPAL");
        Console.afficher("---------------");
        Console.afficher("1. Gerer les etudiants");
        Console.afficher("2. Gerer les enseignants");
        Console.afficher("3. Gerer les niveaux");
        Console.afficher("4. Gerer les matieres");
        Console.afficher("5. Gerer les notes");
        Console.afficher("0. Quiter le programme");
        
        Console.afficher("Choisir une option: ");
        
        choix = Console.lireEntier();
        
        return choix;
        
    }
    
    static int afficherMenuGestionDesEtudiants(){
        int choix;
        Console.afficher("GESTION DES ETUDIANTS");
        Console.afficher("---------------------");
        Console.afficher("1. Enregistrer un etudiant");
        Console.afficher("2. Mettre a jour un etudiant");
        Console.afficher("3. Afficher la liste des etudiants");
        Console.afficher("4. Supprimer un etudiant");
        Console.afficher("0. Menu principal");
        
        Console.afficher("Choisir une option: ");
        
        choix = Console.lireEntier();
        
        return choix;
        
    }
}
