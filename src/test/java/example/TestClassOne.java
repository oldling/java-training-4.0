package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClassOne {

    @BeforeGroups(groups = {"group1","group2", "group3"})
    public void setup(){
        System.out.println("setup");
    }

    @AfterMethod(groups = {"group1","group2", "group3"})
    public void teardown(){
        System.out.println("teardown");
    }

    @Test(groups = "group1")
    public void testSomethingGroup1() {
        System.out.println("Test group 1");
    }

    @Test(groups = "group2")
    public void testSomethingGroup2() {
        System.out.println("Test group 2");
    }

    @Test(groups = "group3", enabled = false)
    public void testSomethingGroup3Excluded() {
        System.out.println("Test group 3 Excluded");
    }
}

