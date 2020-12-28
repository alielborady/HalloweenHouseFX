package state;

import javafx.scene.image.ImageView;

public class Bats {

    private State showBats;
    private State noBats;
    private State state;
    ImageView batsImage;

    public Bats(ImageView image){
        this.batsImage = image;
        showBats = new ShowBats(image, this);
        noBats = new NoBats(image,this);
        state = showBats;
    }

    public void changeState(State state){ this.state = state; }

    public void doBats(){state.doBats();}

    public State showBats(){ return showBats; }

    public State noBats(){ return noBats; }

}
