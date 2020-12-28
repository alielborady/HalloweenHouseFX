package Decorator;

import javafx.scene.image.ImageView;

public class Bueno extends Candy {

    private CandyBoxInterface box;

    public Bueno(CandyBoxInterface newBox){
        super(newBox);
        this.box = newBox;
    }

    @Override
    public String getDescription(){
        return tempBox.getDescription() + ", Bueno";
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
