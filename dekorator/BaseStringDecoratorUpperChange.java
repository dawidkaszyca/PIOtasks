/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekorator;


public class BaseStringDecoratorUpperChange extends BaseString {

    @Override
    public String przetworzCiagZnakow(String ciag) {
        ciag=stringModifier.przetworzCiagZnakow(ciag);
        ciag=ciag.replace("A", "XXX");
        return ciag;
    }

     public BaseStringDecoratorUpperChange(InterfaceStringModifer stringModifier) {
        this.stringModifier=stringModifier;
    }
    
}
