package pl.marceen.asteroids;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author Marcin Zaremba
 */
public class Player extends GameObject {
    public Player() {
        super(new Rectangle(40, 20, Color.BLUE));
    }
}
