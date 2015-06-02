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
public class OpskriftDTO
{
    private int opskriftID;
    private String opNavn;
    private String kommentar;
    private int hiID;
    private int katID;
    private int kogeID;
    private int forfatterID;

    public OpskriftDTO(int opskriftID, String opNavn, String kommentar, int hiID, int katID, int kogeID, int forfatterID)
    {
        this.opskriftID = opskriftID;
        this.opNavn = opNavn;
        this.kommentar = kommentar;
        this.hiID = hiID;
        this.katID = katID;
        this.kogeID = kogeID;
        this.forfatterID = forfatterID;
    }

    public int getOpskriftID()
    {
        return opskriftID;
    }

    public void setOpskriftID(int opskriftID)
    {
        this.opskriftID = opskriftID;
    }

    public String getOpNavn()
    {
        return opNavn;
    }

    public void setOpNavn(String opNavn)
    {
        this.opNavn = opNavn;
    }

    public String getKommentar()
    {
        return kommentar;
    }

    public void setKommentar(String kommentar)
    {
        this.kommentar = kommentar;
    }

    public int getHiID()
    {
        return hiID;
    }

    public void setHiID(int hiID)
    {
        this.hiID = hiID;
    }

    public int getKatID()
    {
        return katID;
    }

    public void setKatID(int katID)
    {
        this.katID = katID;
    }

    public int getKogeID()
    {
        return kogeID;
    }

    public void setKogeID(int kogeID)
    {
        this.kogeID = kogeID;
    }

    public int getForfatterID()
    {
        return forfatterID;
    }

    public void setForfatterID(int forfatterID)
    {
        this.forfatterID = forfatterID;
    }
    
}
