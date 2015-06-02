/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Pernille
 */
public class BrugerDTO
{
    private int brugerID;
    private String fornavn;
    private String efternavn;
    private String password;

    public BrugerDTO(int brugerID, String fornavn, String efternavn, String password)
    {
        this.brugerID = brugerID;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.password = password;
    }

    public String getFornavn()
    {
        return fornavn;
    }

    public void setFornavn(String fornavn)
    {
        this.fornavn = fornavn;
    }

    public String getEfternavn()
    {
        return efternavn;
    }

    public void setEfternavn(String efternavn)
    {
        this.efternavn = efternavn;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public BrugerDTO(String fornavn, String efternavn, String password)
    {
        
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.password = password;
    }
}
