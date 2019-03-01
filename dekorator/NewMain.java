/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;

/**
 *
 * @author Student
 */
public class NewMain {
    public static void main(String[] args) {
        BaseString bs=new BaseString();
        System.out.println("dek pods : "+bs.przetworzCiagZnakow("napisNapis"));
        BaseString bsdu=new BaseStringDecoratorUpper(bs);
        System.out.println("dekorat  duza lira"+bsdu.przetworzCiagZnakow("Napisnapis"));
        BaseString bsduc=new BaseStringDecoratorUpperChange(bsdu);
        System.out.println("dokorator zamiana A->XXX"+bsduc.przetworzCiagZnakow("Napisnapis"));
        InterfaceStringModifer bsduci = new BaseStringDecoratorUpperChange(bs);
        System.out.println("Dekorator 2 zamiana A->XXX" + bsduci.przetworzCiagZnakow("Napisnapis"));
        
    }
    
}
