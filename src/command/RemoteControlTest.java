package command;

import command.api.GarageDoor;
import command.api.Light;
import command.command.GarageDoorOpenCommand;
import command.command.LightOnCommand;

/**
 * 测试遥控器
 *
 * @author: lanyubing
 * @create: 2018-05-16 15:43
 **/
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote =  new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
