package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.StudioTimes;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by thabomoopa on 2017/11/19.
 */
public class StudioTimesFactory {
    public static StudioTimes getStudioTimes(String times)
    {
        StudioTimes studioTimes = new StudioTimes.Builder()
                .times(times)
                .build();
        return studioTimes;
    }
}
