package ru.expo.servercontrol.controller;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;
import ru.expo.servercontrol.model.Statistic;

@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/")
    public Statistic greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Statistic(String.format(template, name));
    }

    @PostMapping("/")
    public Statistic pay(@RequestBody @RequestParam Map<String, String> body) {

        return new Statistic("22");
    }

}