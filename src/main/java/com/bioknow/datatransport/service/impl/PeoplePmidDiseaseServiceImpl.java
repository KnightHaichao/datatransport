package com.bioknow.datatransport.service.impl;

import com.bioknow.datatransport.dao.PeoplePmidDiseaseMapper;
import com.bioknow.datatransport.service.PeoplePmidDiseaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeoplePmidDiseaseServiceImpl implements PeoplePmidDiseaseService {

    Logger log = LoggerFactory.getLogger(PeoplePmidDiseaseServiceImpl.class);

    @Autowired
    PeoplePmidDiseaseMapper peoplePmidDiseaseMapper;

    @Transactional
    public int updatePeoplePmidDisease() {
        long start = System.currentTimeMillis();
        int count = peoplePmidDiseaseMapper.updatePeoplePmidDisease();
        long end = System.currentTimeMillis();
        log.info("PeoplePmidDisease 同步更新 " + count + "条");
        log.info("耗时 " + (end - start));
        return count;
    }

}
