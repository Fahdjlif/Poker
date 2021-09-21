
package tn.ittun.cards;

public class Trace
{
	private long time = System.currentTimeMillis();

	/**
	 * default constructor
	 */
	public Trace()
	{
	}

	/**
	 * print out a duration measure in ms
	 * 
	 * @param message
	 */
	public void measure(String message)
	{
		long now = System.currentTimeMillis();
		message += " duration: " + (now - time) + " ms";

		System.out.println( message);

		time = now;
	}
}
