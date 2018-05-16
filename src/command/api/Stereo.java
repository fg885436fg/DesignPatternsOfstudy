package command.api;

/**
 * 音响，发出请求的对象
 *
 * @author: lanyubing
 * @create: 2018-05-15 18:15
 **/
public class Stereo {
    public void on() {
        System.out.println("打开音响");
    }

    public void setCD() {
        System.out.println("放入CD");
    }

    public void setVolume(int i) {
        System.out.println("设置播放音量为：" + i);
    }

    public void off() {
        System.out.println("关闭音响");
    }
}
