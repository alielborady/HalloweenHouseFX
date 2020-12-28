package Command;

import javafx.scene.image.ImageView;

public class ScarecrowOnCommand implements Command {
    Scarecrow scarecrow;

    public ScarecrowOnCommand(Scarecrow scarecrow) {
        this.scarecrow = scarecrow;
    }

    @Override
    public void execute() {
        scarecrow.on();
    }

    @Override
    public void execute(ImageView imageView) {
        scarecrow.on(imageView);
    }

}
