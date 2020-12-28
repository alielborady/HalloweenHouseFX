package Command;

import javafx.scene.image.ImageView;

public class Scarecrow {
    private static Boolean status = false;

    public void on() {
        status = true;
        System.out.println("Scarecrow displayed.");
    }

    public void off() {
        status = false;
        System.out.println("Scarecrow is hidden.");
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.println("Scarecrow displayed.");
        imageView.setVisible(true);
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.println("Scarecrow is hidden.");
        imageView.setVisible(false);
    }

    public Boolean getStatus() {
        return status;
    }
}
