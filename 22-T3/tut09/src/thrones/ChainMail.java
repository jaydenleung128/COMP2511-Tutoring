package thrones;

public class ChainMail extends Decorator {

    public ChainMail(Character c) {
        super(c);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void damage(int points) {
        super.damage(points/2);
    }
}
