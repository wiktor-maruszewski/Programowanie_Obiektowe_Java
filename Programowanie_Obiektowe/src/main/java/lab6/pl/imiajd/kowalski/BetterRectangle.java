package lab6.pl.imiajd.kowalski;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle{

    public double getPerimeter(){
        return 2.0 * this.height + 2.0 * this.width;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public BetterRectangle(int x, int y, int width, int height){
        super(x, y, width, height);
    }
}
