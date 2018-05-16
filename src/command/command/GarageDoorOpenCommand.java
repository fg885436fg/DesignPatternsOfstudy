package command.command;

import command.api.GarageDoor;

/**
 * 车库门
 * @author: lanyubing
 * @create: 2018-05-16 16:07
 **/
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor ;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
