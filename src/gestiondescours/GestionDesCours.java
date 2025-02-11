/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondescours;

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
        Utilisateur utilisateur = new Utilisateur("U0001", "TALLA", "Jean", DateConverter.toDate("12/01/2000"));
        Enseignant enseignant = new Enseignant("EN001", "TOUBE", "Pierre", 5, DateConverter.toDate("24/12/1992"), DateConverter.toDate("12/01/2010"));
        Etudiant e = new Etudiant("ET001", "KUMBA", "Cabrel", 1, DateConverter.toDate("24/12/2002"));
       
        
        Utilisateur[] tabUtilisateurs ={utilisateur, enseignant, e};
        
        for (int i=0; i<3; i++){
                   
            Utilisateur u = tabUtilisateurs[i];

            u.afficherInfos();
            
            if( u instanceof Etudiant){
                System.out.println("U est un etudiant");
            }else if(u instanceof Enseignant){
                System.out.println("U est un Enseignant");
            }else if(u instanceof Utilisateur){
                System.out.println("U est un Utilisateur");
            }
        }
        
        
        
        /*
        utilisateur = e;
        
        
        
        
        utilisateur.afficherInfos();
        enseignant.afficherInfos();
        e.afficherInfos();
*/
        
    }
    
}
