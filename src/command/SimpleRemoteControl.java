package command;

import command.command.Command;

/**
 * 简单的命令类
 * @author: lanyubing
 * @create: 2018-05-16 15:40
 **/
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }
    public  void buttonWasPressed(){
        slot.execute();
    }

}
