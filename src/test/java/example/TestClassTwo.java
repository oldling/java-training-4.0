package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Test(dataProvider = "dataProviderMethod")
    public void parametersDataProvider(String parameter1, String parameter2) {
        System.out.println("DataProvider parameters: " + parameter1 + " and " + parameter2);
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[] dataProviderMethod() {
        return new Object[][]{
                {"One", "Two"},
                {"1", "2"},
        };
    }

    @Test
    @Parameters({"parameter1", "parameter2"})
    public void parametersXML(String parameter1, String parameter2) {
        System.out.println("XML parameters: " + parameter1 + " and " + parameter2);
    }
}

