import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class MyImageIO {
	public static void writeImageToFile(File path, ArrayList<modulo[]> bArrList, double SQUARE_SIZE,Color[] colors,String fileName) {
		BufferedImage im = new BufferedImage(bArrList.size()*(int)SQUARE_SIZE, bArrList.size()*(int)SQUARE_SIZE, BufferedImage.TYPE_INT_ARGB);
		Graphics g = im.createGraphics();
		double d=bArrList.size();
		int X_LOCATION=(int)(d*(SQUARE_SIZE/2));
		int Y_LOCATION=0;
		for (int i = 0; i < bArrList.size(); i++) {
			for (int j = 0; j < bArrList.get(i).length; j++) {
				if (bArrList.get(i)[j].getNumber() == 0) {
					g.setColor(colors[0]);
					g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int) (SQUARE_SIZE * j), (int) (SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE,(int) SQUARE_SIZE);
				} else if (bArrList.get(i)[j].getNumber() == 1) {
					g.setColor(colors[1]);
					g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE, (int)SQUARE_SIZE);
				} else if (bArrList.get(i)[j].getNumber() == 2) {
					g.setColor(colors[2]);
					g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION, (int)SQUARE_SIZE,(int) SQUARE_SIZE);
				} else if (bArrList.get(i)[j].getNumber() == 3) {
					g.setColor(colors[3]);
					g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE,(int) SQUARE_SIZE);
				} else if (bArrList.get(i)[j].getNumber() == 4) {
					g.setColor(colors[4]);
					g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) +(int) (SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION,(int) SQUARE_SIZE,(int) SQUARE_SIZE);
				} else if (bArrList.get(i)[j].getNumber() == 5) {
					g.setColor(colors[5]);
					g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) +(int) (SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION, (int)SQUARE_SIZE, (int)SQUARE_SIZE);
				} else if (bArrList.get(i)[j].getNumber() == 6) {
					g.setColor(colors[6]);
					g.fillRect((X_LOCATION - (int) (SQUARE_SIZE/2 * i)) + (int)(SQUARE_SIZE * j), (int)(SQUARE_SIZE * i) + Y_LOCATION, (int)SQUARE_SIZE,(int) SQUARE_SIZE);
				}
			}
		}
		try {

		    ImageIO.write(im, "PNG", new File(path+"/"+fileName+".png"));
		    }catch (IOException e) {
		       e.printStackTrace();
		    }
	}


		
}
