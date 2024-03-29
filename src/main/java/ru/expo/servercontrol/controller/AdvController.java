package ru.expo.servercontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.expo.servercontrol.model.Adv;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/adv")
public class AdvController {

    private List<Adv> advs;
    @Autowired
    public AdvController() {
        advs = new ArrayList<>();
    }

    @PostMapping()
    public List<Adv> postAdv(@RequestBody List<Adv> advs) {
        for(Adv adv : advs){
            adv.setDate();
        }
        this.advs = advs;
        return advs;
    }

    @GetMapping()
    public List<Adv> getAdv() {
        return advs;
    }
}
