package Multimedia;

public abstract class MultimediaElement {
    protected String title;
    protected int duration;


  /*  CONSTRUCTOR PER IMMAGINE   */
    public MultimediaElement(String title) {
        this.title = title;
    }

    /*  CONSTRUCTOR PER VIDEO E REGISTRAZIONE AUDIO   */
    public MultimediaElement(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    /*  METODI   */
    public void play(){
        for (int i = 0; i < this.duration; i++) {
            System.out.println(this.title);
        }
    }


    /*   SETTERS & GETTERS  */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
