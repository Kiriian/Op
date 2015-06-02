/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import data.DBfacade;
import java.util.ArrayList;

/**
 *
 * @author Pernille
 */
public class controller
{ 
    DBfacade facade = new DBfacade();

    public BrugerDTO validateLogin(String fornavn, String efternavn, String password) throws InvalidDataException 
    {
        return facade.validateLogin(fornavn, efternavn, password);
    }
    public ArrayList<OpskriftDTO> searchOpskrift(String searchCriteria) throws InvalidDataException
    {
        return facade.searchOpskrift(searchCriteria);
    }
}
