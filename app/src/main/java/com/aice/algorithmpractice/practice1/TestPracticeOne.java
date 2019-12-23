package com.aice.algorithmpractice.practice1;

import android.os.Build;
import android.util.Log;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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
    @RequiresApi(api = Build.VERSION_CODES.N)
    public  void quickSortTask(int[] a, int low, int high) {
        if (low >= high)return;
        LinkedHashMap<Integer,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(low,high);
        while (!linkedHashMap.isEmpty()){
            Iterator<Map.Entry<Integer,Integer>> it=linkedHashMap.entrySet().iterator();
            low=it.next().getKey();
            high=linkedHashMap.get(low);
            Log.v("heihei=",low+"="+high);
            linkedHashMap.remove(low,high);
            if (low>=high)continue;
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
        linkedHashMap.put(low,i-1);
        linkedHashMap.put(i+1,high);
        }
    }
}
