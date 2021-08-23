package Level4_01;

import java.util.Arrays;

public class Polygon {

    private Dot[] dots;
    private int index;
    private int dotsMaxQtd;

    public Polygon(int dotsMaxQtd) {
        this.dotsMaxQtd = dotsMaxQtd;
        dots = new Dot[dotsMaxQtd];
        index = 0;
    }

    public void insertDot(Dot dot) {
        if (index < dotsMaxQtd && getIndexDot(dot) == -1) {
            dots[index] = new Dot(dot.getX(), dot.getY());
            index++;
        }
    }

    public void deleteDot(Dot dot) {
        int dotIndex = getIndexDot(dot);
        if (dotIndex != -1) {
            dots[dotIndex] = null;
            index--;
        }
    }

    public int getIndexDot(Dot dot) {
        for (int i = 0; i < index; i++) {
            if (dots[i].equals(dot)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Pontos do Polígono = " + Arrays.toString(dots);
    }

    public Dot[] getDots() {
        return dots;
    }

    public void setDots(Dot[] dots) {
        this.dots = dots;
    }

    public double getArea() {
        float sum = 0;
        for (int i = 0; i < index; i++) {
            if (i != index - 1) {
                sum += (dots[i].getX() * dots[i + 1].getY()) - (dots[i + 1].getX() * dots[i].getY());
            } else {
                sum += (dots[i].getX() * dots[i - i].getY()) - (dots[i - i].getX() * dots[i].getY());
            }
        }
        return 0.5 * sum;
    }

}
