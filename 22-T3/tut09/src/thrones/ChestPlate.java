package thrones;

import java.util.List;

public class ChestPlate extends Decorator {

    public ChestPlate(Character c) {
        super(c);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void damage(int points) {
        // TODO Auto-generated method stub
        super.damage(Math.min(points,7));
    }
    
    @Override
    public boolean canMove(int dx, int dy) {
        if (dx + dy <= 3) {
            return super.canMove(dx, dy);
        }
        return false;
    }
}
