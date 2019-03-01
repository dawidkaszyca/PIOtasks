
package fasada;

import java.util.ArrayList;


public class DaneFormatowanie {
    String regex="";
    ArrayList<DaneTO> listaDanych = new ArrayList();

    public DaneFormatowanie(String regex) {
        this.regex=regex;
    }
    public ArrayList<DaneTO> formatujDane(ArrayList<String> wierszeDanych){
    for(String wart:wierszeDanych){
        String [] kolumny=wart.split(regex);
        listaDanych.add(new DaneTO(kolumny[0],kolumny[1],kolumny[2]));
    }
    return listaDanych;
    }
    public void wyswietlDane(){
        for(DaneTO wiersz:listaDanych){
            System.out.println(wiersz);   
        }
    
    }
}
   
    

