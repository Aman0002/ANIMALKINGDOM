import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
   Random rand=new Random();
   int moves=0;
   public Color color=Color.RED;
    public Tiger()
    {

    }
    public Color getColor()
    {
        if(this.moves==2) {
            int colour = rand.nextInt(3);//generating the three values 0 1 2
            if (colour == 0) {
                color= Color.RED;

            } else if (colour == 1) {
                color= Color.GREEN;

            } else {
                color= Color.BLUE;
            }
            return color;
        }
        else
        {
            return color;
        }


    }

        public String toString()
        {
          return "TGR";
        }

    public Action getMove(CritterInfo info)
    {
    if(info.getFront()==Neighbor.OTHER)
    {
        moves++;
        return Action.INFECT;

    }
    else if(info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL)
    {
        moves++;
         return Action.LEFT;
    }
    else if(info.getFront()==Neighbor.SAME)//that is if it has an another tiger
    {moves++;
           return Action.RIGHT;
    }else
    {moves++;
        return Action.HOP;
    }

    }

}
