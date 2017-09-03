package 剑指offer;
/**
 * 将一个二叉查找树转化为一个排好顺序的双向链表
 * @author HOU
 *通过使根节点的左节点为其左子树的最大节点，右节点为其右子树的最小节点。
 *通过使用递归的方法来实现
 */
public class TreeToLinkedList {
	/*
	 * 将二叉查找树转变为双向链表
	 */
public BinaryTreeNode convert(BinaryTreeNode b){
	BinaryTreeNode head=null;
	BinaryTreeNode last=null;
	if(b!=null){
		conConvert(b, last);
	}
	//将最左端的元素遍历出来返回
	if(b.left!=null&&b!=null)
		head=b.left;
	return head;
}
/*
 * 核心代码同过记录排好的顺序记录下最后一个元素，然后连接起下一个元素
 */
private void conConvert(BinaryTreeNode b,BinaryTreeNode last){
	if(b==null)
		return;
	if(b.left!=null)
		conConvert(b.left,last);
	b.left=last;//将右边的最小元素与链表的最后一个元素相连
	last=b;//改变链表最好一个元素
	if(last!=null)
		last.right=b;//同上是双向链表
	if(last.right!=null)//连接右子树
		conConvert(b.right, last);
}
}
