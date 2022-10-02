public class boll {
    float x, y, xSpeed, ySpeed;
    int MyColor;
    public boll(float x, float y, float xSpeed, float ySpeed, int c) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        MyColor=c;
    }
    public void applyGravity() {
        ySpeed = ySpeed + 0.6f;
    }
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
    }
    public void reverseHDirection() {
        xSpeed = -xSpeed;
    }
    public void reverseVDirection() {
        ySpeed = -ySpeed;
    }

}
