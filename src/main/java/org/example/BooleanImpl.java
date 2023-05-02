package org.example;

import java.util.Arrays;

public class BooleanImpl implements BooleanInterface{

    private boolean[] array = new boolean[size];

    @Override
    public void setTrueByIndex(int index) {
        if (index>=0 && index<(size)) {
            array[index] = true;
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public void setFalseByIndex(int index) {
        if (index>=0 && index<(size)) {
            array[index] = false;
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public void setBooleanValueByIndex(int index, boolean value) {
        if (index>=0 && index<(size)) {
            array[index] = value;
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public void reverse(int index) {
        if (index>=0 && index<(size)) {
            array[index] = !array[index];
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean checkByIndex(int index) {
        if (index>=0 && index<(size)) {
            return array[index];
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public int getNumberTrueElements() {
        int sum = 0;
        for (int i=0; i<size;i++){
            sum += (array[i] ? 1 : 0);
        }
        return sum;
    }

    @Override
    public String toString() {
        String[] str = new String[size];
        for(int i=0 ; i<size ; i++){
            str[i] = array[i] ? "1" : "0";
        }
        return Arrays.toString(str);
    }
}
