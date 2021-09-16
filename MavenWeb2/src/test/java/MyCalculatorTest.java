import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.jenk.MyCalculator;
class MyCalculatorTest {
	@Test
	public void test1() {
		assertEquals(10,new MyCalculator().getSum(5,5));
	}
	
	@Test
	public void test2() {
		assertEquals(5,new MyCalculator().getSum(2,3));
	}
	
	@Test
	public void test3() {
		assertEquals(5,new MyCalculator().getDiff(10,5));
	}
	

}
