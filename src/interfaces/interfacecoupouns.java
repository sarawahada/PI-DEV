/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.coupouns;

/**
 *
 * @author LENOVO
 */
public interface interfacecoupouns {
    public void ajoutercoupouns(coupouns c );
    public List<coupouns> affichercoupouns();
   public void modifiercoupouns();
   public void supprimercoupouns();
}
