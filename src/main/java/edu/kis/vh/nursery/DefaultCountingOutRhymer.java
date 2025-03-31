package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private final int[] numbers = new int[STACK_CAPACITY];
    private static final int RETURN_VAL = -1;
    private static final int FULL = 11;
    private static final int CHECK = -1;

    public int getTotal() {
        return total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == CHECK;
    }

    protected boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VAL;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return RETURN_VAL;
        return numbers[total--];
    }

}
