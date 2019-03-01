
package dekorator;


public class BaseStringDecoratorUpper extends BaseString{

    public BaseStringDecoratorUpper(InterfaceStringModifer stringModifier) {
        this.stringModifier=stringModifier;
    }

    @Override
    public String przetworzCiagZnakow(String ciag) {
        ciag=stringModifier.przetworzCiagZnakow(ciag);
        ciag=ciag.toUpperCase();
        return ciag;
    }
    
    
    
}
