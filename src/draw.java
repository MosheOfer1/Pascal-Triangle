import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class draw extends JPanel {
    private ArrayList<modulo[]> bArrList;
    private Color COLOR_1=Color.green;
    private Color COLOR_2=Color.red;
    private Color COLOR_3=Color.BLUE;
    private Color COLOR_4=Color.yellow;
    private Color COLOR_5=Color.magenta;
    private Color COLOR_6=Color.darkGray;
    private Color COLOR_7=Color.white;

    private final int X_LOCATION=330;
    private final int Y_LOCATION=20;
    private double SQUARE_SIZE;

    public draw(){
        super();
     }

    public ArrayList<modulo[]> getbArrList() {
        return bArrList;
    }

    public Color getCOLOR_1() {
        return COLOR_1;
    }

    public Color getCOLOR_2() {
        return COLOR_2;
    }

    public Color getCOLOR_3() {
        return COLOR_3;
    }

    public Color getCOLOR_4() {
        return COLOR_4;
    }

    public Color getCOLOR_5() {
        return COLOR_5;
    }

    public Color getCOLOR_6() {
        return COLOR_6;
    }

    public Color getCOLOR_7() {
        return COLOR_7;
    }

    public double getSQUARE_SIZE() {
        return SQUARE_SIZE;
    }

    public void setCOLOR_1(Color COLOR_1) {
        this.COLOR_1 = COLOR_1;
    }

    public void setCOLOR_2(Color COLOR_2) {
        this.COLOR_2 = COLOR_2;
    }

    public void setCOLOR_3(Color COLOR_3) {
        this.COLOR_3 = COLOR_3;
    }

    public void setCOLOR_4(Color COLOR_4) {
        this.COLOR_4 = COLOR_4;
    }

    public void setCOLOR_5(Color COLOR_5) {
        this.COLOR_5 = COLOR_5;
    }

    public void setCOLOR_6(Color COLOR_6) {
        this.COLOR_6 = COLOR_6;
    }

    public void setCOLOR_7(Color COLOR_7) {
        this.COLOR_7 = COLOR_7;
    }

    public void setSQUARE_SIZE(double SQUARE_SIZE) {
        this.SQUARE_SIZE = SQUARE_SIZE;
    }

    public void paint(Graphics g) {

        super.paintComponent(g);
        for (int i = 0; i < bArrList.size(); i++) {
                for (int j = 0; j < bArrList.get(i).length; j++) {
                    if (bArrList.get(i)[j].getNumber() == 0) {
                        g.setColor(COLOR_1);
                        g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int) (SQUARE_SIZE * j), (int) (SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE,(int) SQUARE_SIZE);
                    } else if (bArrList.get(i)[j].getNumber() == 1) {
                        g.setColor(COLOR_2);
                        g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE, (int)SQUARE_SIZE);
                    } else if (bArrList.get(i)[j].getNumber() == 2) {
                        g.setColor(COLOR_3);
                        g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION, (int)SQUARE_SIZE,(int) SQUARE_SIZE);
                    } else if (bArrList.get(i)[j].getNumber() == 3) {
                        g.setColor(COLOR_4);
                        g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE,(int) SQUARE_SIZE);
                    } else if (bArrList.get(i)[j].getNumber() == 4) {
                        g.setColor(COLOR_5);
                        g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) +(int) (SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE,(int) SQUARE_SIZE);
                    } else if (bArrList.get(i)[j].getNumber() == 5) {
                        g.setColor(COLOR_6);
                        g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) +(int) (SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION, (int)SQUARE_SIZE, (int)SQUARE_SIZE);
                    } else if (bArrList.get(i)[j].getNumber() == 6) {
                        g.setColor(COLOR_7);
                        g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION, (int)SQUARE_SIZE,(int) SQUARE_SIZE);
                    }
                }
            }

    }

    public void setDraws(ArrayList pas) {
        this.bArrList=pas;
        this.repaint();
    }
}
