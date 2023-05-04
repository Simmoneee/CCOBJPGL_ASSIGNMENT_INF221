import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet uranus = new Uranus();
        Planet neptune = new Neptune();
        Planet jupiter = new Jupiter();
        Planet earth = new Earth();


        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        venus.accept(astronaut);
        uranus.accept(astronaut);
        neptune.accept(astronaut);
        jupiter.accept(astronaut);
        earth.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        venus.accept(rover);
        uranus.accept(rover);
        neptune.accept(rover);
        jupiter.accept(rover);
        earth.accept(rover);
    }
}