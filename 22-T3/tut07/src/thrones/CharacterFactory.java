package thrones;

import java.util.Random;

public class CharacterFactory {
    public static Random rand = new Random(System.currentTimeMillis());    
    
    public static Character buildDragon() {
        return new Dragon(rand.nextInt(0), rand.nextInt(0));
    }
    
    public static Character buildKing() {
        return new King(rand.nextInt(0), rand.nextInt(0));
    }
    
    public static Character buildKnight() {
        return new Knight(rand.nextInt(0), rand.nextInt(0));
    }
    
    public static Character buildQueen() {
        return new Queen(rand.nextInt(0), rand.nextInt(0));
    }
}
