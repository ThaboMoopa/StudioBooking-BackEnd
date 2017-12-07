package com.studiobookingsheet.DataLoading;

import com.studiobookingsheet.domain.ProgramSlot;
import com.studiobookingsheet.factory.ProgramSlotFactory;
import com.studiobookingsheet.services.Impl.ProgramSlotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thabomoopa on 2017/11/19.
 */
@Component
public class ProgramSlotLoad {

    private ProgramSlotServiceImpl programSlotService;

    private ProgramSlot programSlot;


    @Autowired
    public void loadProgramSlot(ProgramSlotServiceImpl programSlotService)
    {
        this.programSlotService = programSlotService;
        loadPrograms();
    }

    public void loadPrograms() {

        programSlot = ProgramSlotFactory.getProgramSlot("well_informed", "12h30" );
        programSlotService.create(programSlot);
        programSlot = ProgramSlotFactory.getProgramSlot("bible_toolbox", "14h30" );
        programSlotService.create(programSlot);
    }

}
