package command.command;

import command.api.Light;

/**
 * @author: lanyubing
 * @create: 2018-05-16 15:36
 **/
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
