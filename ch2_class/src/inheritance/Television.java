package inheritance;

public class Television implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Television를 킵니다");
    }

    @Override
    public void turnoff() {
        System.out.println("Television를 끕니다");
    }

    private int volume;

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Television 볼륨 :" + this.volume);

    }

}
