import java.awt.*;

public class Giant extends Critter {

  int moves=0;
    public Action getMove(CritterInfo info)
    {
        if(info.getFront()==Neighbor.OTHER)
        {  moves++;
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.EMPTY)
        {   moves++;
            return Action.HOP;
        }
        else
        {   moves++;
            return Action.RIGHT;
        }
    }

    public Color getColor()
    {
      return Color.GRAY;
    }

    public String toString()
    {
        if(moves>=24){moves=0;}//for repeating it again and again
      if(this.moves<=5)
      {
          return "fee";
      }else if(this.moves>5||this.moves<=11)
      {
          return "fie";
      }
      else if(this.moves>11||this.moves<=17)
      {
          return "foe";
      }else
      {
          return "fum";
      }
    }


}
