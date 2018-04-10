package com.demo.arithmetic.tree;

/**
 * 根节点
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2018-04-03 15:33
 * @since 1.0
 */
public class TreeRoot {


    private TreeNode treeNode;

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }


    /**
     * 创建二叉查找树
     * @param treeRoot
     * @param value
     */
    public static  void createTree(TreeRoot treeRoot,int value){

        //如果树根为空（第一次访问），将第一个值作为根节点
        if(treeRoot.getTreeNode()==null){
            TreeNode treeNode=new TreeNode(value);
            treeRoot.setTreeNode(treeNode);
        }else{

            //当前树根
            TreeNode tempRoot=treeRoot.getTreeNode();

            while(tempRoot!=null){

                if(value>tempRoot.getValue()){
                        //右没有树根,那就直接插入
                    if(tempRoot.getRightTreeNode()==null){
                        tempRoot.setRightTreeNode(new TreeNode(value));
                        return;
                    }else{
                        //如果右有树根，到右边的树根去
                        tempRoot=tempRoot.getRightTreeNode();
                    }
                }else{
                        //左没有树根，那就直接插入
                    if(tempRoot.getLeftTreeNode()==null){
                        tempRoot.setLeftTreeNode(new TreeNode(value));
                        return;
                    }else{
                        //如果左有树根，到左边的树根去
                        tempRoot=tempRoot.getLeftTreeNode();
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] arr={10 ,9 ,20 ,15, 35};
        TreeRoot treeRoot=new TreeRoot();
        for(int  value:arr){
            createTree(treeRoot,value);
        }
        Main.test(treeRoot.getTreeNode());
        System.out.println();
        Main.test2(treeRoot.getTreeNode());

    }

}
