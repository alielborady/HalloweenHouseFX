package main;

import Facade.ScaryMood;
import Command.RemoteLoader;
import state.*;
import Singleton.Moon;
import Decorator.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
//import strategy.LightChristmas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Controller implements Initializable {

    @FXML
    private ImageView scarecrowImage;
    @FXML
    private ImageView pumpkin1, pumpkin2, rain, lightning;
    @FXML
    private ImageView batsImage, bloodmoon;
    @FXML
    private ImageView bountyImage, buenoImage, kitkatImage, twixImage;

    @FXML
    private Button Scarecrow, moon, bats, scary, candy, clear;

    @FXML
    private RadioButton bounty, bueno, kitkat, twix;

    CandyBoxInterface box = new CandyBox();
    Bats batsObj;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hideBats();
    }

    @FXML
    public void onClick(MouseEvent mouseEvent) {
        Button temp = (Button) mouseEvent.getSource();
        String id = temp.getId();

        switch ( id ){

            // Command Pattern (Scarecrow)
            case "Scarecrow":
                RemoteLoader.init(scarecrowImage);
                break;

            // State Pattern (Bats)
            case "bats":
                batsObj.doBats();
                break;

            // Facade Pattern (Scary Mood)
            case "scary":
                ScaryMood scaryMood = new ScaryMood(pumpkin1, pumpkin2, rain, lightning);
                scaryMood.setScaryMood();
                break;

            // Singleton Pattern (Blood Moon)
            case "moon":
                Moon moon = Moon.getInstance(bloodmoon);
                moon.setMoon();
                break;

            // Decorator Pattern (Trick or Treat)
            case "candy":
                TrickOrTreat.init(box, buenoImage,twixImage,bountyImage,kitkatImage);
                break;
        }
    }

    @FXML
    public void clearCandy(ActionEvent e){
        bounty.setSelected(false);
        bueno.setSelected(false);
        kitkat.setSelected(false);
        twix.setSelected(false);
        buenoImage.setVisible(false);
        twixImage.setVisible(false);
        bountyImage.setVisible(false);
        kitkatImage.setVisible(false);
        buenoImage.yProperty().set(0);
        buenoImage.xProperty().set(0);
        kitkatImage.yProperty().set(0);
        bountyImage.yProperty().set(0);
        twixImage.yProperty().set(0);
        twixImage.xProperty().set(0);
        box = null;
        box = new CandyBox();
    }

    @FXML
    public void listCandy(ActionEvent e){
        RadioButton btn = (RadioButton) e.getSource();
        String id = btn.getId();
        if(btn.isSelected() == false){
            clearCandy(e);
            return;
        }
        switch(id) {
            case "bounty":
                box = new Bounty(box);
                box.setImage(bountyImage);
                System.out.println(box.getDescription());
                break;
            case "bueno":
                box = new Bueno(box);
                box.setImage(buenoImage);
                System.out.println(box.getDescription());
                break;
            case "kitkat":
                box = new KitKat(box);
                box.setImage(kitkatImage);
                System.out.println(box.getDescription());
                break;
            case "twix":
                box = new Twix(box);
                box.setImage(twixImage);
                System.out.println(box.getDescription());

        }
    }

    private void hideBats(){
        batsImage.setVisible(false);
        batsObj = new Bats(batsImage);
    }
}
