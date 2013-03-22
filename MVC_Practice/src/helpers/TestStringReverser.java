package helpers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringReverser {

	@Test
	public void testReverseIt() {
		assertEquals("Reverse of Octopus", "supotcO", StringReverser.reverseIt("Octopus") );
		assertEquals("Reverse of Hello", "olleH", StringReverser.reverseIt("Hello") );
	}

}
