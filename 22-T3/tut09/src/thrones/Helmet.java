package thrones;

public class Helmet extends Decorator {

    public Helmet(Character c) {
        super(c);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void damage(int points) {
        super.damage(Math.max(0,points + 1));
    }
}
