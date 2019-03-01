/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OsobaSingleton osobaS1=OsobaSingleton.getInstance();
        OsobaSingleton osobaS2=OsobaSingleton.getInstance();
        OsobaSingleton osobaS3=OsobaSingleton.getInstance();
        
        osobaS3.imie="sdasd";
        
        String s=osobaS1.imie;
        
    }
    
}
