import processing.core.PApplet;

public class FourBallsWithOOPS extends PApplet {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    public static final int DIAMETER = 10;

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    public static void main(String[] args) {
        PApplet.main("FourBallsWithOOPS",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball((HEIGHT/5)*1,1);
        ball2 = new Ball((HEIGHT/5)*2,2);
        ball3 = new Ball((HEIGHT/5)*3,3);
        ball4 = new Ball((HEIGHT/5)*4,4);
    }

    @Override
    public void draw() {
        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
        Ball.x++;
    }

    class Ball{
        public static int x=0;
        private final float BALL_HEIGHT;
        private final int SPEED;

        Ball(float height,int speed){
            this.BALL_HEIGHT = height;
            this.SPEED = speed;
        }

        void display(){
            ellipse(SPEED*x,BALL_HEIGHT,DIAMETER,DIAMETER);
        }
    }
}
