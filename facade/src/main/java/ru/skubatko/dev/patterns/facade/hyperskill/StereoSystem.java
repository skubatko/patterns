package ru.skubatko.dev.patterns.facade.hyperskill;

public class StereoSystem {
    private String description;
    private String trackTitle;
    private int volume;

    StereoSystem() {
        this.description = "Stereo system";
        this.volume = 50;
    }

    void on() {
        System.out.println(description + " is turning on");
    }

    void off() {
        System.out.println(description + " is turning off");
    }

    void playTrack(String title) {
        this.trackTitle = title;
        System.out.println(title + " is playing");
    }

    public void pause() {
        System.out.println("Track: \"" + trackTitle + "\" were paused");
    }

    public String getTrackTitle() {
        return ("The current track is: \"" + trackTitle + "\"");
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }
}
