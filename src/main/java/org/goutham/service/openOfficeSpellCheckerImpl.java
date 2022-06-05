package org.goutham.service;

import com.google.inject.name.Named;

public class openOfficeSpellCheckerImpl extends spellCheckerImpl {
    @Override
    public void spellChecking() {
        System.out.println("This is a open office spell checker impl ");
    }
}
