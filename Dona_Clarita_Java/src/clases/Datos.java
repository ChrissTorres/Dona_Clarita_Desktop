/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Chriss
 */
public class Datos {
    public boolean validarUser(String user, String pass)
    {
        if (user.equals("Chris") && pass.equals("1234"))
        {
            return true;
        }else
        {
            return false;
        }
    }
    
}
