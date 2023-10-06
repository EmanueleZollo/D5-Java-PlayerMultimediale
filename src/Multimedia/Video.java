package Multimedia;

public class Video extends MultimediaElement{
    int volume = 3;
    int brightness = 3;

    public Video(String title, int duration) {
        super(title, duration);
    }

   /* METODI VOLUME */
    public int volumeReducer() {
        return volume-1;
    }

    public int volumeIncreaser(){
        return volume+1;
    }

    /* METODI LUMINOSITA' */
    public int brightnessReducer() {
        return brightness-1;
    }

    public int brightnessIncreaser(){
        return brightness+1;
    }


    @Override
    public void play() {
        super.play();
        String volumeIndicator = "!";
        String brightnessIndicator = "*";
        for (int j = 0; j < this.volume; j++){
            System.out.println(volumeIndicator);
        }
        for (int k = 0; k < this.brightness; k++) {
            System.out.println(brightnessIndicator);
        }
    }
}
