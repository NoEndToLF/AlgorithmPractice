package com.aice.algorithmpractice.practice1;

import android.os.Build;
import android.util.Log;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;

import androidx.annotation.RequiresApi;

//快速排序
public class TestPracticeOne {
    private int a[];

    public TestPracticeOne() {
       a=new int[]{ 5 ,2 ,8, 9, 2, 3, 4, 9 };
        quickSort(a,0,a.length-1);
        quickSortTask(a,0,a.length-1);
        for (int aa:a){
            Log.v("xixi=",aa+"");
        }
    }

    public  void quickSort(int[] a, int low, int high) {
        if (low>high){return;
        }
        int i=low;
        int j=high;
        int key=a[low];
        while (i<j){
            while (i<j&&a[j]>key){
                j--;
            }
            while (i<j&&a[i]<=key){
                i++;
            }
            if (i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i];
        a[i]=a[low];
        a[low]=temp;
        quickSort(a,low,i-1);
        quickSort(a,i+1,high);
    }
    public  void quickSortTask(int[] a, int low, int high) {
        if (low >= high)return;
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(low);
        integerStack.push(high);
        while (!integerStack.isEmpty()){
            high=integerStack.pop();
            low=integerStack.pop();
            int i=low;
            int j=high;
            int key=a[low];
        while (i<j){
            while (i<j&&a[j]>key){
                j--;
            }
            while (i<j&&a[i]<=key){
                i++;
            }
            if (i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i];
        a[i]=a[low];
        a[low]=temp;
        if (low<i-1){
            integerStack.push(low);
            integerStack.push(i-1);
        }
        if (i+1<high){
            integerStack.push(i+1);
            integerStack.push(high);
        }
        }
    }
}
