package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.Optional;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
         int a = arrayList.stream().reduce((sum, current)->{
            sum += current;
            return sum;
        }).get();
         int size = arrayList.size();
         double dSize = size;
         double da = a;
         return da/dSize;
    }

    public Integer getMaxValue() {
        return arrayList.stream().reduce((max, current)->{
            if(current > max){
                return current;
            }
            return max;
        }).get();
    }

    public int getLastOdd() {
        return arrayList.stream().reduce((lastOdd, current)->{
            if(current%2 != 0){
                return current;
            }
            return lastOdd;
        }).get();
    }
}
