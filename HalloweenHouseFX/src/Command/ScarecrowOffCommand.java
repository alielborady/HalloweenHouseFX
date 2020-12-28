package Command;

import javafx.scene.image.ImageView;

public class ScarecrowOffCommand implements Command {
    Scarecrow scarecrow;

    public ScarecrowOffCommand(Scarecrow scarecrow) {
        this.scarecrow = scarecrow;
    }

    @Override
    public void execute() {
        scarecrow.off();
    }

    @Override
    public void execute(ImageView imageView) {
        scarecrow.off(imageView);
    }
}
