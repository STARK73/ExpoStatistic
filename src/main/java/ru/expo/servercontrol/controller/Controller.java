package ru.expo.servercontrol.controller;

import org.springframework.web.bind.annotation.*;
import ru.expo.servercontrol.model.Status;

@RestController
public class Controller {
    private Status status;


    @GetMapping("/")
    public Status greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return status;
    }

    @PostMapping("/")
    public Status pay(@RequestBody Status status) {
        this.status = status;
        return new Status();
    }

}