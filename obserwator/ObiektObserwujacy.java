/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obserwator;

/**
 *
 * @author Student
 */
public class ObiektObserwujacy implements InterfaceObserwator {

    int statusObiektuObserwowanego=0;
   
    @Override
    public void aktualizuj(int status) {
        this.statusObiektuObserwowanego=statusObiektuObserwowanego;
        pokazStan();
    }
    public void pokazStan(){
        System.out.println("Obiekt Obserwujacy A - stan po zmianie"+ statusObiektuObserwowanego);
    }
    
}
