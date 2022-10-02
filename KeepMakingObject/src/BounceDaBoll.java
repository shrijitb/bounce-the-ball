import processing.core.PApplet;

import java.util.ArrayList;

public class BounceDaBoll extends PApplet {
    ArrayList<boll> ballList;
    int timer = 0;

    public void setup() {
        //size(600,600);
        ballList = new ArrayList<>();
    }
    public void settings(){
        size(600,600);
    }


    public void draw() {
        background(255);
        fill(0);
        textSize(32);
        text("Number of objects: " + ballList.size(), 10, 35);

        timer++;
        if (timer > 400) {
            float iAmSpeed=(float)(-5 + 10 * Math.random());
            int r=(int)(Math.random()*256);
            int g=(int)(Math.random()*256);
            int b=(int)(Math.random()*256);
            int c=color(r, g, b);
            boll n = new boll(300, 600, iAmSpeed, -22, c);
            ballList.add(n);
            timer=0;
        }
        for (int loc = 0; loc < ballList.size(); loc++) {
            boll b = ballList.get(loc);

            fill(b.MyColor);
            ellipse(b.x, b.y, 20, 20);
            b.applyGravity();
            b.move();
            if (b.x < 0 || b.x > 600) {
                b.reverseHDirection();
            }
            if (b.y < 0 || b.y > 600) {
                b.reverseVDirection();
            }

        }

    }
    public static void main (String[]args){
        PApplet.main("BounceDaBoll");
    }
}
