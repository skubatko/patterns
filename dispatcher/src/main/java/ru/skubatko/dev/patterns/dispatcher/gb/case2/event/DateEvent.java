package ru.skubatko.dev.patterns.dispatcher.gb.case2.event;

import java.util.Date;

public class DateEvent implements Event<Date>{
    private Date created;

    public DateEvent() {
        this.created = new Date();
    }

    @Override
    public Date getContent() {
        return created;
    }

}
