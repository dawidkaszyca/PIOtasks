
package zad1;

import java.math.BigDecimal;


public class NewMain {
 
    
    public static void main(String[] args) {
    Kontrahent k1=new Kontrahent();
    Kontrahent k2=new Kontrahent();
    
    Konto kon1=new Konto();
    Konto kon2=new Konto();
    Konto kon3=new Konto();
   
    kon1.setNumerKonta("123123");
    kon1.setSaldo(new BigDecimal(110));
    kon2.setNumerKonta("3232323");
    kon2.setSaldo(new BigDecimal(120));
    kon3.setNumerKonta("5454545");
    kon3.setSaldo(new BigDecimal(130));
    
    k1.setNumerKonta(kon1.getNumerKonta());
    k2.setNumerKonta(kon2.getNumerKonta());
    
    Produkt p1=new Produkt();
    Produkt p2=new Produkt();
    Produkt p3=new Produkt();
    Produkt p4=new Produkt();
    Produkt p5=new Produkt();
    
    Zamowienie z1=new Zamowienie();
    z1.setKontrahent(k1);
    Zamowienie z2=new Zamowienie();
    z2.setKontrahent(k2);
    
    z1.dodajProdukt(p5);
    z1.dodajProdukt(p2);
    z2.dodajProdukt(p3);
    z2.dodajProdukt(p1);
    z2.dodajProdukt(p4);
    
    z1.wykonajzlecenie(kon1);
    z2.wykonajzlecenie(kon2);
    
    }
    
}
