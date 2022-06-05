package org.goutham.client;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.goutham.annotation.WinWord;
import org.goutham.dbChecker;
import org.goutham.spellChecker;

public class TextEditor {
    private spellChecker sc;
    private dbChecker db;

    @Inject
    public TextEditor(@Named("OpenOffice") spellChecker sc, dbChecker db){
        this.sc = sc;
        this.db = db;
    }

   /* @Inject
    public TextEditor(@WinWord  spellChecker sc){
        this.sc = sc;
    }
    */
    public void makeSpellCheck(){
        sc.spellChecking();
    }
    public void makedbCall(){db.dbChecking();}
}
