package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length <= 1) {
            return;
        }
    int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length <= 1) {
            return;
        }
        shift %= array.length;

        if(shift == 0) {
            return;
        }
        int[] temp = new int[shift];

        System.arraycopy(array, array.length - shift, temp, 0, shift);
        System.arraycopy(array, 0, array, shift, array.length - shift);
        System.arraycopy(temp,0, array, 0, shift);
    }
}
