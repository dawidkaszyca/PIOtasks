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
public interface InterfaceObserwowany {
    public void dodajObserwatora(InterfaceObserwator obiektObserwatora);
    public void usunObserwatora(InterfaceObserwator obiektObserwatora);
    public void powiadomObserwatorow();
}
