package ru.expo.servercontrol.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.expo.servercontrol.model.Status;
import ru.expo.servercontrol.service.TimeControl;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final AtomicInteger counter = new AtomicInteger();
    private TimeControl timeControl;
    private HashMap<String, List<Status>> statusListServer;

    @Autowired
    public StatusController(TimeControl timeControl) {
        this.timeControl = timeControl;
        statusListServer = timeControl.getStatusListServer();
    }

    @GetMapping()
    public List<Status> gatStatus() {
        List<Status> statusList = new ArrayList<>();
        for (Map.Entry<String, List<Status>> item : statusListServer.entrySet()) {
            statusList.add(item.getValue().get(item.getValue().size() - 1));
        }
        return statusList;
    }

    @GetMapping("/{id}")
    public ArrayList<Status> getStatusServer(@PathVariable String id) {
        ArrayList<Status> status = new ArrayList<>();
        Integer count = 10;
        for (Status item : statusListServer.get(id)) {
            status.add(item);
            if (count-- == 0) {
                break;
            }
        }
        return status;
    }

    @PostMapping()
    public Status postStatusServer(@RequestBody Status status) {
        status.setCountView(String.valueOf(counter.updateAndGet(n -> n + 1)));
        status.setDate(new Date());
        if (statusListServer.get(status.getNumServer()) == null) {
            statusListServer.put(status.getNumServer(), new ArrayList<>());
        }
        statusListServer.get(status.getNumServer()).add(status);
        return status;
    }

}