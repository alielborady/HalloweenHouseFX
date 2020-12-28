package Decorator;

import javafx.scene.image.ImageView;

public class TrickOrTreat {
    public static void init(CandyBoxInterface box, ImageView img1, ImageView img2, ImageView img3, ImageView img4) {

        if (img1.isVisible()) {
            img1.xProperty().set(-20);
            img1.yProperty().set(195);
        }
        if (img2.isVisible()) {
            img2.yProperty().set(160);
            img2.xProperty().set(20);
        }
        if (img3.isVisible()) {
            img3.yProperty().set(210);
        }
        if (img4.isVisible()) {
            img4.yProperty().set(160);
        }



    }
}
