package state;

import javafx.scene.image.ImageView;

public class NoBats implements State {

    ImageView batsImage;
    Bats bats;

    public NoBats(ImageView batsimage, Bats bats){
        this.bats = bats;
        this.batsImage = batsimage;
    }

    @Override
    public void doBats() {
        batsImage.setVisible(false);
        bats.changeState(bats.showBats());
        System.out.println("Bats are gone!!");
    }
}
