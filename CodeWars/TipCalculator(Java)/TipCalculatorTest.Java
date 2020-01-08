import org.junit.Test;
import static org.junit.Assert.*;

public class TipCalculatorTest {
  @Test
  /* Here I attempt to use what I call the "USE" naming convention, inspired from (ARTOF) Chapter 8.3.1 and a newer version
     The USE method goes like so
     (U)nit of Work Under Test
     (S)cenario Under Test
     (E)xpected Result

     Other possible refactorings going forward are using Factories to create the TipCalculatorto reduce the setup duplication
     although I have read competing things on that. I am still working through the Art of Unit Testing and want to refactor this later
  */ 
  public void calculateTip_TeRRibleServiceRatingPassed_Returns0(){
    //arrange
    var tipCalculator = new TipCalculator();
    //act
    var tip = tipCalculator.calculateTip(1, "TeRRible");
    //assert
    assertEquals(new Integer(0), tip);
  }

  @Test
  public void calculateTip_terribleServiceRating_Returns0(){
    //arrange
    var tipCalculator = new TipCalculator();
    //act
    Integer tip = tipCalculator.calculateTip(1, "terrible");
    //assert
    assertEquals(new Integer(0), tip);
  }
  
  @Test
  public void calculateTip_PoorServiceRatingAnd100Dollars_Returns5(){
    //arrange
    var tipCalculator = new TipCalculator();
    //act
    Integer tip = tipCalculator.calculateTip(100, "poor");
    //assert
    assertEquals(new Integer(5), tip);
  }
  
  @Test
  public void calculateTip_GoodServiceRatingAnd100Dollars_Returns10(){
    //arrange
    var tipCalculator = new TipCalculator();
    //act
    Integer tip = tipCalculator.calculateTip(100, "good");
    //assert
    assertEquals(new Integer(10), tip);
  }
  
  @Test
  public void calculateTip_GreatServiceRatingAnd100Dollars_Returns15(){
    //arrange
    var tipCalculator = new TipCalculator();
    //act
    Integer tip = tipCalculator.calculateTip(100, "great");
    //assert
    assertEquals(new Integer(15), tip);
  }
  
  @Test
  public void calculateTip_ExcellentServiceRatingAnd100Dollars_Returns20(){
    //arrange
    var tipCalculator = new TipCalculator();
    //act
    Integer tip = tipCalculator.calculateTip(100, "excellent");
    //assert
    assertEquals(new Integer(20), tip);
  }

}