
package zad1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Konto {

private String numerKonta;
private BigDecimal saldo;
private java.util.List <Operacja> operacjaNaKoncie=new ArrayList();

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Konto() {
        
    }

    public void wykonajPlatnosc(BigDecimal kwota){
        operacjaNaKoncie.add(new Operacja());
        java.util.Date data=java.util.GregorianCalendar.getInstance().getTime();
        operacjaNaKoncie.get(operacjaNaKoncie.size()).setDataOperacji(data);
        operacjaNaKoncie.get(operacjaNaKoncie.size()).setKwotaOperacji(kwota);
        
    }



}
