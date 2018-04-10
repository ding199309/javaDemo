package com.demo.arithmetic.tree;

import sun.reflect.generics.tree.Tree;

/**
 * 树
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2018-04-03 11:43
 * @since 1.0
 */
public class TreeNode {


    public TreeNode(int value){
        this.value=value;
    }

    //当前值
    private  int  value;
    //左节点
    private TreeNode   leftTreeNode;
    //右节点
    private TreeNode   rightTreeNode;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }
}
