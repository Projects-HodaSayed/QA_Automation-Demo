package io.testing.qa;


import org.testng.Assert;
import org.testng.TestException;
import org.testng.annotations.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public abstract class
QAForgeCore {

   // protected TestData testData;
    protected String propertiesFilePath = "config-android.properties";
    
    public Properties getGlobalsValue() throws Exception {
        Properties prop = new Properties();
        final ClassLoader cl = Thread.currentThread().getContextClassLoader();
        final InputStream stream = cl.getResourceAsStream(propertiesFilePath);
        prop.load(stream);
        return prop;
    }
}
