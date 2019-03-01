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
public class DaneBazaStrategia implements DaneInterface {

    java.util.ArrayList lista = new java.util.ArrayList();
    
    public DaneBazaStrategia(){
    lista.add(new DaneWartosci("dddba","dddddba","ddddddddba"));
    lista.add(new DaneWartosci("aaaba","aaaaaba","aaaaaaaaba"));
    lista.add(new DaneWartosci("bbbba","bbbbbba","bbbbbbbbba"));
    lista.add(new DaneWartosci("cccba","cccccba","ccccccccba"));
    }
    @Override
    public ArrayList<DaneWartosci> getLista() {
       return lista;
    }
}
