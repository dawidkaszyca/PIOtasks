/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
 
        public static void main(String[] args) {
        List<PracujInterface> lista=new ArrayList <PracujInterface>();
        lista.add(new Pracownik("dd","kk"));
        lista.add(new Pracownik("dr","kr"));
        lista.add(new Kierownik(new BigDecimal("2.1"),"kk","xx"));
        lista.add(new DyrektorOddzialu(new BigDecimal("3.0"),"DR","KK"));
        lista.add(new Komputer());
        for(PracujInterface x:lista){
            System.out.println( x.toString());
            x.pracuj();
        }
        }
}
