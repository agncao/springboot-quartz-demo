package com.caojm.bootquartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定时任务具体调度的业务类
 */
public class SampleService {

    private static final Logger LOG = LoggerFactory.getLogger(SampleService.class);

    public void run() {
        LOG.info("Hello World!");
    }
}
