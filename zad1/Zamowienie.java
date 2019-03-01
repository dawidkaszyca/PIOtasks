
package zad1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;


public class Zamowienie {
    protected String numerZamowienia;
    protected Date dataZamowienia;
    protected BigDecimal kwotaZamowienia;
    protected Kontrahent kontrahent;
    protected java.util.List<Produkt> produkty=new ArrayList();
    public Zamowienie() {
        
    }
    
    public Kontrahent getKontrahent() {
        return kontrahent;
    }

    public void setKontrahent(Kontrahent kontrahent) {
        this.kontrahent = kontrahent;
    }
    
    public String getNumerZamowienia() {
        return numerZamowienia;
    }

    public void setNumerZamowienia(String numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }

    public Date getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(Date dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public BigDecimal getKwotaZamowienia() {
        return kwotaZamowienia;
    }

    public void setKwotaZamowienia(BigDecimal kwotaZamowienia) {
        this.kwotaZamowienia = kwotaZamowienia;
    }

    public void dodajProdukt (Produkt produkt) {
        produkty.add(produkt);
    }
    public void usunProdukt (Produkt produkt) {
        produkty.remove(produkt);
    }
    public void wykonajzlecenie(Konto konto){
        BigDecimal kwotaZamowieniaLokalna=new BigDecimal(0.0f);
        for(Produkt produkt:produkty){
            kwotaZamowieniaLokalna=
                    kwotaZamowieniaLokalna.add(produkt.getCena());
        }
        konto.wykonajPlatnosc(kwotaZamowieniaLokalna);
    }

    @Override
    public String toString() {
        String numer="numer zamowienia"+this.numerZamowienia;
        String produktInfo="";
        
        produktInfo=produktInfo+"\n";
        for(Produkt produkt :produkty){
            String nazwa=produkt.getNazwa();
            String cena=produkt.getCena().toString();
            produktInfo=produktInfo+nazwa+";"+cena+"\n";
        }
        return produktInfo;
    }
     
 
    
}
