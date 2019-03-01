
package strategia;

import java.util.ArrayList;


public class DaneOgolne {
    DaneInterface daneInterfejs;
    public ArrayList <DaneWartosci>getListaDaneOgolne(){
    return daneInterfejs.getLista();
    }

    public DaneOgolne(DaneInterface daneInterfejs) {
        this.daneInterfejs = daneInterfejs;
    }
    public DaneOgolne() {
        
    }
    public void setDaneInterfejs(DaneInterface daneInterfejs) {
        this.daneInterfejs = daneInterfejs;
    }
    
}
