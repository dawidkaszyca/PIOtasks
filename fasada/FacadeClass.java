/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasada;

import java.util.ArrayList;

public class FacadeClass {
    private DaneDAO daneDao;
    private DaneFormatowanie daneFormatowanie;

    public FacadeClass(DaneDAO daneDao, DaneFormatowanie daneFormatowanie) {
        this.daneDao = daneDao;
        this.daneFormatowanie = daneFormatowanie;
    }
    public void pokazDane(){
    ArrayList listaDanych= daneDao.wczytajDane();
    daneFormatowanie.formatujDane(listaDanych);
    daneFormatowanie.wyswietlDane();
    
    }
    
}
