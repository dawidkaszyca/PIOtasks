
package zad3;

import java.math.BigDecimal;


public class Kierownik extends Pracownik {
    private BigDecimal dodatek;

    public BigDecimal getDodatek() {
        return dodatek;
    }

    public void setDodatek(BigDecimal dodatek) {
        this.dodatek = dodatek;
    }

    public Kierownik(String imie, String nazwisko) {
        super(imie, nazwisko);
    }
    
    public Kierownik(BigDecimal dodatek, String imie, String nazwisko) {
        super(imie, nazwisko);
        this.dodatek = dodatek;
    }

    @Override
    public String toString() {
        return super.toString()+"Kierownik{" + "dodatek=" + dodatek + '}';
    }
    
    @Override
    public void pracuj(){
     System.out.println("Kierownik wykonuje pracę");
    }
}
