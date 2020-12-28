package state;

import javafx.scene.image.ImageView;

public class ShowBats implements State{

    ImageView batsImage;
    private final Bats bats;

    public ShowBats(ImageView batsimage, Bats bats){
        this.bats = bats;
        this.batsImage = batsimage;
    }

    @Override
    public void doBats() {
        batsImage.setVisible(true);
        bats.changeState(bats.noBats());
        System.out.println("Bats are flying!!");
    }
}
