public class Challenge{

    private float gymX, gymY;
    private boolean inGym;
    private int attendance;
    private boolean done;

    public Challenge(String name, Boolean paid)
    {
        this.name=name;
        this.paid=paid;
    }

    public boolean location(float x, float y)
    {
        if(x==gymX && y==gymY)
        {
            inGym=true;
        }
        else
        {
            inGym=false;
        }
        return inGym;
    }

    public int attendance(boolean inGym)
    {
        if(inGym==true)
        {
            attendance++;
        }
        return attendance;
    }

    public boolean challengeSuccess(int attendance)
    {
        if(attendance >= 3)
        {
            done=true;
        }
        else
        {
            done=false;
        }
        return done;
    }

}