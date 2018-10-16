import javax.swing.*;
import java.awt.*;

public class Mars extends JFrame {

    /*
        This class is a JFrame which consists all information and photos about the planet Mars.
    */
    private final GridBagLayout layout;
    private final GridBagConstraints constraints;
    private JLabel lebelHeader, planetOfMars,insideVenus,marsEx1, marsEx2, marsEx3, marsEx4, marsEx5;
    private JLabel marsProperties[];
    private Font font;

    public Mars()
    {
        super();

        layout = new GridBagLayout();
        setLayout(layout);
        constraints = new GridBagConstraints();
        lebelHeader= new JLabel("Mars");
        font=new Font("Serif",Font.BOLD,40);
        lebelHeader.setFont(font);
        constraints.anchor=GridBagConstraints.WEST;
        addComponent(lebelHeader,0,0,2,1);
        planetOfMars=new JLabel(PhotosOfPlanets.iconOfMars);
        addComponent(planetOfMars,1,0,2,6);
        marsProperties=new JLabel[5];
        marsProp();
        insideVenus=new JLabel("Inside Mars");
        font=new Font("Serif",Font.BOLD,30);
        insideVenus.setFont(font);
        addComponent(insideVenus,7,0,1,1);
        marsEx1=new JLabel("From the 80's NASA sent to Mars varius probes to explore the surface of Mars. ");

        addComponent(marsEx1,8,0,5,1);
        marsEx2=new JLabel("The following photos were taken by those probes:");

        addComponent(marsEx2,9,0,2,3);

        planetOfMars=new JLabel(PhotosOfPlanets.insideMars1);
        addComponent(planetOfMars,12,0,2,6);
        planetOfMars=new JLabel(PhotosOfPlanets.insideMars2);
        addComponent(planetOfMars,12,3,2,6);
        planetOfMars=new JLabel(PhotosOfPlanets.insideMars3);
        addComponent(planetOfMars,12,6,2,6);

        marsEx3= new JLabel("Mars Moons:");
        font=new Font("Serif",Font.BOLD,30);
        marsEx3.setFont(font);
        addComponent(marsEx3,19,0,3,1);
        planetOfMars=new JLabel(PhotosOfPlanets.phobos);


        addComponent(planetOfMars,21,0,2,6);
        planetOfMars=new JLabel(PhotosOfPlanets.deimos);
        addComponent(planetOfMars,21,3,2,6);



        marsEx4= new JLabel("Phobos");
        addComponent(marsEx4,32,0,1,1);
        marsEx5= new JLabel("Deimos");
        addComponent(marsEx5,32,3,1,1);
    }

    private void marsProp(){
        marsProperties[0]=new JLabel("Temperature:    -63.15C\u00B0");
        marsProperties[1]=new JLabel("Self rotation:  243 days");
        marsProperties[2]=new JLabel("Length of the day: 24.6229 hours");
        marsProperties[3]=new JLabel("Number of moons: 2 (Phobos, Deimos) ");
        marsProperties[4]=new JLabel("Distance from the sun: 227,900,000km");
        addMarsProp();
    }


    private void addMarsProp(){
        for(int i=0;i<marsProperties.length;i++){
            addComponent(marsProperties[i],i+1,3,2,1);
        }
    }

    private void addComponent(Component component, int row, int colum, int width, int height){

        constraints.gridx=colum;
        constraints.gridy=row;
        constraints.gridwidth=width;
        constraints.gridheight=height;
        layout.setConstraints(component,constraints);
        add(component);


    }



}
