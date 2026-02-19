package com.edwaldoalmeida.javalivesummary.interfaces.basic;

public class ItalianTraveller implements ILanguage, Cloneable {
    
    // from ILanguage interface
    public String getLanguageName() {
        return "Italiano";
    }

    // from ILanguage interface
    public String speak() {
        return "Ciao mondo";
    }
    
    // from Cloneable
    public Object clone() {
        ItalianTraveller it = new ItalianTraveller();
        return it;
    }
    
}
