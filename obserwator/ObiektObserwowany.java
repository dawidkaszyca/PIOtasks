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
public class ObiektObserwowany implements InterfaceObserwowany{

    private int status=1;
    
    private java.util.ArrayList<InterfaceObserwator> listaObserwatorow=new java.util.ArrayList<InterfaceObserwator>();
    
    @Override
    public void dodajObserwatora(InterfaceObserwator obiektObserwatora) {
       listaObserwatorow.add(obiektObserwatora);
    }

    @Override
    public void usunObserwatora(InterfaceObserwator obiektObserwatora) {
        listaObserwatorow.remove(obiektObserwatora);
    }

    @Override
    public void powiadomObserwatorow() {
        for(InterfaceObserwator wart:listaObserwatorow){
            wart.aktualizuj(status);
        }
    }      
}
