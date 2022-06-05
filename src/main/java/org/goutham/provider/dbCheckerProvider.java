package org.goutham.provider;

import com.google.inject.Provider;
import org.goutham.dbChecker;
import org.goutham.service.dbCheckerImpl;

public class dbCheckerProvider implements Provider<dbChecker> {
    @Override
    public dbChecker get() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        dbChecker db = new dbCheckerImpl(dbUrl, user, timeout);
        return db;
    }
}
