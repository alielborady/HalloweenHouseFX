package Facade;

import javafx.scene.image.ImageView;

public class ScaryMood {

    ImageView pumpkin1, pumpkin2, rain, lightning;
    static boolean scaryOn=false;

    public ScaryMood(ImageView pumpkin1, ImageView pumpkin2, ImageView rain, ImageView lightning){
        this.pumpkin1 = pumpkin1;
        this.pumpkin2 = pumpkin2;
        this.rain = rain;
        this.lightning = lightning;
    }

    public void setScaryMood() {
        if(scaryOn)
        {
            pumpkin1.setVisible(false);
            pumpkin2.setVisible(false);
            rain.setVisible(false);
            lightning.setVisible(false);
            scaryOn=false;
            System.out.println("Scary mood is off");
        }
        else
        {
            pumpkin1.setVisible(true);
            pumpkin2.setVisible(true);
            rain.setVisible(true);
            lightning.setVisible(true);
            scaryOn=true;
            System.out.println("Scary mood is on");
        }
    }

}
