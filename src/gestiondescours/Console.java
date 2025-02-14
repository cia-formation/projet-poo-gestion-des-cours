/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours;

import java.util.Date;
import java.util.Scanner;
import utils.DateConverter;

/**
 *
 * @author Pierre
 */
public class Console {
    
    static public void afficherln(String msg){
        System.out.println(msg);
    }
    
    static public void afficher(String msg){
        System.out.print(msg);        
    }
    
    static public int lireEntier(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    
    static public String lireChaineDeCaracteres(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    
    static public Date lireDate(){
        Scanner scan = new Scanner(System.in);
        String dateString = scan.nextLine();
        return DateConverter.toDate(dateString);
    }
}
