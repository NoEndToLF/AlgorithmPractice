package com.aice.algorithmpractice.practice1;

import android.util.Log;

import java.util.LinkedList;
import java.util.Queue;

//二叉树的遍历  //深度优先的遍历
//前序遍历：根左右
//中序遍历：左根右
//后序遍历：左右根
public class TestPracticeThree {
    public static class TreeNode{
        private int data;
        private TreeNode left;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    public void preOrderTraveral(TreeNode treeNode){
        if (treeNode==null)return;
        Log.v("tree: ",treeNode.getData()+"");
        preOrderTraveral(treeNode.getLeft());
        preOrderTraveral(treeNode.getRight());
    }
    public void inOrderTraveral(TreeNode treeNode){
        if (treeNode==null)return;
        preOrderTraveral(treeNode.getLeft());
        Log.v("tree: ",treeNode.getData()+"");
        preOrderTraveral(treeNode.getRight());
    }
    public void postOrderTraveral(TreeNode treeNode){
        if (treeNode==null)return;
        preOrderTraveral(treeNode.getLeft());
        preOrderTraveral(treeNode.getRight());
        Log.v("tree: ",treeNode.getData()+"");
    }
    //广度优先的遍历
    public void widthOrderTraveral(TreeNode treeNode){
        if (treeNode==null)return;
        LinkedList<TreeNode> treeNodeLinkedList=new LinkedList<>();
        treeNodeLinkedList.offer(treeNode);
        while (!treeNodeLinkedList.isEmpty()){
            TreeNode node= treeNodeLinkedList.poll();
            Log.v("tree：",node.getData()+"");
            if (node.getLeft()!=null){
                treeNodeLinkedList.offer(node.getLeft());
            }
            if (node.getRight()!=null){
                treeNodeLinkedList.offer(node.getRight());
            }
        }
    }
    //二叉树的左右翻转
    public void leftRightOrderTraveral(TreeNode treeNode){
        if (treeNode==null)return;
        if (treeNode.getLeft()!=null){
            leftRightOrderTraveral(treeNode.getLeft());
        }
        if (treeNode.getRight()!=null){
            leftRightOrderTraveral(treeNode.getRight());
        }
        Log.v("xixi=",treeNode.getData()+"");
        TreeNode node=treeNode.getLeft();
        treeNode.setLeft(treeNode.getRight());
        treeNode.setRight(node);
    }
}
