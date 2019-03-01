
package fasada;

import java.util.ArrayList;


public class DaneDAO {

    public DaneDAO(String nazwaPliku) {
        //tu kod
    }
    public java.util.ArrayList<String> wczytajDane(){
        java.util.ArrayList<String> wierszeDanych= new ArrayList();
        wierszeDanych.add("jarek,nowak,Sosnowiec");
        wierszeDanych.add("jarek,nowak,Katowice");
        wierszeDanych.add("jarek,nowak,Wesola");
        wierszeDanych.add("jarek,nowak,Morgi");
        wierszeDanych.add("jarek,nowak,Larysz");
        return wierszeDanych;
    }
}
