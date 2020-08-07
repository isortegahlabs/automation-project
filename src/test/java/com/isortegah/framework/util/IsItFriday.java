package com.isortegah.framework.util;

import java.lang.management.ManagementFactory;

public class IsItFriday {

    public static String isIt(String today) throws InterruptedException {

        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
        Thread.sleep(3000L);
        return "Nope";
    }
}
