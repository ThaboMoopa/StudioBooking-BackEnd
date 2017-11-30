package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.Colours;
import com.studiobookingsheet.factory.ColoursFactory;
import com.studiobookingsheet.services.ColoursService;
import com.studiobookingsheet.services.Impl.ColoursServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by thabomoopa on 26/11/2017.
 */
@Controller
@RequestMapping(path = "/colours")
public class ColoursController {

    private Colours colours;

    @Autowired
    private ColoursServiceImpl coloursService;

    @CrossOrigin
    @RequestMapping(path = "/addColour")
    public @ResponseBody Colours create(@RequestParam String name)
    {
        colours = ColoursFactory.getColours(name);
        return coloursService.create(colours);
    }

    @CrossOrigin
    @RequestMapping(path = "/readColour")
    public @ResponseBody Colours read(@RequestParam long id)
    {
        return coloursService.read(id);
    }
    @CrossOrigin
    @RequestMapping(path = "/updateColour")
    public @ResponseBody Colours update(@RequestParam long id, @RequestParam String name)
    {
        Colours updateColours = new Colours.Builder()
                .id(id)
                .colorName(name)
                .build();
        return coloursService.update(updateColours);
    }
    @CrossOrigin
    @RequestMapping(path = "/deleteColour")
    public @ResponseBody void delete(@RequestParam long id)
    {
        coloursService.delete(id);
    }

    @CrossOrigin
    @RequestMapping(path = "/findAll")
    public @ResponseBody Iterable<Colours> findAll()
    {
        return coloursService.findAll();
    }
}
