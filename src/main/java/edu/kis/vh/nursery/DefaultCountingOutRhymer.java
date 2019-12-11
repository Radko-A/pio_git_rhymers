package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARRAY_SIZE = 12;
	public static final int LAST_ELEMENT = 11;
	private final int[] NUMBERS = new int[ARRAY_SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[LAST_ELEMENT] = in;
	}

	public boolean callCheck() {
			return total == -1;
		}

	public boolean isFull() {
				return total == LAST_ELEMENT;
			}
		
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return -1;
		return NUMBERS[total--];
	}

}
