/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasada;

/**
 *
 * @author Student
 */
class DaneTO {

    private String nazwisko="";
    private String imie="";
    private String miasto="";

    public DaneTO(String nazwisko, String imie, String miasto) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.miasto = miasto;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    

       
    
    
}
