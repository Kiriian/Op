/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import control.BrugerDTO;
import control.OpskriftDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pernille
 */
public class Mapper
{
    //opretter forbindelse til databasen
    static 
    {
        try 
        {
            Class.forName(DB.DRIVER);
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Mapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public BrugerDTO validateLogin(String fornavn, String efternavn, String password) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB.URL, DB.ID, DB.PW)) {
            String sql1 = "SELECT * FROM BRUGER WHERE FORNAVN = ? AND EFTERNAVN = ? AND PASSWORD = ?";

            PreparedStatement statement = connection.prepareStatement(sql1);
            statement.setString(1, fornavn);
            statement.setString(2, efternavn);
            statement.setString(3, password);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) 
            {
                BrugerDTO user = new BrugerDTO(rs.getInt("BRUGER_ID"),
                        rs.getString("FORNAVN"),
                        rs.getString("EFTERNAVN"),
                        rs.getString("PASSWORD"));
                        
                return user;
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
            System.out.println("The call stack trace");
            sqle.printStackTrace();
            System.out.println("");
        }
        return null;
    }
 public ArrayList<OpskriftDTO> hentOpskrifter(String searchCriteria) throws SQLException {
        ArrayList<OpskriftDTO> o = new ArrayList<>();
        ResultSet rs;
        PreparedStatement statement;
        try (Connection connection = DriverManager.getConnection(DB.URL, DB.ID, DB.PW)) {
            String sql2 = "SELECT * FROM OPSKRIFT WHERE KATEGORI = ?";
            statement = connection.prepareStatement(sql2);
            statement.setString(1, searchCriteria);

            rs = statement.executeQuery();

            while (rs.next()) 
            {
                o.add(new OpskriftDTO(
                        rs.getInt("OPSKRIFT_ID"),
                        rs.getString("OP_NAVN"),
                        rs.getString("KOMMENTAR"),
                        rs.getInt("HI_ID"),                       
                        rs.getInt("KAT_ID"),
                        rs.getInt("KOGE_ID"),
                        rs.getInt("FORFATTER_ID")));
                        
            }
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

        return o;
    }
   
}
