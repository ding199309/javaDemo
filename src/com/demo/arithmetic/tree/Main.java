package com.demo.arithmetic.tree;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2018-04-03 11:46
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(10);
        TreeNode treeNode1=new TreeNode(9);
        TreeNode treeNode2=new TreeNode(20);
        TreeNode treeNode3=new TreeNode(15);
        TreeNode treeNode4=new TreeNode(35);

        treeNode.setLeftTreeNode(treeNode1);
        treeNode.setRightTreeNode(treeNode2);

        treeNode2.setLeftTreeNode(treeNode3);
        treeNode2.setRightTreeNode(treeNode4);

        test(treeNode);
        System.out.println();
        test2(treeNode);
        System.out.println();
        test3(treeNode);

        System.out.println("========");
        System.out.println(getHeight(treeNode));
        System.out.println(getMax(treeNode));

    }
    /**
     * 先序遍历
     * @param treeNode
     */
    public static void  test(TreeNode treeNode){
        if(treeNode!=null){
            System.out.print(treeNode.getValue()+" ");
            test(treeNode.getLeftTreeNode());
            test(treeNode.getRightTreeNode());
        }
    }
    /**
     * 中序遍历
     * @param treeNode
     */
    public static void test2(TreeNode treeNode){
        if(treeNode!=null){
            test2(treeNode.getLeftTreeNode());
            System.out.print(treeNode.getValue()+" ");
            test2(treeNode.getRightTreeNode());
        }
    }

    /**
     * 后序遍历
     * @param treeNode
     */
    public static void test3(TreeNode treeNode){
        if(treeNode!=null){
            test3(treeNode.getLeftTreeNode());
            test3(treeNode.getRightTreeNode());
            System.out.print(treeNode.getValue()+" ");
        }
    }

    /**
     * 查询树的深度
     * @param treeNode
     * @return
     */
    public static int getHeight(TreeNode treeNode){
        if(treeNode==null){
            return 0;
        }else{
            int left=getHeight(treeNode.getLeftTreeNode());
            int right=getHeight(treeNode.getRightTreeNode());
            int max=left;
            if(right>max){
                max=right;
            }
            return max+1;
        }
    }

    /**
     * 查询树的最大值
     * @param treeNode
     * @return
     */
    public static int getMax(TreeNode treeNode){
        if(treeNode==null){
            return -1;
        }else{
            int left=getMax(treeNode.getLeftTreeNode());
            int right=getMax(treeNode.getRightTreeNode());
            int curr=treeNode.getValue();
            int max=left;
            if(right>max){
                max=right;
            }
            if(curr>max){
                max=curr;
            }
            return max;
        }
    }

}
