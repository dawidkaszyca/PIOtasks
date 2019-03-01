/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategia;

public class NewClass {
    public static void main(String[] args) {
        DaneOgolne daneO= new DaneOgolne();
        daneO.setDaneInterfejs(new DaneListaStrategia());
        System.out.println("================Wydruk Listy=============");
        for(DaneWartosci wartosc : daneO.getListaDaneOgolne()){
            System.out.println(wartosc.getImie()+" "+wartosc.getNazwisko());
        }
       
        daneO.setDaneInterfejs(new DanePlikStrategia());
        System.out.println("================Wydruk Listy=============");
        for(DaneWartosci wartosc : daneO.getListaDaneOgolne()){
            System.out.println(wartosc.getImie()+" "+wartosc.getNazwisko());
        }
        daneO.setDaneInterfejs(new DaneBazaStrategia());
        System.out.println("================Wydruk Listy=============");
        for(DaneWartosci wartosc : daneO.getListaDaneOgolne()){
            System.out.println(wartosc.getImie()+" "+wartosc.getNazwisko());
        }
    }
    
}
