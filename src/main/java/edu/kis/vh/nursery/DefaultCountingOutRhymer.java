package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private final int[] numbers = new int[STACK_CAPACITY];
    private static final int RETURN_VAL = -1;
    private static final int FULL = 1;
    private static final int CHECK = -1;

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VAL;
        return numbers[total--];
    }

}
