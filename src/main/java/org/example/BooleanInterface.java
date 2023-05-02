package org.example;

public interface BooleanInterface {
    int size = 32;

    void setTrueByIndex(int index);
    void setFalseByIndex(int index);
    void setBooleanValueByIndex(int index, boolean value);
    void reverse(int index);
    boolean checkByIndex(int index);
    int getNumberTrueElements();

}
