package com.studiobookingsheet.DataLoading;

import com.studiobookingsheet.domain.Technical;
import com.studiobookingsheet.factory.TechnicalFactory;
import com.studiobookingsheet.services.Impl.TechnicalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Component
public class LoadTechnical {

    private Technical technical;

    private TechnicalServiceImpl technicalService;

    @Autowired
    public void loadTechnical(TechnicalServiceImpl technicalService)
    {
        this.technicalService = technicalService;
        load();
    }

    public void load()
    {
        technical = TechnicalFactory.getTechnical("Thabo");
        technicalService.create(technical);
        technical = TechnicalFactory.getTechnical("Gavin");
        technicalService.create(technical);
    }
}
