package creationalPatterns.factory;

import org.w3c.dom.Document;

import java.io.File;

public class FactoryMethod {
    public AbstractWriter getWriter(Object object){
        if (object instanceof File){
            return new ConcreteFileWriter();
        }else if(object instanceof Document){
            return new ConcreteXmlWriter();
        }
        return null;
    }
}
