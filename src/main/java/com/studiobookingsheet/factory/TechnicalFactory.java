package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.Technical;

/**
 * Created by thabomoopa on 2017/11/20.
 */
public class TechnicalFactory {
    public static Technical getTechnical(String name)
    {
        Technical technical = new Technical.Builder()
                .name(name)
                .build();
        return technical;
    }
}
