package com.bioknow.datatransport.runner;

import com.bioknow.datatransport.service.PeoplePmidDiseaseService;
import com.bioknow.datatransport.service.PeoplePmidDrugbankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UpdateDataRunner implements ApplicationRunner {

    @Autowired
    PeoplePmidDiseaseService peoplePmidDiseaseService;

    @Autowired
    PeoplePmidDrugbankService peoplePmidDrugbankService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        peoplePmidDiseaseService.updatePeoplePmidDisease();
        peoplePmidDrugbankService.updatePeoplePmidDrugbank();
    }
}
