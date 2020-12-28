package Singleton;

import javafx.scene.image.ImageView;

public class Moon {

    private static ImageView bloodmoon;

    private static Moon instance = new Moon(bloodmoon){};

    private Moon(ImageView image){this.bloodmoon = image;}

    public static Moon getInstance(ImageView image){
        bloodmoon = image;
        return  instance;}

    public void setMoon(){
        if (bloodmoon.isVisible()){
            bloodmoon.setVisible(false);
            System.out.println("Moon is hidden");
        }else {
            System.out.println("Moon is displayed");
            bloodmoon.setVisible(true);
        }
    }
}
