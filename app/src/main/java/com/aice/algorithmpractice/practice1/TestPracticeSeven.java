package com.aice.algorithmpractice.practice1;

import android.util.Log;

public class TestPracticeSeven {
    public TestPracticeSeven() {
    }
    public Integer getNum(int num){
        char c[]=(num+"").toCharArray();
        int numArray[]=new int[c.length];
        for (int i=0;i<c.length;i++){
            numArray[i]=Integer.parseInt(c[i]+"");
        }
        int a=0;
        for (int i=numArray.length-1;i>0;i--){
            if (numArray[i]>numArray[i-1]){
                a=i;
            }
        }
        if (a==0){
            return null;
        }
        int head=numArray[a-1];
        for (int i=numArray.length-1;a>0;i--){
            if (head<numArray[i]){
                numArray[a-1]=numArray[i];
                numArray[i]=head;
                break;
            }
        }
        for (int i=a,j=numArray.length-1;i<j ;i++,j--){
              int temp=numArray[i];
            numArray[i]=numArray[j];
            numArray[j]=temp;
        }
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=0;i<numArray.length;i++){
            stringBuffer.append(numArray[i]);
        }
        return Integer.valueOf(stringBuffer.toString());
    }
}
