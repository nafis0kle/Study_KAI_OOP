package primitives;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class PrSquare extends TFigure{
    protected double size;

    public PrSquare() {
        Random random = new Random();
        this.coordinateX = (random.nextDouble()*500.0);
        this.coordinateY = (random.nextDouble()*500.0);
        this.size = (random.nextDouble()*100.0);
    }

    @Override
    public void show(GraphicsContext gc){
        gc.setFill(Color.RED);
        gc.fillRect(coordinateX, coordinateY, size, size);
    }

    @Override
    public void delete(GraphicsContext gc){
        gc.setFill(Color.grayRgb(244));
        gc.fillRect(coordinateX - 1, coordinateY - 1, size + 2, size + 2);
    }

    public void move(double addX, double addY, GraphicsContext gc){
        this.coordinateX += addX;
        this.coordinateY += addY;
        show(gc);
    }
}
