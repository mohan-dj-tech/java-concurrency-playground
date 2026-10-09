package com.playbook.java.concurrency.deadlock.detection;

public class ThreadNode {

    public LockNode waitingFor = null;
    public Thread   thread     = null;

}
