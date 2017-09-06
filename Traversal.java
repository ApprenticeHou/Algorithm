package 剑指offer;

import java.util.LinkedList;

/**
 * 对于树的先序遍历,后序遍历，中序遍历
 * @author DELL
 *运用递归操作
 */
public class Traversal {
	/*
	 * 先序遍历
	 */
public void Preorder(BinaryTreeNode b){
	if(b==null){
		System.out.println("节点为空");
	}
	System.out.print(b.value);
	if(b.left!=null)
		Preorder(b.left);
	if(b.right!=null)
		Preorder(b.right);
}
/*
 * 中序遍历
 */
public void Order(BinaryTreeNode b){
	if(b==null){
		System.out.println("树不能为空");
		return;
	}
	//System.out.println("中序遍历");
	if(b.left!=null)
		Order(b.left);
	System.out.print(b.value);
	if(b.right!=null)
		Order(b.right);
}
/*
 * 后续遍历
 */
public void Postorder (BinaryTreeNode b){
	if(b==null){
		System.out.println("树不能为空");
		return ;
	}
	if(b.left!=null)
		Postorder(b.left);
	if(b.right!=null)
		Postorder(b.right);
	System.out.print(b.value);
}
/*
 * 实例
 */
public static void main(String[] args) {
	BinaryTreeNode b=new BinaryTreeNode(0);
	LinkedList<BinaryTreeNode> s=new LinkedList <>();
	s.add(b);
	for(int i=1;i<10;i++){
		BinaryTreeNode b1=s.remove();
		b1.left=new BinaryTreeNode(i);
		b1.right=new BinaryTreeNode(++i);
		if(b1.left!=null)
			s.add(b1.left);
		if(b1.right!=null)
			s.add(b1.right);
	}
	Traversal p=new Traversal();
	p.Preorder(b);
	System.out.println("先序遍历");
	p.Order(b);
	System.out.println("中序遍历");
	p.Postorder(b);
	System.out.println("后续遍历");
}
}
