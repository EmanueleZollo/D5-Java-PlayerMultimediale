package Multimedia;

public class AudioRegistration extends MultimediaElement {
    int volume = 3;

    public AudioRegistration(String title, int duration) {
        super(title, duration);
    }

    public int volumeReducer() {
        return volume+1;
    }

    public int volumeIncreaser(){
        return volume-1;
    }

    @Override
    public void play() {
        super.play();
        String volumeIndicator = "!";
        for (int j = 0; j < this.volume; j++){
            System.out.println(volumeIndicator);
        }
    }
}
