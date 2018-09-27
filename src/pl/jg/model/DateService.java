package pl.jg.model;

import java.util.Date;

public class DateService {
    public String getDate () {
        Date now = new Date();
        return now.toString().substring(4);
    }
}
