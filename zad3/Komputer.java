
package zad3;


public class Komputer implements PracujInterface {

    @Override
    public void pracuj() {
        System.out.println("Komputer wykonuje prace");
    }

    @Override
    public String toString() {
        return "Komputer informacje {" + '}';
    }
    
    
}
