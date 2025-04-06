package edu.kis.vh.nursery;

/**
 * Klasa {@code DefaultCountingOutRhymer} implementuje podstawową strukturę stosu
 * o stałej pojemności. Umożliwia dodawanie, usuwanie i podglądanie elementów,
 * a także sprawdzanie, czy struktura jest pusta lub pełna.
 */
public class DefaultCountingOutRhymer {

    /**
     * Maksymalna liczba elementów, które można przechować.
     */
    private static final int STACK_CAPACITY = 12;

    /**
     * Tablica przechowująca elementy stosu.
     */
    private final int[] numbers = new int[STACK_CAPACITY];

    /**
     * Wartość zwracana przy niepoprawnych operacjach.
     */
    private static final int RETURN_VAL = -1;

    /**
     * Indeks oznaczający pełny stos.
     */
    private static final int FULL = 11;

    /**
     * Indeks oznaczający pusty stos.
     */
    private static final int CHECK = -1;

    /**
     * Indeks ostatniego dodanego elementu.
     */
    private int total = -1;

    /**
     * Zwraca indeks ostatniego dodanego elementu.
     *
     * @return aktualna liczba elementów.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje element na stos, jeśli nie jest pełny.
     *
     * @param in liczba do dodania.
     */
    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return {@code true}, jeśli stos jest pusty, w przeciwnym razie {@code false}.
     */
    protected boolean callCheck() {
        return total == CHECK;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return {@code true}, jeśli stos jest pełny, w przeciwnym razie {@code false}.
     */
    protected boolean isFull() {
        return total == FULL;
    }

    /**
     * Zwraca ostatnio dodany element bez usuwania go ze stosu.
     *
     * @return ostatnio dodany element lub {@code RETURN_VAL}, jeśli stos jest pusty.
     */
    protected int peekaboo() {
        if (callCheck())
            return RETURN_VAL;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca ostatnio dodany element.
     *
     * @return usunięty element lub {@code RETURN_VAL}, jeśli stos jest pusty.
     */
    protected int countOut() {
        if (callCheck())
            return RETURN_VAL;
        return numbers[total--];
    }

}
