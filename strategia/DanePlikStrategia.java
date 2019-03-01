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
public class DanePlikStrategia implements DaneInterface{

    java.util.ArrayList lista = new java.util.ArrayList();
    
    public DanePlikStrategia(){
    lista.add(new DaneWartosci("dddx","dddddx","ddddddddx"));
    lista.add(new DaneWartosci("aaax","aaaaax","aaaaaaaax"));
    lista.add(new DaneWartosci("bbbx","bbbbbx","bbbbbbbbx"));
    lista.add(new DaneWartosci("cccx","cccccx","ccccccccx"));
    }
    @Override
    public ArrayList<DaneWartosci> getLista() {
       return lista;
    }
}
   
