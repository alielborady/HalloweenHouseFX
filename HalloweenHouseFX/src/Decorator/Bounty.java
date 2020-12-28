package Decorator;

import javafx.scene.image.ImageView;

public class Bounty extends Candy {
    private CandyBoxInterface box;

    public Bounty(CandyBoxInterface newBox){
        super(newBox);
        this.box = newBox;
    }

    @Override
    public String getDescription(){
        return tempBox.getDescription() + ", Bounty";
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
