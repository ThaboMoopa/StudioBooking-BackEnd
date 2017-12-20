package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.ProgramSlot;
import com.studiobookingsheet.factory.ProgramSlotFactory;
import com.studiobookingsheet.services.Impl.ProgramSlotServiceImpl;
import com.studiobookingsheet.services.ProgramSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by thabomoopa on 2017/11/19.
 */
@Controller
@RequestMapping(path = "/programSlot")
public class ProgramSlotController {

    private ProgramSlot programSlot;

    @Autowired
    private ProgramSlotServiceImpl programSlotService;

    @CrossOrigin
    @GetMapping(path = "/addProgramSlot")
    public @ResponseBody ProgramSlot create(@RequestParam String name, @RequestParam String time)
    {
        programSlot = ProgramSlotFactory.getProgramSlot(name, time);

        return programSlotService.create(programSlot);
    }

    @CrossOrigin
    @GetMapping(path = "/readProgramSlot")
    public @ResponseBody ProgramSlot read(@RequestParam long id)
    {
        return programSlotService.read(id);
    }

    @CrossOrigin
    @GetMapping(path = "/updateProgramSlot")
    public @ResponseBody ProgramSlot update(@RequestParam long id, @RequestParam String name, @RequestParam String time)
    {
        ProgramSlot programSlot = new ProgramSlot.Builder()
                .id(id)
                .name(name)
                .time(time)
                .build();
        return programSlotService.update(programSlot);
    }

    @CrossOrigin
    @GetMapping(path = "/deleteProgramSlot")
    public @ResponseBody void delete(@RequestParam long id)
    {
        programSlotService.delete(id);
    }

    @CrossOrigin
   @GetMapping(path = "/findByName")
    public @ResponseBody  Iterable<ProgramSlot> findAllByName(@RequestParam String search)
    {
       return programSlotService.findByNameContaining(search);

    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<ProgramSlot> findAll()
    {
        return programSlotService.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/findByIndividualName")
    public @ResponseBody  ProgramSlot findByName(@RequestParam String search)
    {
        return programSlotService.findByName(search);

    }
    @CrossOrigin
    @GetMapping(path = "/findByTime")
    public @ResponseBody  ProgramSlot findByTime(@RequestParam String time)
    {
        return programSlotService.findByTime(time);

    }
//    @CrossOrigin
//    @GetMapping(path = "/Search")
//    public @ResponseBody Iterable<ProgramSlot> findByName(@RequestParam String search)
//    {
//        return programSlotService.findByName(search);
//    }
}
