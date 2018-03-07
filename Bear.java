import java.awt.*;
public class Bear extends Critter {
    boolean polar;
    String move= "/";
   public Bear(boolean polar)
   {
       this.polar=polar;
   }

    public Color getColor() {
     //colouring white when a polar bear is true
        if(polar)
        {
            return Color.WHITE;

        }else
        {
              return Color.BLACK;
        }
    }

    public String toString() {
       String Char= this.move;
      if(Char.equals("/"))
      {
          Char="\\";
      }
      else
      {
          Char="/";
      }
      return Char;

    }
    public Action getMove(CritterInfo info) {
    if(info.getFront()==Neighbor.OTHER)
    {
        return Action.INFECT;
    }
    else if(info.getFront()==Neighbor.EMPTY)
    {
        return Action.HOP;
    }
    else
    {
        return Action.LEFT;
    }
    }
}
