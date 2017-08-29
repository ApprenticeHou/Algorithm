package ½£Ö¸offer;


import java.util.LinkedList;

public class MirrorTree {
public void mirror(BinaryTreeNode b){
	LinkedList<BinaryTreeNode> s=new LinkedList<BinaryTreeNode>();
	s.add(b);
	if(b==null)
		return ;
	if(b.left==null&&b.right==null)
		return;
	while(!s.isEmpty()){
		BinaryTreeNode b1=s.remove();
		BinaryTreeNode tem=b1.left;
		b1.left=b1.right;
		b1.right=tem;
		if(b1.left!=null)
		s.add(b1.left);
		if(b1.right!=null)
			s.add(b1.right);
	}}
	public void mirror1(BinaryTreeNode b){
		if(b==null)
			return;
		if(b.left==null&&b.right==null)
			return;
		BinaryTreeNode tem=b.left;
		b.left=b.right;
		b.right=tem;
		if(b.left!=null)
			mirror1(b.left);
	    if(b.right!=null)
	    	mirror1(b.right);
}
public static void main(String[] args) {
	MirrorTree mt=new MirrorTree();
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
System.out.println(b.left.left.value);
mt.mirror(b);
System.out.println(b.left.left.value);
}
}
