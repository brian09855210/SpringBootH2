package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class ScheduleTask {
	
	@Scheduled(fixedRate = 1000 * 1)
    public void reportCurrentTime(){
        System.out.println(dateFormat().format(new Date()));
    }

//    @Scheduled(cron = "0 */1 *  * * * ")
//    public void reportCurrentByCron(){
//        System.out.println (dateFormat ().format (new Date()));
//    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat("HH:mm:ss");
    }
    
    
}
