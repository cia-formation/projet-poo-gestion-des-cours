/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondescours;

import java.util.Scanner;

/**
 *
 * @author Pierre
 */
public class Console {
    
    static public void afficher(String msg){
        System.out.println(msg);
    }
    
    static public int lireEntier(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
