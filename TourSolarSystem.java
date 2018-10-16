import javax.swing.*;
import java.awt.*;

/*
    TourSolarSystem is a JFrame which consists of photos and general information about all the planets in our solar system.
*/

public class TourSolarSystem extends JFrame {

    private final GridBagLayout layout;
    private final GridBagConstraints constraints;
    private JLabel lebelHeader, rocketPlants1,rocketPlants2, gasGiantsPlanets1, gasGiantsPlanets2, gasGiantsPlanets3;
    private JLabel mercuryProperties[],venusProperties[], earthProperties[], marsProperties[];
    private JLabel jupiterProperties[],saturnProperties[], uranusProperties[], neptuneProperties[];
    private Font font;

    public TourSolarSystem()
    {
        super("Our Solar System");

        layout = new GridBagLayout();
        setLayout(layout);
        constraints = new GridBagConstraints();
        lebelHeader= new JLabel("Our Solar System");
        font=new Font("Serif",Font.BOLD,30);
        lebelHeader.setFont(font);

        constraints.anchor=GridBagConstraints.CENTER;
        addComponent(lebelHeader,0,0,15,1);

        constraints.anchor=GridBagConstraints.WEST;
        rocketPlants1=new JLabel("Rocky Planets- the following planets have a solid surface");
        font=new Font("Serif",Font.BOLD,20);
        rocketPlants1.setFont(font);
        addComponent(rocketPlants1,3,0,15,1);
        addRocketPlantesLabel();




        addComponent((new JLabel(PhotosOfPlanets.iconOfMercury)),5,0,7,6);
        addComponent((new JLabel(PhotosOfPlanets.iconOfVenus)),5,4,7,6);
        addComponent((new JLabel(PhotosOfPlanets.iconOfEarth)),5,8,7,6);
        addComponent((new JLabel(PhotosOfPlanets.iconOfMars)),5,12,7,6);
        mercuryProp();
        venusProp();
        earthProp();
        marsProp();

        addComponent((new JLabel(" ")),19,0,15,2);

        gasGiantsPlanets1 = new JLabel("The Gas Giants");
        gasGiantsPlanets2 = new JLabel("The following planets, most of their mass is made of gas.");
        gasGiantsPlanets3 = new JLabel("Therefore, these stars do not have solid ground.");
        font=new Font("Serif",Font.BOLD,18);
        gasGiantsPlanets1.setFont(font);
        font=new Font("Serif",Font.BOLD,14);
        gasGiantsPlanets2.setFont(font);
        gasGiantsPlanets3.setFont(font);
        addComponent(gasGiantsPlanets1, 22,0,15,1);
        addComponent(gasGiantsPlanets2, 23,0,15,1);
        addComponent(gasGiantsPlanets3, 24,0,15,1);
        addGasPlantesLabel();

        addComponent((new JLabel(PhotosOfPlanets.iconOfJupiter)),27,0,7,6);
        addComponent((new JLabel(PhotosOfPlanets.iconOfSaturn)),27,4,7,6);
        addComponent((new JLabel(PhotosOfPlanets.iconOfUranus)),27,8,7,6);
        addComponent((new JLabel(PhotosOfPlanets.iconOfNeptune)),27,12,7,6);


        jupiterProp();
        saturnProp();
        uranusProp();
        neptuneProp();


    }

    private void addRocketPlantesLabel(){
        font= new Font("Serif",Font.BOLD,18);
        rocketPlants2= new JLabel("Mercury");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,4,0,7,1);
        rocketPlants2= new JLabel("Venus");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,4,4,7,1);
        rocketPlants2= new JLabel("Earth");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,4,8,7,1);
        rocketPlants2= new JLabel("Mars");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,4,12,7,1);
    }
    private void mercuryProp(){
        mercuryProperties=new JLabel[5];
        mercuryProperties[0]=new JLabel("Temperature:    698C\u00B0");
        mercuryProperties[1]=new JLabel("Self rotation:  58.6462 days");
        mercuryProperties[2]=new JLabel("Length of the day: 58 days, 15.5 hours");
        mercuryProperties[3]=new JLabel("Number of moons: 0 ");
        mercuryProperties[4]=new JLabel("Distance from the sun: 57,910,000km");
        addPlantes(mercuryProperties,12,0);
    }




    private void venusProp(){
        venusProperties=new JLabel[5];
        venusProperties[0]=new JLabel("Temperature:    463C\u00B0");
        venusProperties[1]=new JLabel("Self rotation:  243 days");
        venusProperties[2]=new JLabel("Length of the day: 116days and 18 hours");
        venusProperties[3]=new JLabel("Number of moons: 0");
        venusProperties[4]=new JLabel("Distance from the sun: 108,208,926km");
        addPlantes(venusProperties,12,4);
    }

    private void earthProp(){
        earthProperties= new JLabel[5];
        earthProperties[0]=new JLabel("Temperature:    14C\u00B0");
        earthProperties[1]=new JLabel("Self rotation:  24 hours.");
        earthProperties[2]=new JLabel("Length of the day: 24 hours");
        earthProperties[3]=new JLabel("Number of moons: 1 ");
        earthProperties[4]=new JLabel("Distance from the sun: 149,600,000km");
        addPlantes(earthProperties,12,8);
    }




    private void marsProp(){
        marsProperties=new JLabel[5];
        marsProperties[0]=new JLabel("Temperature:    -63.15C\u00B0");
        marsProperties[1]=new JLabel("Self rotation:  243 days");
        marsProperties[2]=new JLabel("Length of the day: 24.6229 hours");
        marsProperties[3]=new JLabel("Number of moons: 2 (Phobos, Deimos) ");
        marsProperties[4]=new JLabel("Distance from the sun: 227,900,000km");
        addPlantes(marsProperties,12,12);
    }


    private void addGasPlantesLabel(){
        font= new Font("Serif",Font.BOLD,18);
        rocketPlants2= new JLabel("Jupiter");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,25,0,7,1);
        rocketPlants2= new JLabel("Saturn");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,25,4,7,1);
        rocketPlants2= new JLabel("Uranus");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,25,8,7,1);
        rocketPlants2= new JLabel("Neptune");
        rocketPlants2.setFont(font);
        addComponent(rocketPlants2,25,12,7,1);
    }

    private void jupiterProp(){
        jupiterProperties=new JLabel[5];
        jupiterProperties[0]=new JLabel("Temperature:    -121C\u00B0");
        jupiterProperties[1]=new JLabel("Orbital period:  11 years");
        jupiterProperties[2]=new JLabel("Length of the day: 9 hours, 55 minutes");
        jupiterProperties[3]=new JLabel("Number of moons: 79  ");
        jupiterProperties[4]=new JLabel("Distance from the sun:  778,500,000km");
        addPlantes(jupiterProperties,35,0);
    }


    private void saturnProp(){
        saturnProperties=new JLabel[5];
        saturnProperties[0]=new JLabel("Temperature:    -130C\u00B0");
        saturnProperties[1]=new JLabel("Orbital period:  29 years");
        saturnProperties[2]=new JLabel("Length of the day: 10 hours, 32 minutes");
        saturnProperties[3]=new JLabel("Number of moons: 62 ");
        saturnProperties[4]=new JLabel("Distance from the sun: 1,426,725,413km");
        addPlantes(saturnProperties,35,4);
    }




    private void uranusProp(){
        uranusProperties=new JLabel[5];
        uranusProperties[0]=new JLabel("Temperature:    -220C\u00B0");
        uranusProperties[1]=new JLabel("Orbital period:  84 years");
        uranusProperties[2]=new JLabel("Length of the day:  17 hours, 14 minutes");
        uranusProperties[3]=new JLabel("Number of moons: 27");
        uranusProperties[4]=new JLabel("Distance from the sun: 2,870,972,220km");
        addPlantes(uranusProperties,35,8);
    }




    private void neptuneProp(){
        neptuneProperties=new JLabel[5];
        neptuneProperties[0]=new JLabel("Temperature:    -220C\u00B0");
        neptuneProperties[1]=new JLabel("Orbital period::  165 years");
        neptuneProperties[2]=new JLabel("Length of the day: 16 hours, 6 minutes");
        neptuneProperties[3]=new JLabel("Number of moons: 14");
        neptuneProperties[4]=new JLabel("Distance from the sun: 4,498,252,900km");
        addPlantes(neptuneProperties,35,12);
    }


    private void addPlantes(JLabel planetProperties[], int row, int col){
        for(int i=0;i<planetProperties.length;i++){
            addComponent(planetProperties[i],row+i,col,3,1);
            addComponent(new JLabel("      "),row+i,col+3,1,1);

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
