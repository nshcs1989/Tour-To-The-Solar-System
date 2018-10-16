import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class PhotosOfPlanets {



    protected static ImageIcon pIcon;

    protected static ImageIcon iconOfVenus,iconOfMars, iconOfTitan, iconOfEarth, iconOfMercury;
    protected static ImageIcon iconOfJupiter,iconOfSaturn, iconOfUranus, iconOfNeptune;
    protected static ImageIcon insideVenus1, insideVenus2, insideVenus3;
    protected static ImageIcon insideMars1, insideMars2, insideMars3, phobos, deimos;
    protected static ImageIcon insideTitan1, insideTitan2, insideTitan3;



    static {



        try{

            //*********************** Photos Of Solar System*********************************************************
            String path="https://www.246.co.il/daat/images/solsystem.gif";
            URL url  = new URL(path);
            BufferedImage icon = ImageIO.read(url);
            pIcon= new ImageIcon(icon);



            //*********************** Photos Of Venus ***********************************************************
            path="http://cronodon.com/sitebuilder/images/Venus_clouds-476x493.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            ImageIcon tempIcon= new ImageIcon(icon);
            iconOfVenus = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://i.redditmedia.com/sWy3hCLUKlVUQPgXFFZdUi5thKR9QwmnGFXORNhmC44.jpg?s=fe95700a631433e679a15af147a7b368";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideVenus1 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://pp.userapi.com/F0u-Bk_96LS765uu55i5A8uRUhPvwqU0hL2Asg/hFUm6kKrBcE.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideVenus2 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://lh3.googleusercontent.com/-oWxheoRsGfU/V4ppv_aq7zI/AAAAAAAACF8/Wi2DkH1sRMs_RtLR6CWW1zVHwSdRW7c5Q/w424-h318-n/venus-surface-1024.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideVenus3 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));




            //*********************** Photos Of Mars ***************************************************************
            path="https://timedotcom.files.wordpress.com/2018/05/life-mars-launch-rover-weintraub-david-book.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfMars = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="http://www.naijaloaded.com.ng/wp-content/uploads/2015/04/221-700x394.jpeg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideMars1 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="http://www.naijaloaded.com.ng/wp-content/uploads/2015/04/55-700x467.jpeg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideMars2 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="http://www.naijaloaded.com.ng/wp-content/uploads/2015/04/114-700x625.jpeg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideMars3 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://www.avaruus.fi/uploads/pics/PSP_007769_9010.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            phobos = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://apod.nasa.gov/apod/image/0903/deimos_hirise.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            deimos = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));


            //*********************** Photos Of Titan  **************************************************************
            path="http://annesastronomynews.com/wp-content/uploads/2012/02/Titan.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfTitan = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));


            path="https://cnet1.cbsistatic.com/img/JslTEALsBrHWunAP6bNuHYreoSU=/970x0/2014/03/20/5cf8dab0-b0d3-11e3-a24e-d4ae52e62bcc/titan-artistconcept-browse.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideTitan1 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://2.bp.blogspot.com/-HXVHd3VMzqU/Wcmu9kTdw2I/AAAAAAAAC-8/SMV6k0EVeH0Imx_rVSlWd4KXkf8riFeKgCLcBGAs/s1600/image_4742_1-Titan-Electric-Sands.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideTitan2 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://s3-us-west-2.amazonaws.com/uw-s3-cdn/wp-content/uploads/sites/6/2015/04/04172506/Titan_Dunes_Antoine-Lucas-375x376.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            insideTitan3 = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));









            path="https://imgix.bustle.com/uploads/image/2018/3/21/cd0391ac-bcc8-4463-bc88-87189e984145-fotolia_95430604_subscription_monthly_m.jpg?w=970&h=582&fit=crop&crop=faces&auto=format&q=70";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfMercury = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/The_Earth_seen_from_Apollo_17.jpg/1024px-The_Earth_seen_from_Apollo_17.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfEarth = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://upload.wikimedia.org/wikipedia/commons/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfJupiter = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://nssdc.gsfc.nasa.gov/planetary/image/saturn.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfSaturn = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            path="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Uranus2.jpg/1024px-Uranus2.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfUranus = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));


            path="https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Neptune_Full.jpg/1024px-Neptune_Full.jpg";
            url  = new URL(path);
            icon = ImageIO.read(url);
            tempIcon= new ImageIcon(icon);
            iconOfNeptune = new ImageIcon(tempIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));







        } catch (IOException e){

            JOptionPane.showMessageDialog(null,"Could not find images from network.","ERROR",
                    JOptionPane.ERROR_MESSAGE);

            System.exit(-1);
        }

    }


}
