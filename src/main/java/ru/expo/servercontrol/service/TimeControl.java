package ru.expo.servercontrol.service;

import org.springframework.stereotype.Service;
import ru.expo.servercontrol.model.Status;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class TimeControl {

    private Integer TIME_LIMIT = 5; //5 минут
    private Integer TIME_LIMIT_DELL = 2; //1440; //1 день

    private HashMap<String, List<Status>> statusListServer;

    public TimeControl() {
        statusListServer = new HashMap<>();
        Thread thread = new Thread(task);
        thread.start();
    }

    public HashMap<String, List<Status>> getStatusListServer() {
        return statusListServer;
    }

    Runnable task = () -> {
        while (true) {
            try {
                checkRun();
                System.out.println("---");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private void checkRun() {
        for (Map.Entry<String, List<Status>> item : statusListServer.entrySet()) {
            Long time = getDateDiff(item.getValue().get(item.getValue().size() - 1).getDate(), new Date(), TimeUnit.MINUTES);
            if(time > TIME_LIMIT) {

            }
            if(time > TIME_LIMIT_DELL) {
                statusListServer.remove(item.getKey());
            }
            System.out.println(item.getValue().get(item.getValue().size() - 1).getNumServer() + " - " + time);
        }
    }

    private static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }
}
