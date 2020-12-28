package Command;

import javafx.scene.image.ImageView;

public class RemoteLoader {
    public static void init(ImageView scarecrowImage) {

        RemoteControl remote = new RemoteControl();
        Scarecrow scarecrow = new Scarecrow();
        ScarecrowOnCommand scareOn = new ScarecrowOnCommand(scarecrow);
        ScarecrowOffCommand scareOff = new ScarecrowOffCommand(scarecrow);


        if(scarecrow.getStatus()){
            remote.setCommand(scareOff);
        }else {
            remote.setCommand(scareOn);
        }
//        remote.setCommand(scarecrow.getStatus() ? scareOff : scareOn);
        remote.buttonPressed(scarecrowImage);
    }
}
