package inheritance;

public class Audio implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("Audio를 킵니다");
    }

    @Override
    public void turnoff() {
        System.out.println("Audio를 끕니다");
    }

    private int voloume;

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MAX_VOLUME) {
            volume = RemoteControl.MIN_VOLUME;
        } else {
            this.voloume = volume;

        }
        System.out.println("현재 Audio 볼륨 :" + this.voloume);

    }

}
