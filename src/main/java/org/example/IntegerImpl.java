package org.example;

import java.util.Arrays;

public class IntegerImpl implements BooleanInterface {
    int[] array;

    {
        int tempsize = size % 32 == 0 ? size / 32 : (size / 32) + 1;
        array = new int[tempsize];
    }

    @Override
    public void setTrueByIndex(int index) {
        if (index>=0 && index<(size)) {
            int indexArray = index / 32;
            int bitIndex = index % 32;
            int element = array[indexArray];
            int mask = 1 << bitIndex;
            array[indexArray] = element | mask;
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public void setFalseByIndex(int index) {
        if (index>=0 && index<(size)) {
            int indexArray = index/32;
            int bitIndex = index%32;
            int element = array[indexArray];
            int mask = 1<<bitIndex;
            array[indexArray] = element&(~mask);
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public void setBooleanValueByIndex(int index, boolean value) {
        if (index>=0 && index<(size)) {
            int indexArray = index/32;
            int bitIndex = index%32;
            int element = array[indexArray];
            int mask = 1<<bitIndex;
            if(!value) array[indexArray] = element & (~mask);
            else array[indexArray] = element | mask;
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public void reverse(int index) {
        if (index>=0 && index<(size)) {
            int indexArray = index/32;
            int bitIndex = index%32;
            int element = array[indexArray];
            int mask = 1<<bitIndex;
            array[indexArray] = element^mask;
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean checkByIndex(int index) {
        if (index>=0 && index<size) {
            int indexArray = index/32;
            int bitIndex = index%32;
            int element = array[indexArray];
            int mask = 1<<bitIndex;
            return (element&mask)==mask;
        }else throw new IndexOutOfBoundsException();
    }

    @Override
    public int getNumberTrueElements() {
        int sum = 0;
        for (int i=0; i<size;i++){
            sum += (checkByIndex(i) ? 1 : 0);
        }
        return sum;
    }

    @Override
    public String toString() {
        String[] res = new String[size];
        for(int i=0 ; i<size ; i++){
            res[i] = checkByIndex(i) ? "1" : "0";
        }
        return Arrays.toString(res);
    }
}
