package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAY_SIZE = 12;
	private static final int LAST_ELEMENT = 11;
	private static final int ARRAY_EMPTY = -1;

	private final int[] NUMBERS = new int[ARRAY_SIZE];
	private final int INITIAL = -1;

	public int getTotal() {
		return total;
	}

	private int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[LAST_ELEMENT] = in;
	}

	public boolean callCheck() {
			return total == INITIAL;
		}

	public boolean isFull() {
				return total == LAST_ELEMENT;
			}
		
	protected int peekaboo() {
		if (callCheck())
			return ARRAY_EMPTY;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return ARRAY_EMPTY;
		return NUMBERS[total--];
	}

}
