package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int SIZE = 12;

    private int[] NUMBERS = new int[SIZE];

    public int total = -1;

    private final int ERR = -1;

    private final int CHECK = -1;

    private final int FULL_TOTAL = 11;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR;
        return NUMBERS[total--];
    }

}
