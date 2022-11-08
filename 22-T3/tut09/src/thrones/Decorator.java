package thrones;

import java.util.List;

public class Decorator implements Character {
    private Character c;
        
    public Decorator(Character c) {
        this.c = c;    
    }
    
    @Override
    public int getHealthPoints() {
        return c.getHealthPoints();
    }

    @Override
    public int getX() {
        return c.getX();
    }

    @Override
    public int getY() {
        return c.getY();
    }

    @Override
    public void damage(int points) {
        c.damage(points);        
    }

    @Override
    public MoveResult makeMove(int x, int y, List<Character> characters) {
        return c.makeMove(x, y, characters);
    }

    @Override
    public void attack(Character victim) {
        c.attack(victim);        
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return c.canMove(dx, dy);
    }
}
