package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.Technical;
import com.studiobookingsheet.factory.TechnicalFactory;
import com.studiobookingsheet.services.Impl.TechnicalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Controller
@RequestMapping(path = "/technical")
public class TechnicalController {

    private Technical technical;

    @Autowired
    private TechnicalServiceImpl technicalService;


    @CrossOrigin
    @GetMapping(path = "/addTechnical")
    public @ResponseBody Technical create(@RequestParam String name)
    {
        technical = TechnicalFactory.getTechnical(name);
        return technicalService.create(technical);
    }

    @CrossOrigin
    @GetMapping(path="/readTechnical")
    public @ResponseBody Technical read(@RequestParam long id)
    {
        return technicalService.read(id);
    }

    @CrossOrigin
    @GetMapping(path = "/updateTechnical")
    public @ResponseBody Technical update(@RequestParam long id, String name)
    {
        Technical updateTechnical = new Technical.Builder()
                .id(id)
                .name(name)
                .build();
        return technicalService.update(updateTechnical);
    }

    @CrossOrigin
    @GetMapping(path="/delete")
    public void  delete(@RequestParam long id)
    {
        technicalService.delete(id);
    }

    @CrossOrigin
    @GetMapping(path="/findAll")
    public @ResponseBody Iterable<Technical> findAll()
    {
        return technicalService.findAll();
    }


}
