package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.StudioTimes;
import com.studiobookingsheet.factory.StudioTimesFactory;
import com.studiobookingsheet.services.Impl.StudioTimesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by thabomoopa on 2017/11/19.
 */
@Controller
@RequestMapping(path = "/studioTimes")
public class StudioTimesController {

    private StudioTimes studioTimes;

    @Autowired
    private StudioTimesServiceImpl studioTimesService;

    @CrossOrigin
    @GetMapping(path = "/addStudioTimes")
    public @ResponseBody
    StudioTimes create(@RequestParam String times)
    {
        studioTimes = StudioTimesFactory.getStudioTimes(times);
        return studioTimesService.create(studioTimes);
    }

    @CrossOrigin
    @GetMapping(path = "/readStudioTime")
    public @ResponseBody StudioTimes read(@RequestParam long id)
    {
        return studioTimesService.read(id);
    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<StudioTimes> findAll()
    {
        return studioTimesService.findAll();
    }

}
