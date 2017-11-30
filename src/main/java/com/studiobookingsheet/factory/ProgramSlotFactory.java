package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.ProgramSlot;

/**
 * Created by thabomoopa on 2017/11/19.
 */
public class ProgramSlotFactory {
    public static ProgramSlot getProgramSlot(String name, String time)
    {
        ProgramSlot programSlot = new ProgramSlot.Builder()
                .name(name)
                .time(time)
                .build();
        return programSlot;
    }
}
