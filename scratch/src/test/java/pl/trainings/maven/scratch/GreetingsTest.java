package pl.trainings.maven.scratch;
import static org.junit.Assert.*;
import org.junit.Test;
public class GreetingsTest {
	private static final String DEFAULT_NAME = "Jedrzej";
	private static final String GREETINGS_MESSAGE = "Hello ";
	
	@Test
	public void testNullNameShouldPrintDefaultName(){
		Greetings objectTested = new Greetings();
		String expectedString = GREETINGS_MESSAGE+DEFAULT_NAME;
		assertEquals(expectedString, objectTested.sayHello(null));
	}
	
	@Test
	public void testShouldPrintCorrectGreeting(){
		Greetings objectUnderTest = new Greetings();
		String expectedString = GREETINGS_MESSAGE+"Andrew";
		assertEquals(expectedString, objectUnderTest.sayHello("Andrew"));
	}
}
