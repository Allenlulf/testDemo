package com.niuke.jzoffer;
/**
 * 重建二叉树
 * @author lulf
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class cjecs {
	
	public static void main(String[] args) {
		
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		 if(pre == null || in == null || pre.length != in.length )//如果先序或者中序数组有一个为空的话，就无法建树，返回为空
			 return null;
		 else
		 {
			 return reBulidTree(pre,0,pre.length-1,in,0,in.length-1);
		 }
	}
	
	private TreeNode reBulidTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn)
	 {
		 if(startPre > endPre || startIn > endIn)//先对传的参数进行检查判断
			 return null;
		 int root = pre[startPre];//数组的开始位置的元素是跟元素
		 int locateRoot = locate(root,in,startIn,endIn);//得到根节点在中序数组中的位置 左子树的中序和右子树的中序以根节点位置为界
		 if(locateRoot == -1) //在中序数组中没有找到跟节点，则返回空
		   return null;
		 TreeNode treeRoot = new TreeNode(root);//创建树根节点
		 treeRoot.left = reBulidTree(pre,startPre + 1,startPre + locateRoot - startIn,in,startIn,locateRoot-1);//递归构建左子树
		 treeRoot.right = reBulidTree(pre,startPre+locateRoot-startIn+1,endPre,in,locateRoot+1,endIn);//递归构建右子树
		 return treeRoot;
	 }
	 //找到根节点在中序数组中的位置，根节点之前的是左子树的中序数组，根节点之后的是右子树的中序数组
	 private int locate(int root,int[] in,int startIn,int endIn)
	 {
		 for (int i = startIn; i < endIn; i++)
		{
			if(root == in[i])
				return i;
		}
		 return -1;
	 }

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}
