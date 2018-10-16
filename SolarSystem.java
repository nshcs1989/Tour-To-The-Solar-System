
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    SolarSystem is the main JFrame, where the user can choose the button of "Visited Planets by Human" to study about the planets,
    which humanity visited. The user may also choose the button of "Tour the Planets in Solar System" to study about the planets 
    in our solar system. Also, there are two JMenu for options and help.

*/

public class SolarSystem extends JFrame implements ActionListener {

    private JPanel firstPanel;
    private JPanel secondPanel;
    private JButton cmdVisitedPlanets;
    private JButton cmdTourSolarSystem;

    private JLabel firstJLabel;
    private JLabel secondJLabel;
    private ImageIcon icon;
    private JMenuBar bar;
    private JMenu option1;
    private JMenu option2;
    private Font font;
    private JMenuItem exit, reffence, helpT ;


    public SolarSystem() {
        super("Exploring The Solar System");

        bar=new JMenuBar();
        setJMenuBar(bar);
        option1=new JMenu("Options");
        bar.add(option1);
        option2=new JMenu("Help");
        bar.add(option2);
        exit=new JMenuItem("Exit");
        helpT=new JMenuItem("Help");
        reffence=new JMenuItem("Reffences");
        font = new Font("Serif",Font.BOLD,36);

        firstJLabel = new JLabel("Welcome To Solar System!");
        firstJLabel.setFont(font);
        firstPanel = new JPanel();
        firstPanel.add(firstJLabel);

        secondJLabel= new JLabel(PhotosOfPlanets.pIcon);


        cmdVisitedPlanets= new JButton("Visited Planets by Human");
        cmdTourSolarSystem = new JButton("Tour the Planets in Solar System");

        cmdVisitedPlanets.addActionListener(this);
        cmdTourSolarSystem.addActionListener(this);

        secondPanel = new JPanel();
        secondPanel.add(cmdTourSolarSystem);
        secondPanel.add(cmdVisitedPlanets);


        option1.add(exit);
        option2.add(helpT);
        option2.add(reffence);
        exit.addActionListener(this);
        helpT.addActionListener(this);
        reffence.addActionListener(this);
        this.add(firstPanel, BorderLayout.NORTH);
        this.add(secondJLabel, BorderLayout.CENTER);
        this.add(secondPanel, BorderLayout.SOUTH);

    }



    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == cmdVisitedPlanets)
            openVisitPlanets();
        else if (e.getSource() == cmdTourSolarSystem)
            openTourSolarSystem();

        else if (e.getSource()==exit)
            exitApp();
        else if (e.getSource()==helpT)
            help();
        else if (e.getSource()==reffence)
            reffences();

    }

    private void openVisitPlanets(){
        VisitedPlanets visit = new VisitedPlanets();
        visit.setVisible(true);
        visit.setSize(950,350);
    }

    private void openTourSolarSystem(){
        TourSolarSystem tour = new TourSolarSystem();
        tour.setVisible(true);
        tour.setSize(1050,750);

    }



    private void exitApp(){
        System.exit(0);
    }

    private void help(){

        Help helpTour = new Help();
        JFrame helpFr = new JFrame("Help");

        helpFr.add(helpTour,BorderLayout.CENTER);
        helpFr.setVisible(true);
        helpFr.setSize(600,400);


    }

    private void reffences(){
        Reffences ref = new Reffences();
        JFrame refFr = new JFrame("Reffences");
        refFr.add(ref,BorderLayout.CENTER);
        refFr.setVisible(true);
        refFr.setSize(600,300);


    }



    public static void main(String[] args) {

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        solarSystem.setVisible(true);
        solarSystem.setSize(700, 500);



    }

    public class Help extends JPanel{

        private String helpBank[]=new String[6];


        public void paintComponent(Graphics g){
            super.paintComponent(g);

            addString();
            int y=70;
            for(int i=0;i<helpBank.length;i++)
            {
                g.setFont(new Font("serif", Font.BOLD,18));
                g.drawString(helpBank[i],20, y);
                y=y+50;
            }

        }

        private void addString(){
            helpBank[0]="This program illustrate a tour to our solar system. ";
            helpBank[1]="If you would like to study about planets in the solar system";
            helpBank[2]="please click on \"Tour the Planets in Solar System\" button\"";
            helpBank[3]="If you would like to study about planets that human visited,";
            helpBank[4]="please click on \"Visited Planets by Human\" button";
            helpBank[5]="To exit, please click on X button";
        }

    }

    public class Reffences extends JPanel{

        private String helpBank[]=new String[4];


        public void paintComponent(Graphics g){
            super.paintComponent(g);

            addString();
            int y=70;
            for(int i=0;i<helpBank.length;i++)
            {
                g.setFont(new Font("serif", Font.BOLD,18));
                g.drawString(helpBank[i],20, y);
                y=y+50;
            }

        }

        private void addString(){
            helpBank[0]="All data about the planets were taken from NASA website. ";
            helpBank[1]="All photos of the plantes and thier moons were taken from google.";
            helpBank[2]="The structure of the program designed according the book:  ";
            helpBank[3]="\"Java How to Programe, TENTH EDITION\".";

        }

    }

}
