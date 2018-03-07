import java.awt.*;

public class WhiteTiger extends Critter {

boolean critInfe=false;
    public Action getMove(CritterInfo info)
    {
        if(info.getFront()==Neighbor.OTHER)
        {
           critInfe=true;
            return Action.INFECT;

        }
        else if(info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL)
        {

            return Action.LEFT;
        }
        else if(info.getFront()==Neighbor.SAME)//that is if it has an another tiger
        {
            return Action.RIGHT;
        }else
        {
            return Action.HOP;
        }

    }
    public Color getColor()
    {
         return Color.WHITE;
    }

    public String toString()
    {
       if(critInfe)//it means the critter is infected
       {
           return ("TGR");
       }
       else
       {
           return "tgr";
       }
    }


}
