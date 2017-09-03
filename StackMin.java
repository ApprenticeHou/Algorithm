package 剑指offer;

import java.util.Stack;
/**
 * 建立一个弹出栈中的最小元素的程序，并且其时间复杂度为O(1)
 * @author DELL
 *利用一个辅助空间将用于存储最小元素
 */
public class StackMin {
	Stack<Integer> s=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
@SuppressWarnings("null")
public int min(){
	int t;
	if(min.isEmpty())
		t=(Integer) null;
	else 
		t=min.pop();
	return t;
}
/*
 * 将数据压入栈中
 */
public void push(int t){
	s.push(t);
	//如果输入元素小于栈的顶端元素的，将此元素压入栈中
	if(min.isEmpty()||t<min.peek())
		min.push(t);
	//若没有则将原来最小元素压入
	else
		min.push(min.peek());
}
public int pop(){
	if(s.isEmpty()||min.isEmpty()){
		System.out.println("已经空了");
		return 0;
	}
	else
	{
	s.pop();
	return min.pop();
	}
	
}
}
