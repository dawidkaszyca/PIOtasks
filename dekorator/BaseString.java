
package dekorator;


public class BaseString implements InterfaceStringModifer{

    InterfaceStringModifer stringModifier=null;
    
    @Override
    public String przetworzCiagZnakow(String ciag) {
       ciag = "*" + ciag + "*";
       return ciag;
    }
    
}
