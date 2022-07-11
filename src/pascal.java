import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
//The main class to run the generator


public class pascal {

    public static void main(String[] args) {
        //decorations
        JFrame frame = new JFrame();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Label l1;
        l1 = new Label("Pascal triangle generator!");
        l1.setBounds(30,20, 350,30);
        l1.setFont(new Font("ARIEL", Font.PLAIN, 18));

        frame.add(l1);

        JButton b=new JButton("Draw your triangle");
        b.setBounds(30,50,200,30);
        frame.add(b);

        Label l2;
        l2 = new Label("Choose the Modulo");
        l2.setBounds(30,80, 150,20);
        frame.add(l2);

        String options1[]={"2","3","4","5","6","7"};
        JComboBox cb1=new JComboBox(options1);
        cb1.setBounds(30, 100,200,20);
        frame.add(cb1);

        Label l3;
        l3 = new Label("Choose the squares size");
        l3.setBounds(30,130, 150,20);
        frame.add(l3);

        String options2[]={"1","2","3","4","5","20"};
        JComboBox cb2=new JComboBox(options2);
        cb2.setBounds(30, 150,200,20);
        frame.add(cb2);

        Label l4;
        l4 = new Label("Choose how many lines");
        l4.setBounds(30,180, 150,20);
        frame.add(l4);

        String options3[]={"screen size","200","100","30"};
        JComboBox cb3=new JComboBox(options3);
        cb3.setBounds(30, 200,200,20);
        frame.add(cb3);

        Label l5;
        l5 = new Label("Select the colours");
        l5.setBounds(30,230, 150,20);
        frame.add(l5);

        Label l6;
        l6 = new Label("© MOSHE");
        l6.setBounds(30,(int)screenSize.getHeight()-100, 150,20);
        l6.setFont(new Font("Serif", Font.PLAIN, 10));
        frame.add(l6);

        AtomicReference<Color> COLOR_1= new AtomicReference<>(Color.green);
        AtomicReference<Color> COLOR_2= new AtomicReference<>(Color.red);
        AtomicReference<Color> COLOR_3= new AtomicReference<>(Color.blue);
        AtomicReference<Color> COLOR_4= new AtomicReference<>(Color.yellow);
        AtomicReference<Color> COLOR_5= new AtomicReference<>(Color.magenta);
        AtomicReference<Color> COLOR_6= new AtomicReference<>(Color.darkGray);
        AtomicReference<Color> COLOR_7= new AtomicReference<>(Color.white);

        Button b1 = new Button("0");
        b1.setBounds(30,250,20,20);
        b1.setBackground(COLOR_1.get());
        frame.add(b1);
        b1.addActionListener(e ->{
            COLOR_1.set(JColorChooser.showDialog(frame, "select colour", Color.CYAN));
            b1.setBackground(COLOR_1.get());
        });

        Button b2 = new Button("1");
        b2.setBounds(60,250,20,20);
        b2.setBackground(COLOR_2.get());
        frame.add(b2);
        b2.addActionListener(e ->{
            COLOR_2.set(JColorChooser.showDialog(frame, "select colour", Color.CYAN));
            b2.setBackground(COLOR_2.get());
        });

        Button b3 = new Button("2");
        b3.setBounds(90,250,20,20);
        b3.setBackground(COLOR_3.get());
        frame.add(b3);
        b3.addActionListener(e ->{
            COLOR_3.set(JColorChooser.showDialog(frame, "select colour", Color.CYAN));
            b3.setBackground(COLOR_3.get());
        });

        Button b4 = new Button("3");
        b4.setBounds(120,250,20,20);
        b4.setBackground(COLOR_4.get());
        frame.add(b4);
        b4.addActionListener(e ->{
            COLOR_4.set(JColorChooser.showDialog(frame, "select colour", Color.CYAN));
            b4.setBackground(COLOR_4.get());
        });

        Button b5 = new Button("4");
        b5.setBounds(150,250,20,20);
        b5.setBackground(COLOR_5.get());
        frame.add(b5);
        b5.addActionListener(e ->{
            COLOR_5.set(JColorChooser.showDialog(frame, "select colour", Color.CYAN));
            b5.setBackground(COLOR_5.get());
        });

        Button b6 = new Button("5");
        b6.setBounds(180,250,20,20);
        b6.setBackground(COLOR_6.get());
        frame.add(b6);
        b6.addActionListener(e ->{
            COLOR_6.set(JColorChooser.showDialog(frame, "select colour", Color.CYAN));
            b6.setBackground(COLOR_6.get());
        });

        Button b7 = new Button("6");
        b7.setBounds(210,250,20,20);
        b7.setBackground(COLOR_7.get());
        frame.add(b7);
        b7.addActionListener(e ->{
            COLOR_7.set(JColorChooser.showDialog(frame, "select colour", Color.CYAN));
            b7.setBackground(COLOR_7.get());
        });



        frame.setSize(900, 900);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //define an arraylist for the triangle
        ArrayList pas = new ArrayList();
        //setting the first line, with an array of objects "modulo". That object has the modulo plus operation
        modulo[] firstLine = new modulo[1];
        //setting the panel with draw class extends JPanel
        draw panel = new draw();

        JButton savePhoto = new JButton("Save as a photo");
        savePhoto.setBounds(30,290,200,30);
        savePhoto.addActionListener(e ->{
            int LINES = panel.getbArrList().size();
            double SQUARE_SIZE = panel.getSQUARE_SIZE();
            Color[] colors = new Color[7];

            colors[0]=panel.getCOLOR_1();
            colors[1]=panel.getCOLOR_2();
            colors[2]=panel.getCOLOR_3();
            colors[3]=panel.getCOLOR_4();
            colors[4]=panel.getCOLOR_5();
            colors[5]=panel.getCOLOR_6();
            colors[6]=panel.getCOLOR_7();


            try {
                String filename = JOptionPane.showInputDialog("Name this file");
                JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
                fc.setCurrentDirectory(new File(System.getProperty("user.home")));
                fc.showSaveDialog(panel);
                System.out.println(fc.getSelectedFile());
                MyImageIO.writeImageToFile(fc.getSelectedFile(), pas,(int)SQUARE_SIZE,colors,"//"+filename);
            }
            catch(Exception e1) {
                System.out.println("error");
                e1.printStackTrace();
            }
        });


        b.addActionListener(e -> {

            frame.add(savePhoto);
            frame.repaint();
            panel.setBounds(230,0,700,900);
            panel.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
            frame.add(panel);

            //clear the ArrayList
            pas.clear();

            //reading the input that was chosen
            int MOD = Integer.valueOf((String) cb1.getItemAt(cb1.getSelectedIndex()));
            double SQUARE_SIZE =Integer.valueOf((String) cb2.getItemAt(cb2.getSelectedIndex()));
            int LINES;
            if((String) cb3.getItemAt(cb3.getSelectedIndex())=="screen size"){
                LINES = (int)screenSize.getHeight();}
            else
                LINES = Integer.valueOf((String) cb3.getItemAt(cb3.getSelectedIndex()));

            panel.setSQUARE_SIZE(SQUARE_SIZE);
            panel.setCOLOR_1(COLOR_1.get());
            panel.setCOLOR_2(COLOR_2.get());
            panel.setCOLOR_3(COLOR_3.get());
            panel.setCOLOR_4(COLOR_4.get());
            panel.setCOLOR_5(COLOR_5.get());
            panel.setCOLOR_6(COLOR_6.get());
            panel.setCOLOR_7(COLOR_7.get());

            //setting the first line, the number 1 with 1 place in the array
            firstLine[0]=new modulo(MOD,1);
            pas.add(0,firstLine);

            // running through all the lines, and each time adding 1 cell in the new line
            // then calculate the sum of the 2 cells above each number. The sum is made by the modulo plus operation
            // separating the scenarios of the first and last numbers each line
    for (int i = 1; i < LINES; i++) {
        modulo[] nextLine = new modulo[i+1];
        modulo[] previousLine = (modulo[]) pas.get(i-1);
        for (int j = 0; j <= i; j++) {

            if(j>0 && j<i) {
                nextLine[j]=new modulo(MOD,previousLine[j].getNumber()).plus(new modulo(MOD,previousLine[j-1].getNumber()));
            }
            else if (j==0) {
                nextLine[j]=new modulo(MOD,previousLine[j].getNumber());
            }
            else {
                nextLine[j]=new modulo(MOD,previousLine[j-1].getNumber());
            }
        }
        pas.add(i,nextLine);
    }
            panel.setDraws(pas);
            frame.setVisible(true);

        });

        panel.setOpaque(false);


    }

}
