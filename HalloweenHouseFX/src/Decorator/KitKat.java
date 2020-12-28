package Decorator;

import javafx.scene.image.ImageView;

public class KitKat extends Candy{
    private CandyBoxInterface box;

    public KitKat(CandyBoxInterface newBox){
        super(newBox);
        this.box = newBox;
    }

    @Override
    public String getDescription(){
        return tempBox.getDescription() + ", KitKat";
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
