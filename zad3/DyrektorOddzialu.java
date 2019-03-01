/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.math.BigDecimal;

public class DyrektorOddzialu extends Kierownik {
    
    private String oddzial;

    public DyrektorOddzialu(String oddzial, BigDecimal dodatek, String imie, String nazwisko) {
        super(dodatek, imie, nazwisko);
        this.oddzial = oddzial;
    }
    
    public DyrektorOddzialu(BigDecimal dodatek, String imie, String nazwisko) {
        super(dodatek, imie, nazwisko);
    }
    
    public String getOddzial() {
        return oddzial;
    }

    public void setOddzial(String oddzial) {
        this.oddzial = oddzial;
    }

    @Override
    public String toString() {
        return super.toString()+"DyrektorOddzialu{" + "oddzial=" + oddzial + '}';
    }
    
    public void pracuj(){
     System.out.println("Dyrektor wykonuje pracę");
    }
    
}