package com.studiobookingsheet.DataLoading;

import com.studiobookingsheet.domain.Colours;
import com.studiobookingsheet.factory.ColoursFactory;
import com.studiobookingsheet.services.ColoursService;
import com.studiobookingsheet.services.Impl.ColoursServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 26/11/2017.
 */
@Component
public class LoadColours {
    
    private Colours colours;

    private ColoursService coloursService;

    @Autowired
    public void loadColours(ColoursServiceImpl coloursService)
    {
        this.coloursService = coloursService;
        load();
    }

    public void load()
    {
        colours = ColoursFactory.getColours("Bisque"); //ffe4c4
        coloursService.create(colours);
        colours = ColoursFactory.getColours("linen"); //fafOe6
        coloursService.create(colours);
        colours = ColoursFactory.getColours("#FFA8A8"); //fafOe6
        coloursService.create(colours);
        colours = ColoursFactory.getColours("#CEA8F4"); //fafOe6
        coloursService.create(colours);
        colours = ColoursFactory.getColours("#FF79E1"); //fafOe6
        coloursService.create(colours);
        colours = ColoursFactory.getColours("#FFFFAA"); //fafOe6
        coloursService.create(colours);
        colours = ColoursFactory.getColours("#AAFD8E"); //fafOe6
        coloursService.create(colours);
    }
}
