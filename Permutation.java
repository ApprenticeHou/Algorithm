package 剑指offer;

/**
 * 输入一段字符串，将打印出其组成字符的所有排序方式,排列的实现
 * @author HOU
 *通过使用递归的方式，将字符串分为两部分来打印，新打印第一个字母，在打印第二个字母
 */
public class Permutation {
 public void permutation(String s){
	 if(s==null)
		 return;
	 char[] c=s.toCharArray();//将原来的字符串转化为字符数组
	 permutation(c,0);
 }
 private void permutation(char[] s,int start){
//	 char[] res=new char[s.length];//最终的数组
	 if(start==s.length){
		 for(char c:s)
			 System.out.print(c);
		 System.out.println();//打印
		 return;
	 }
	 //遍历所用的元素，并将以使用过的元素替换到最前面start的位置
	 for(int x=start;x<s.length;x++){
		 char tem=s[x];
		 s[x]=s[start];
		 s[start]=tem;//替换过程
		/* res[start]=tem;
		 System.out.println(res[start]+"   start   "+start);*/
		 permutation(s,start+1);//递归调用
		 tem=s[x];
		 s[x]=s[start];
		 s[start]=tem;//替换完成之后需要将原来数据恢复,以便于下一组数据的打印
	 }
 }
/*
 * 测试
 */
 public static void main(String[] args) {
	Permutation p=new Permutation();
	p.permutation("abc");
}
}
