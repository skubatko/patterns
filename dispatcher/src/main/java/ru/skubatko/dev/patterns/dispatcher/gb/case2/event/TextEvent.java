package ru.skubatko.dev.patterns.dispatcher.gb.case2.event;

public class TextEvent implements Event<String>{

    private String text;

    public TextEvent(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }

}
