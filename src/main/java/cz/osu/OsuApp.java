package cz.osu;

import cz.osu.utils.IntroductionDisplayer;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

@Slf4j
public class OsuApp {

    public static void main(String[] args) {
        System.out.println(IntroductionDisplayer.renderIntroduction());

        GuiEngine guiEngine = new GuiEngine();

        Point point1 = new Point(50, 50, Color.RED, guiEngine);

        guiEngine.addShape(new Rectangle(50,50,100,100,Color.RED));
        guiEngine.printEnvironment();
        /*for (int i = 0; i < 600; i++) {
            point1.draw();
            guiEngine.pause(1);
            point1.shiftCoordinates(1, 0);
        }

        for (int i = 0; i <= 600; i++) {
            point1.erase();
            guiEngine.pause(1);
            point1.shiftCoordinates(-1, 0);
        }*/
    }


}
