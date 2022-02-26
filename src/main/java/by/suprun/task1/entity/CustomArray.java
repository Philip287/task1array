package by.suprun.task1.entity;

import by.suprun.task1.exception.CustomArrayException;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int... array) throws CustomArrayException {
        if (array.length < 1) throw new CustomArrayException("Array must have 1 or mo elements.") ;
        this.array = array.clone();
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        if (array == null) {
            return "CustomArray is null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int a : array) {
            stringBuilder.append(a).append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CustomArray customArray = (CustomArray) obj;
        if (array.length != customArray.array.length) {
            return false;
        }
        return this.hashCode() == customArray.hashCode();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for (int i = 0; i < array.length; i++) {
            hashCode = 31 * hashCode + array[i] * 2 + i;
        }
        return hashCode;
    }
}
