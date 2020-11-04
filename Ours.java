package fr.pgah.bestioles;

import java.awt.Color;

public class Ours extends Bestiole
{
  //  private boolean polaire;
  private Color couleur;
    private String mouvement = "\\";
//  private boolean pencheAGauche=true;

    public Ours(boolean polaire)
    {
      //  this.polaire = polaire;
        this.couleur = polaire ? Color.WHITE : Color.BLACK;
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
            return Action.GAUCHE;
        }
    }

    @Override
    public Color getCouleur() 
    {
     //   if(polaire)
      //  {
      //      return Color.WHITE;
     //   }
      //  else
      //  {
            return couleur;
      //  }
    }

    @Override
    public String toString()
    {
        if(mouvement.equals("\\"))
        {
            mouvement = "/";
            return mouvement;
        }
        else
        {
            mouvement = "\\";
            return mouvement;
        }
    }



   // @Override
   // public String toString()
    //{
       // pencheAGauche=!pencheAGauche;
   //   return pencheAGauche ? "\\" : "/" ;
   // }






    
}
