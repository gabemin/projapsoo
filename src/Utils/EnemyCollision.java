package Utils;

import Model.CharacterModel;
import Model.EnemyModel;

public class EnemyCollision {



    public static boolean checkCollision (CharacterModel character, EnemyModel enemy){

        return (character.getSpriteX()+character.getWidth()>enemy.getX()
                && character.getSpriteY()+ (character.getHeigth()/2)>enemy.getY())
                && (character.getSpriteX()+character.getWidth()< enemy.getX()+enemy.getWidht()
                && character.getSpriteY()+(character.getHeigth()/2)<enemy.getY() + enemy.getHeigth() );

    }


}
