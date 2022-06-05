package org.goutham.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import org.goutham.annotation.WinWord;
import org.goutham.dbChecker;
import org.goutham.provider.dbCheckerProvider;
import org.goutham.service.dbCheckerImpl;
import org.goutham.service.openOfficeSpellCheckerImpl;
import org.goutham.service.spellCheckerImpl;
import org.goutham.service.winWordSpellCheckerImpl;
import org.goutham.spellChecker;

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {

        // we can bind an object with multiple implementations using annotations
        // Another way to bind annotation using Guice is to use @Named

        //bind(spellChecker.class).to(spellCheckerImpl.class);
        //bind(spellChecker.class).annotatedWith(WinWord.class).to(winWordSpellCheckerImpl.class);
        bind(spellChecker.class).annotatedWith(Names.named("OpenOffice")).to(openOfficeSpellCheckerImpl.class);
        bind(dbChecker.class).toProvider(dbCheckerProvider.class);

    }


        // Guice also provides a better way to generate complex objects using @Provides annotation

        // If the @provides method become more complex, these methods can be moved to special class implementing provider
        // and then adding this to the bind
       /* @Provides @Singleton
        public dbChecker provideDatabaseData(){
            String dbUrl = "jdbc:mysql://localhost:5326/emp";
            String user = "user";
            int timeout = 100;

            dbChecker db = new dbCheckerImpl(dbUrl, user, timeout);
            return db;
    }*/
}
