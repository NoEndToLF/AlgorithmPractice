package com.aice.algorithmpractice.practice1;

import java.util.Stack;

//两个栈实现链表
public class TestPraceSix {
    private Stack<Integer> stackA;
    private Stack<Integer> stackB;

    public TestPraceSix() {
        stackA=new Stack<>();
        stackB=new Stack<>();
    }
    public void push(int num){
        stackA.push(num);
    }
    public Integer pop(){
        if (stackA.isEmpty()){
            if (stackB.isEmpty()){
                return null;
            }
        }
        while (!stackA.isEmpty()){
            stackB.push(stackA.pop());
        }
        return stackB.pop();
    }
}
