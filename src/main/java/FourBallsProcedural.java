import processing.core.PApplet;

public class FourBallsProcedural extends  PApplet{

    public static final int HEIGHT = 800;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 10;
    private int x = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        ellipse(x,((float) HEIGHT /5)*1,DIAMETER,DIAMETER);
        ellipse(x,((float) HEIGHT /5)*2,DIAMETER,DIAMETER);
        ellipse(x,((float) HEIGHT /5)*3,DIAMETER,DIAMETER);
        ellipse(x,((float) HEIGHT /5)*4,DIAMETER,DIAMETER);
    }

    @Override
    public void draw() {
        ellipse(x,((float) HEIGHT /5)*1,DIAMETER,DIAMETER);
        ellipse(2*x,((float) HEIGHT /5)*2,DIAMETER,DIAMETER);
        ellipse(3*x,((float) HEIGHT /5)*3,DIAMETER,DIAMETER);
        ellipse(4*x,((float) HEIGHT /5)*4,DIAMETER,DIAMETER);
        x++;
    }
}
