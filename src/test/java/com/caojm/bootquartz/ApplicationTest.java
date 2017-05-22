package com.caojm.bootquartz;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.testng.annotations.Test;

@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTest {
    @Autowired
    private Scheduler scheduler;

    @Test
    public void test() throws Exception {
        Thread.sleep(5000);
    }
}