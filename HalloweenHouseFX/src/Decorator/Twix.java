package Decorator;

import javafx.scene.image.ImageView;

public class Twix extends  Candy{
    private CandyBoxInterface box;

    public Twix(CandyBoxInterface newBox){
        super(newBox);
        this.box = newBox;
    }

    @Override
    public String getDescription(){
        return tempBox.getDescription() + ", Twix";
    }

    @Override
    public void setImage(ImageView imageView){
        if (!imageView.isVisible()) {
            imageView.setVisible(true);
        }else{
            imageView.setVisible(false);
        }
    }
}
