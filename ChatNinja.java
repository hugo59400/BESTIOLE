package fr.pgah.bestioles;

import java.awt.Color;
import java.util.Random;

public class ChatNinja extends Bestiole
{
    private Random random = new Random();

    public ChatNinja()
    {

    }

    @Override
    public Action getAction(BestioleInfo info) 
    {
        if(info.getEnFace() == Voisin.AUTRE || info.getAGauche() == Voisin.AUTRE || info.getADroite() == Voisin.AUTRE)
        {
            return Action.INFECTER;
        }
        else
        {
            switch(random.nextInt(4)) 
            {
                case 0:
                return Action.GAUCHE;
                case 1:
                return Action.DROITE;
                default:
                return Action.SAUTER;
            }
        }
    }

    @Override
    public Color getCouleur() 
    {
        return Color.LIGHT_GRAY;
    }

    @Override
    public String toString()
    {
        return "CHat Ninja";
    }
}
