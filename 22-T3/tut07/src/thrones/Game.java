package thrones;

public class Game {
    
    public static void main(String[] args) {
        Character king = CharacterFactory.buildKing();
        Character queen = CharacterFactory.buildQueen();
        Character knight = CharacterFactory.buildKnight();
        Character dragon = CharacterFactory.buildDragon();

        knight.attack(dragon);
    }

}