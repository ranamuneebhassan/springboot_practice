package spring.course.services;

import kong.unirest.Unirest;
import org.springframework.stereotype.Service;
import spring.course.model.TimeresponseApi;

@Service
public class TimeServiceImp implements TimeService{
    @Override
    public String getCurrentTime(String timeZone) {

        TimeresponseApi timeResponse=Unirest.get("http://worldtimeapi.org/api/timezone/Europe/"+timeZone)
                .asObject(TimeresponseApi.class).getBody();
        System.out.println(timeResponse.getUtc_datetime());
        return timeResponse.getUtc_datetime();
    }
}
