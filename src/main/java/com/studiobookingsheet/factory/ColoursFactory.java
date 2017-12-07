package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.Colours;

/**
 * Created by thabomoopa on 26/11/2017.
 */
public class ColoursFactory {
        public static Colours getColours(String name)
        {
            Colours colours = new Colours.Builder()
                    .colorName(name)
                    .build();
            return colours;
        }
    }

