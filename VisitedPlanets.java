import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VisitedPlanets extends JFrame implements ActionListener {

    private JButton cmdVenus, cmdMars, cmdTitan;
    private JLabel label1, labelVisitedPlanets, labelInst, labelVenus , labelMars, labelTitan;

    private JLabel pVenus, pMars, pTitan;

    private Font font;

    private final GridBagLayout layout;
    private final GridBagConstraints constraints;



    public VisitedPlanets()
    {
        super("Visited Planets by Human");

        layout = new GridBagLayout();
        setLayout(layout);
        constraints = new GridBagConstraints();
        font = new Font("Serif",Font.BOLD,36);
        constraints.anchor=GridBagConstraints.NORTH;
        label1= new JLabel("Planets Human Visited");
        label1.setFont(font);
        addComponent(label1,0,1,1,2);
        constraints.anchor=GridBagConstraints.NORTHWEST;
        labelVisitedPlanets = new JLabel("During the history, human visited by probs the following planets:" +
                " Venus, Mars and Titan (- the moon of Saturn).");
        labelInst = new JLabel("Press one of the buttons inorder to learn about the planets human visited.");
        font = new Font("Serif",Font.BOLD,18);
        labelVisitedPlanets.setFont(font);
        labelInst.setFont(font);
        addComponent(labelVisitedPlanets,3,0,15,1);
        addComponent(labelInst,4,0,15,1);

        constraints.anchor=GridBagConstraints.CENTER;

        labelVenus = new JLabel("Venus");
        labelMars = new JLabel("Mars");
        labelTitan = new JLabel("Titan");
        font = new Font("Serif",Font.BOLD,20);
        labelVenus.setFont(font);
        labelMars.setFont(font);
        labelTitan.setFont(font);
        addComponent(labelVenus,6,0,1,1);
        addComponent(labelMars,6,1,1,1);
        pVenus=new JLabel(PhotosOfPlanets.iconOfVenus);
        addComponent(labelTitan,6,2,1,1);
        addComponent(pVenus,7,0,1,1);
        pMars=new JLabel(PhotosOfPlanets.iconOfMars);
        addComponent(pMars,7,1,1,1);
        pTitan=new JLabel(PhotosOfPlanets.iconOfTitan);
        addComponent(pTitan,7,2,1,1);

        cmdVenus=new JButton("Vist Venus");
        cmdVenus.addActionListener(this);
        addComponent(cmdVenus,8,0,1,1);
        cmdMars=new JButton("Visit Mars");
        cmdMars.addActionListener(this);
        addComponent(cmdMars,8,1,1,1);
        cmdTitan=new JButton("Visit Titan");
        cmdTitan.addActionListener(this);
        addComponent(cmdTitan,8,2,1,1);





    }

    private void addComponent(Component component, int row, int colum, int width, int height){

        constraints.gridx=colum;
        constraints.gridy=row;
        constraints.gridwidth=width;
        constraints.gridheight=height;
        layout.setConstraints(component,constraints);
        add(component);
    }


    public void actionPerformed(ActionEvent e){

        if (e.getSource() == cmdVenus)
            openVenus();
        else if (e.getSource() == cmdMars)
            openMars();
        else if (e.getSource() == cmdTitan)
            openTitan();

    }

    private void openVenus(){
        Venus venus = new Venus();
        venus.setVisible(true);
        venus.setSize(800,500);
    }

    private void openMars(){
        Mars mars = new Mars();
        mars.setVisible(true);
        mars.setSize(800,600);
    }

    private void openTitan(){

        Titan titan = new Titan();
        titan.setVisible(true);
        titan.setSize(1000,500);
    }


}
