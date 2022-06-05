package org.goutham.service;

import org.goutham.dbChecker;

public class dbCheckerImpl implements dbChecker {

    private String dbUrl;
    private String user;
    private int timeout;

    public dbCheckerImpl(String dbUrl, String user, int timeout) {
        this.dbUrl = dbUrl;
        this.user = user;
        this.timeout = timeout;
    }

    @Override
    public void dbChecking() {
        System.out.println("This is the db checking");
        System.out.println(dbUrl);
        System.out.println(user);
        System.out.println(timeout);
    }
}
