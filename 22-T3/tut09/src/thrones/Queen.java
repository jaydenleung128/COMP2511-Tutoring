package thrones;

/**
 * A queen can move to any square in the same column, row or diagonal as she is
 * currently on, and has a 1 in 3 chance of inflicting 12 points of damage or a
 * 2 out of 3 chance of inflicting 6 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Queen extends CharacterBase {

    public Queen(int x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void attack(Character victim) {
        if (Math.random() <= 0.3) {
            victim.damage(12);
        } else {
            victim.damage(6);
        }
        
    }

    @Override
    public boolean canMove(int dx, int dy) {
  
        // Same row
        if (dx == 0) {
            return true;
        }
        
        // Same column
        if (dy == 0) {
            return true;
        }
        
        // Same diagonal
        if (Math.abs(dx) == Math.abs(dy)) {
            return true;
        }
        
        return false;
    } 

}
