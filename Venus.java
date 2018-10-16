import javax.swing.*;
import java.awt.*;

public class Venus extends JFrame {

    /*
        This class is a JFrame which consists all information and photos about the planet Venus.
    */
    private final GridBagLayout layout;
    private final GridBagConstraints constraints;
    private JLabel lebelHeader, planetOfVenus,insideVenus,veneraEx1,veneraEx2;
    private JLabel venusProperties[];
    private Font font;

    public Venus()
    {
        super();

        layout = new GridBagLayout();
        setLayout(layout);
        constraints = new GridBagConstraints();
        lebelHeader= new JLabel("Venus");
        font=new Font("Serif",Font.BOLD,36);
        lebelHeader.setFont(font);
        constraints.anchor=GridBagConstraints.WEST;
        addComponent(lebelHeader,0,0,2,1);
        planetOfVenus=new JLabel(PhotosOfPlanets.iconOfVenus);
        addComponent(planetOfVenus,1,0,2,6);
        venusProperties=new JLabel[5];
        venusProp();
        insideVenus=new JLabel("Inside Venus");
        font=new Font("Serif",Font.BOLD,30);
        insideVenus.setFont(font);
        addComponent(insideVenus,7,0,1,1);
        veneraEx1=new JLabel("From the 70's the Russian sent to Venus 14 probes to explore the surface of Venus. ");
        addComponent(veneraEx1,8,0,5,1);
        veneraEx2=new JLabel("The following photos were taken by those probes:");
        addComponent(veneraEx2,9,0,2,3);
        planetOfVenus=new JLabel(PhotosOfPlanets.insideVenus1);
        addComponent(planetOfVenus,12,0,2,6);
        planetOfVenus=new JLabel(PhotosOfPlanets.insideVenus2);
        addComponent(planetOfVenus,12,3,2,6);
        planetOfVenus=new JLabel(PhotosOfPlanets.insideVenus3);
        addComponent(planetOfVenus,12,6,2,6);




    }

    private void venusProp(){
        venusProperties[0]=new JLabel("Temperature:    463C\u00B0");
        venusProperties[1]=new JLabel("Self rotation:  243 days");
        venusProperties[2]=new JLabel("Length of the day: 116days and 18 hours");
        venusProperties[3]=new JLabel("Number of moons: 0");
        venusProperties[4]=new JLabel("Distance from the sun: 108,208,926km");
        addVenusProp();
    }


    private void addVenusProp(){
        for(int i=0;i<venusProperties.length;i++){
            addComponent(venusProperties[i],i+1,3,2,1);
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
