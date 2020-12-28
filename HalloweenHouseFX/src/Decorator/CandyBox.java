package Decorator;

import javafx.scene.image.ImageView;

public class CandyBox implements CandyBoxInterface {

    @Override
    public String getDescription() {
        return "Trick or Treat candy: ";
    }

    @Override
    public void setImage(ImageView imageView) {
    }
}
