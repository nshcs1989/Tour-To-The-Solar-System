import javax.swing.*;
import java.awt.*;

public class Titan extends JFrame {

    private final GridBagLayout layout;
    private final GridBagConstraints constraints;
    private JLabel lebelHeader, moonTitan,insideTitan,titanEx1,titanEx2, titanEx3, titanEx4;
    private JLabel titanProperties[];
    private Font font;

    public Titan()
    {
        super();

        layout = new GridBagLayout();
        setLayout(layout);
        constraints = new GridBagConstraints();
        lebelHeader= new JLabel("Titan");
        font=new Font("Serif",Font.BOLD,36);
        lebelHeader.setFont(font);
        constraints.anchor=GridBagConstraints.WEST;
        addComponent(lebelHeader,0,0,2,1);
        moonTitan=new JLabel(PhotosOfPlanets.iconOfTitan);
        addComponent(moonTitan,1,0,2,9);
        titanProperties=new JLabel[8];
        venusProp();
        insideTitan=new JLabel("Inside Titan");
        font=new Font("Serif",Font.BOLD,30);
        insideTitan.setFont(font);
        addComponent(insideTitan,15,0,1,1);
        titanEx1=new JLabel("NASA sent at October 15, 1997 the Huygens probe to explore Titan. ");
        addComponent(titanEx1,16,0,5,1);
        titanEx2=new JLabel("Huygens landed on Titan on January 14, 2005.");
        addComponent(titanEx2,17,0,2,1);
        titanEx3=new JLabel("The following photos were taken by Huygens on Titan:");
        addComponent(titanEx3,18,0,2,1);
        titanEx4=new JLabel(" ");
        addComponent(titanEx4,19,0,2,1);
        moonTitan=new JLabel(PhotosOfPlanets.insideTitan1);
        addComponent(moonTitan,20,0,2,6);
        moonTitan=new JLabel(PhotosOfPlanets.insideTitan2);
        addComponent(moonTitan,20,1,2,6);
        moonTitan=new JLabel(PhotosOfPlanets.insideTitan3);
        addComponent(moonTitan,20,2,2,6);




    }

    private void venusProp(){
        titanProperties[0]=new JLabel("Temperature:    -204.3C\u00B0");
        titanProperties[1]=new JLabel("Self rotation:  15.9 days");
        titanProperties[2]=new JLabel("Length of the day: 116days and 15.9 days");
        titanProperties[3]=new JLabel("Distance from the Sun: 149,598,262km");
        titanProperties[4]=new JLabel(" ");
        titanProperties[5]=new JLabel("Titan is one of the moons of Saturn");
        titanProperties[6]=new JLabel("Titan has thick, hazy atmosphere and surface rivers, mountains,");
        titanProperties[7]=new JLabel("lakes and dunes from carbon and methan");

        addTitanProp();
    }


    private void addTitanProp(){
        for(int i=0;i<titanProperties.length;i++){
            addComponent(titanProperties[i],i+1,3,2,1);
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
