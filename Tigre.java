package fr.pgah.bestioles;

import java.awt.Color;
import java.util.Random;

public class Tigre extends Bestiole
{
    private int nbMouvement = 0;
    private Color couleur;

    public Tigre()
    {

    }
    
    @Override
    public Action getAction(BestioleInfo info) 
    {
        if(info.getEnFace() == Voisin.AUTRE)
        {
            return Action.INFECTER;
        }
        else if(info.getEnFace() == Voisin.MUR || info.getADroite() == Voisin.MUR)
        {
            return Action.GAUCHE;
        }
        else if(info.getEnFace() == Voisin.MEME)
        {
            return Action.DROITE;
        }
        else
        {
            return Action.SAUTER; 
        }
    }

    @Override
    public Color getCouleur() 
    {
        nbMouvement++;
        if(nbMouvement == 4)
        {
            couleur = couleurAleatoire();
            nbMouvement=0;
        }
       
       
        
         return couleur;
        
    }

    private Color couleurAleatoire()
    {
        switch(new Random().nextInt(3))
        {
            case 0:
            return Color.RED;
            case 1:
            return Color.GREEN;
            default:
            return Color.BLUE;
        }
    }

    @Override
    public String toString()
    {
        return "TGR";
    }
    
}
