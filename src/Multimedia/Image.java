package Multimedia;

public class Image extends MultimediaElement implements ShowBrightness{
    int brightness = 3;

    public Image(String title) {
        super(title);
    }

    /* METODI LUMINOSITA' */
    public int brightnessReducer() {
        return brightness-1;
    }

    public int brightnessIncreaser(){
        return brightness+1;
    }
    
    @Override
    public void show() {
            String brightnessIndicator = "*";
            for (int k = 0; k < this.brightness; k++) {
                System.out.println(brightnessIndicator);
            }
        }
    }
}
