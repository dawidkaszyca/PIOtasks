
package zad3;

import java.math.BigDecimal;

public class Pracownik implements PracujInterface {
    private String imie,nazwisko;
    private BigDecimal pensja=new BigDecimal("0.0");

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public BigDecimal getPensja() {
        return pensja;
    }

    public void setPensja(BigDecimal pensja) {
        this.pensja = pensja;
    }

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Pracownik{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", pensja=" + pensja + '}';
    }
   
   public void pracuj(){
       System.out.println("Pracownik wykonuje pracę");
   }
   
   
   
   
}
