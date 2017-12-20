package com.studiobookingsheet.DataLoading;

import com.studiobookingsheet.domain.Contributor;
import com.studiobookingsheet.domain.Organisation;
import com.studiobookingsheet.domain.StudioTimes;
import com.studiobookingsheet.domain.User;
import com.studiobookingsheet.factory.ContributorFactory;
import com.studiobookingsheet.factory.StudioTimesFactory;
import com.studiobookingsheet.factory.UserFactory;
import com.studiobookingsheet.services.Impl.ContributorServiceImpl;
import com.studiobookingsheet.services.Impl.OrganisationServiceImpl;
import com.studiobookingsheet.services.Impl.StudioTimesServiceImpl;
import com.studiobookingsheet.services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/11/16.
 */
@Component
public class DefaultData {

    private User user;
    private UserServiceImpl userService;

    private Contributor contributor;
    private ContributorServiceImpl contributorService;

    private StudioTimes studioTimes;
    private StudioTimesServiceImpl studioTimesService;

    private Organisation organisation;

    @Autowired
    private OrganisationServiceImpl organisationService;

    @Autowired
    public void loadStudioTimes(StudioTimesServiceImpl studioTimesService)
    {
        this.studioTimesService = studioTimesService;
        loadTimes();
    }

    @Autowired
    public void DataLoader(UserServiceImpl userService) {
        this.userService = userService;
        LoadUsers();
    }

    @Autowired
    public void loadContributor(ContributorServiceImpl contributorService){
        this.contributorService = contributorService;
        loadContributors();
    }

    private void LoadUsers() {
        user = UserFactory.getUser("thabo@capepulpit.co.za", "Moopa!@3", "Thabo");
        userService.create(user);
        user = UserFactory.getUser("admin@capepulpit.co.za", "admin2424", "admin");
        userService.create(user);

    }

    private void loadContributors(){
        Map<String, String> stringValues = new HashMap<String, String>();
        stringValues.put("name", "Thabo");
        stringValues.put("surname", "Moopa");
        stringValues.put("email", "thabo.moopa@gmail.com");
        stringValues.put("position", "CEO");
        stringValues.put("contact", "0849262255");
        stringValues.put("additionalContact", "0849262255");



        contributor = ContributorFactory.getContributor(stringValues, organisation);
        organisation = organisationService.read(1);
        contributorService.create(contributor);
    }

    private void loadTimes()
    {
        String[] studioTimesString = {"08h00", "08h30","09h00", "09h30", "10h00", "10h30","11h00", "11h30", "12h00", "12h30","13h00", "13h30", "14h00", "14h30","15h00", "15h30", "16h00","16h30"};


        for (int i=0; i < studioTimesString.length; i++)
        {
            studioTimes = StudioTimesFactory.getStudioTimes(studioTimesString[i]);
            studioTimesService.create(studioTimes);
        }

    }
}