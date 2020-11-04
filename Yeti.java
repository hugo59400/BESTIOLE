package fr.pgah.bestioles;

import java.awt.Color;

public class Yeti extends Bestiole
{
    private int nbMouvement = 0;

    public Yeti()
    {
        
    }

    @Override
    public Action getAction(BestioleInfo info) 
    {
        if(info.getEnFace() == Voisin.AUTRE)
        {
            return Action.INFECTER;
        }
        else if(info.getEnFace() == Voisin.RIEN) 
        {
            return Action.SAUTER;
        }
        else
        {
            return Action.DROITE;
        }
    }

    @Override
    public Color getCouleur() 
    {
        return Color.GRAY;
    }


    @Override
    public String toString()
    {
        if(nbMouvement < 7)
        {
            nbMouvement++;
            return "gna";
        }
        else if(nbMouvement < 13)
        {
            nbMouvement++;
            return "gne";
        }
        else if(nbMouvement < 19)
        {
            nbMouvement++;
            return "bah";
        }
        else if(nbMouvement < 25)
        {
            nbMouvement++;
            return "bek";
        }
        else
        {
            nbMouvement = 1;
            return "gna";
        }
        
    }
}
