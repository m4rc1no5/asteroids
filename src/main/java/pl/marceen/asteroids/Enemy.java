package pl.marceen.asteroids;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * @author Marcin Zaremba
 */
public class Enemy extends GameObject {
    public Enemy() {
        super(new Circle(15, 15, 15, Color.RED));
    }
}
