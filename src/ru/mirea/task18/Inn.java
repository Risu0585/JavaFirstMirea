package ru.mirea.task18;

import java.math.BigInteger;

public class Inn extends Exception {

    private BigInteger innNum;

    public Inn(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
