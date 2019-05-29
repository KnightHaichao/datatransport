package com.bioknow.datatransport.service.impl;

import com.bioknow.datatransport.dao.PeoplePmidDrugbankMapper;
import com.bioknow.datatransport.service.PeoplePmidDrugbankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeoplePmidDrugbankServiceImpl implements PeoplePmidDrugbankService {

    Logger log = LoggerFactory.getLogger(PeoplePmidDrugbankServiceImpl.class);

    @Autowired
    PeoplePmidDrugbankMapper peoplePmidDrugbankMapper;

    @Override
    @Transactional
    public int updatePeoplePmidDrugbank() {
        long start = System.currentTimeMillis();
        int count = peoplePmidDrugbankMapper.updatePeoplePmidDrugbank();
        long end = System.currentTimeMillis();
        log.info("PeoplePmidDrugbank 同步更新 " + count + "条");
        log.info("耗时 " + (end - start));
        return count;
    }
}
