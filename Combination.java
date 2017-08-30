package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据所给的字符数组，输出所有的组合形式
 * @author DELL
 *运用递归的方式来输出
 */
public class Combination {
	private List<Character> arr=new ArrayList<>();//用于储存索要打印的数据
public void combination(char[] c){
	if(c.length==0)
		System.out.println("没有元素");//健壮性
	//输出所有位数的组合形式
	for(int i=1;i<=c.length;i++){
		combine(c,0,i);
	}
}
/*
 * 核心代码
 * c 是输入的数组
 * start 开始的位置
 * num 索要的打印的数字位数
 */
private void combine(char[] c,int start,int num){
	if(num==0)//代表数据已经打印完成所要的位数
	{
		System.out.println(arr.toString());
		return;
	}
		if(start==c.length)
		return;//开始数字已经超过了范围
		arr.add(c[start]);//添加当前元素，此时递归的两种形式为下面的，包括此数字，或者不包括此数字
//		System.out.println(c[start]);
		//包括此数字的情况，此时首位请进，并且已经有一个数字进入数组中则所需的元素则少一个
		combine(c,start+1,num-1);
		//递归完成后将数组清空
		arr.remove((Character)c[start]);
		//第二种情况数组中不要当前元素
		combine(c,start+1,num);
}
/*
 * 测试
 */
public static void main(String[] args) {
	char[] c={'l','o','v','e'};
	Combination com=new Combination();
	com.combination(c);
}
}
