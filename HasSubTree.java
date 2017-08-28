package 剑指offer;
/**
 * 用于检验一棵树是否包含另个一颗树
 * @author DELL
 *通过 递归的调用来判断
 */
public class HasSubTree {
public boolean hasTree(BinaryTreeNode b1,BinaryTreeNode b2){
	boolean res=false;
	if(b1!=null&&b2!=null){
	if(b1.value==b2.value)
		res=hasSub(b1,b2);//如果出现相同的元素则开始判断其儿子是否相同
//如没有则遍历其儿子，通过递归方式实现	
	if(!res)
		hasTree(b1.left,b2);
	if(!res)
		hasTree(b1.right,b2);
	}
	return res;
}
public boolean hasSub(BinaryTreeNode b1,BinaryTreeNode b2){
	if(b2==null)
		return true;//小树为空则肯定包括，说明此树已经遍历完成
	if(b1==null)
		return false;//若子树不为空，但是大数为空，则一定不成立。
	if(b1.value==b2.value)
		return hasSub(b1.left, b2.left)&&hasSub(b1.right,b2.right);
	//通过递归的调用来实现所有
	return false;
}
}
/*
 * 测试用例
 */
class BinaryTreeNode{
	int value;
	public BinaryTreeNode(int i){
		value=i;
	}
	BinaryTreeNode left;
	BinaryTreeNode right;
}