package gameDicer;

public class Computer implements PlayingDice {

    @Override
    public int randomCube() {
        int cube1 = PlayingDice.super.randomCube();
        int cube2 = PlayingDice.super.randomCube();
        return cube1 + cube2;
    }
}
