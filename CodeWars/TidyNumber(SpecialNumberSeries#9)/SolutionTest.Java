import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Tidy_Number_Tests
{
      @Test
      public void tidyNumber_TwoDigitNumberWhereSecondDigitIncreases_ReturnsTrue(){
        //arrange
        //act
        var result = Solution.tidyNumber(12);
        
        //assert
        assertEquals(true, result);
      }
      
      @Test
      public void tidyNumber_TwoDigitNumberWhereSecondDigitDecreases_ReturnsFalse(){
        //arrange
        //act
        var result = Solution.tidyNumber(21);
        
        //assert
        assertEquals(false, result);
      }
      
      @Test
      public void tidyNumber_NineDigitNumberWhereAllIncrease_ReturnsTrue(){
        //arrange
        //act
        var result = Solution.tidyNumber(123456789);
        
        //assert
        assertEquals(true, result);
      }
      
      @Test
      public void tidyNumber_NineDigitNumberWithMixedIncreasingAndDecreasingDigits_ReturnsFalse(){
        //arrange
        //act
        var result = Solution.tidyNumber(123123456);
        
        assertEquals(false, result);
      }
      
      @Test
      public void tidyNumber_SingleDigitNumber_ReturnsTrue(){
        //arrange
        //act
        var result = Solution.tidyNumber(1);
        
        assertEquals(true, result);
      }
}