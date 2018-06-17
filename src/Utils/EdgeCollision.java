package Utils;

import Controller.CharacterController;
import Model.ArenaModel;
import Model.CharacterModel;

public class EdgeCollision {
    public static boolean checkCollision (CharacterModel character, ArenaModel arena){

        return character.getSpriteX()+character.getWidth() >= arena.getWidth();

    }
}
