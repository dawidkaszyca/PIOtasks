/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategia;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class DaneListaStrategia implements DaneInterface {
    java.util.ArrayList lista = new java.util.ArrayList();
    public DaneListaStrategia(){
    lista.add(new DaneWartosci("ddd","ddddd","dddddddd"));
    lista.add(new DaneWartosci("aaa","aaaaa","aaaaaaaa"));
    lista.add(new DaneWartosci("bbb","bbbbb","bbbbbbbb"));
    lista.add(new DaneWartosci("ccc","ccccc","cccccccc"));
    
    }
    
    @Override
    public ArrayList<DaneWartosci> getLista() {
        return lista;
    }
    
   
   
    
}
