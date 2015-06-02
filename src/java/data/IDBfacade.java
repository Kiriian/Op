
package data;



import control.BrugerDTO;
import control.InvalidDataException;
import control.OpskriftDTO;
import java.io.File;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import javax.servlet.http.Part;

/**
 *
 * @author Pernille
 */
public interface IDBfacade
{
    BrugerDTO validateLogin(String fornavn, String efternavn, String password)throws InvalidDataException;
    
    ArrayList<OpskriftDTO> searchOpskrift(String searchCriteria) throws InvalidDataException;
}
