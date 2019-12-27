package com.aice.algorithmpractice.practice1;

import android.util.Log;

//数组实现循环队列
public class TestPracticeTwo {
    private int array[];
    private int start;
    private int end;
    public TestPracticeTwo(int length) {
        array=new int[length];
    }
    public void enQueue(int element){
        if ((end+1)%array.length==start){
            throw new RuntimeException("队列已经满了");
        }
        array[end]=element;
        end=(end+1)%array.length;
    }
    public int deQueue(){
        if (end==start){
            throw new RuntimeException("队列已经空了");
        }
        int element=array[start];
        start=(start+1)%array.length;
        return element;
    }
    public void output(){
        for (int i=start;i!=end;i=(i+1)%array.length){
            Log.v("xixi",array[i]+"");
        }
    }
}
