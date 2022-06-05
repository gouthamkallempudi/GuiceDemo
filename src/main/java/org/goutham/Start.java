package org.goutham;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.goutham.client.TextEditor;
import org.goutham.modules.TextEditorModule;

public class Start {

    public static void main(String... args){

        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
        textEditor.makedbCall();
    }
}
