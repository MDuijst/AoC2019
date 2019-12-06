package day03;

public class Coordinate {

    private int x,y,step;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coordinate(int x, int y,int step) {
        this.x = x;
        this.y = y;
        this.step = step;
    }
    @Override
    public boolean equals(Object o) {
        Coordinate other = (Coordinate) o;
        return this.x == other.getX() && this.y == other.getY();
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
