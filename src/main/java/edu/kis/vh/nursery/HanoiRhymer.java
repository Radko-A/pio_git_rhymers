package edu.kis.vh.nursery;

/**
 * Class is used in RhymersFactory
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

	/**
	 * field for amount of rejected
	 */
	int totalRejected = 0;

	/**
	 *
	 * @return number of rejected
	 */

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
