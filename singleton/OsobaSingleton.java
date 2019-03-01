
package singleton;


public class OsobaSingleton {
    
private static OsobaSingleton instance;
public String imie="";
private String nazwisko="";

private OsobaSingleton(){}

public static OsobaSingleton getInstance(){
if(instance==null){
    instance = new OsobaSingleton();
    instance.imie = "imieSingleton";
    instance.nazwisko = "nazwiskoSingleton";
}
return instance;
}

}
