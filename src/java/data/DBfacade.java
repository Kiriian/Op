/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import control.BrugerDTO;
import control.InvalidDataException;
import control.OpskriftDTO;
import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

/**
 *
 * @author Pernille
 */
public class DBfacade implements IDBfacade
{
    Mapper mapper = new Mapper();
    
    @Override 
    public BrugerDTO validateLogin(String fornavn, String efternavn, String password) throws InvalidDataException {
        try 
        {
            return mapper.validateLogin(fornavn, efternavn, password);              
                    
        } catch (SQLException sqle) {
            throw new InvalidDataException("" + sqle);
        }
    }

    @Override
    public ArrayList<OpskriftDTO> searchOpskrift(String searchCriteria) throws InvalidDataException
    {
        try
        {
            return mapper.hentOpskrifter(searchCriteria);
        }catch (SQLException sqle)
        {
            throw new InvalidDataException(""+sqle);
        }
    }
}
