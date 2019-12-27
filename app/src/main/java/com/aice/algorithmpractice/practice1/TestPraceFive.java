package com.aice.algorithmpractice.practice1;
//求最大公约数
public class TestPraceFive {
    public static int getNum(int big,int small){
        if (big==small){
            return small;
        }
        if ((big&1)==0&&(small&1)==0){
            return getNum(big>>1,small>>1)<<1;
        }else if ((big&1)==0&&(small&1)!=0){
            return getNum(big>>1,small);
        }else if ((big&1)!=0&&(small&1)==0){
            return getNum(big,small>>1);
        }else {
            int a=big;
            int b=small;
            big=a>b?a:b;
            small=a<b?a:b;
            return getNum(big-small,small);
        }
    }
    public static boolean isPowerOf2(int num){
        return (num&(num-1))==0;
    }
}
