package com.aice.algorithmpractice;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.aice.algorithmpractice.practice1.TestPraceFive;
import com.aice.algorithmpractice.practice1.TestPracticeOne;
import com.aice.algorithmpractice.practice1.TestPracticeSeven;
import com.aice.algorithmpractice.practice1.TestPracticeThree;
import com.aice.algorithmpractice.practice1.TestPracticeTwo;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_one)
    Button btnOne;
    @BindView(R.id.btn_two)
    Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.v("xixi=",new TestPracticeSeven().getNum(12354)+"");
    }

    @OnClick({R.id.btn_one, R.id.btn_two, R.id.btn_three,R.id.btn_four,R.id.btn_five})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                new TestPracticeOne();
                break;
            case R.id.btn_two:
                TestPracticeTwo testPracticeTwo=new TestPracticeTwo(10);
                testPracticeTwo.enQueue(1);
                testPracticeTwo.enQueue(2);
                testPracticeTwo.enQueue(3);
                testPracticeTwo.enQueue(4);
                testPracticeTwo.enQueue(5);
                testPracticeTwo.deQueue();
                testPracticeTwo.deQueue();
                testPracticeTwo.deQueue();
                testPracticeTwo.deQueue();
                testPracticeTwo.output();
                break;
            case R.id.btn_three:
                TestPracticeThree.TreeNode treeNode1=new TestPracticeThree.TreeNode(1);
                TestPracticeThree.TreeNode treeNode2=new TestPracticeThree.TreeNode(2);
                TestPracticeThree.TreeNode treeNode3=new TestPracticeThree.TreeNode(3);
                TestPracticeThree.TreeNode treeNode4=new TestPracticeThree.TreeNode(4);
                TestPracticeThree.TreeNode treeNode5=new TestPracticeThree.TreeNode(5);
                TestPracticeThree.TreeNode treeNode6=new TestPracticeThree.TreeNode(6);
                treeNode1.setLeft(treeNode2);
                treeNode1.setRight(treeNode3);
                treeNode2.setLeft(treeNode4);
                treeNode2.setRight(treeNode5);
                treeNode3.setRight(treeNode6);
                TestPracticeThree testPracticeThree=new TestPracticeThree();
                testPracticeThree.widthOrderTraveral(treeNode1);
                testPracticeThree.leftRightOrderTraveral(treeNode1);
                testPracticeThree.widthOrderTraveral(treeNode1);
                break;
            case R.id.btn_four:
                Log.v("xixi=",TestPraceFive.getNum(1212112,1122)+"");
                break;
            case R.id.btn_five:
                Log.v("xixi=",TestPraceFive.isPowerOf2(8)+"");
                break;
        }
    }
}
