package com.rich.rest_service.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import jakarta.annotation.PreDestroy;

public class TerminateBean {
    
    Logger logger = LoggerFactory.getLogger(TerminateBean.class);

    @PreDestroy
    public void onDestroy() throws Exception {
        logger.info("SHUTDOWN");
    }

}
