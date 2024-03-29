package spring.course.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class TimeresponseApi {
    private String utc_datetime;
    public TimeresponseApi(String dateTime) {
        this.utc_datetime = dateTime;
    }
    public String getUtc_datetime() {
        return utc_datetime;
    }

    public void setUtc_datetime(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }




}
