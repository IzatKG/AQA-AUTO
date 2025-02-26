import jdk.jfr.Description;
import org.testng.annotations.*;

public class TestNgTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BEfore SUITE");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("BERFORE class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BEfore method");
    }

    @Test(description = "check validation of fields")
    @Description(" Check 1 Test ")
    public void myTest1() {
        System.out.println("1 Test");
    }

    @Test(dependsOnMethods = "myTest1")
    @Description("Check 2 Test")
    @Ignore
    public void myTest2() {
        System.out.println("2 Test");
    }

    @Test(dataProvider = "userData")
    @Description("Check 3 Test")
    public void myTest3(String name, int age) {

        System.out.println("3Test : " + name + age);
    }

    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        return new Object[][]{
                {"izat", 35},
                {"ermek", 30},
                {"bekzhan", 25},
                {"leonid", 30}
        };
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AFTER class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AFTER SUITE");
    }


}
