import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestsWithParameters {

    @Test
    @Parameters({"fruit", "sauce"})
    public void parameterTest(String fruit, String sauce) {
        System.out.println("Cocktail with " + fruit + " and " + sauce);
    }
}