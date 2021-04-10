import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestsWithDataProvider {
    @DataProvider(name = "ingredients")
    public static Object[][] smoothiesObject() {
        return new Object[][]{{"mango", "yogurt"}, {"apples", "honey"}, {"strawberry", "yogurt"}};
    }

    @Test(dataProvider = "ingredients")
    public void makeSmoothies(String fruit, String sauce) {
        System.out.println("Cocktail with " + fruit + " and " + sauce);
    }

}
