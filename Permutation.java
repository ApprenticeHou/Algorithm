package 剑指offer;
/**
 * 输入一段字符串，将打印出其组成字符的所有排序方式
 * @author HOU
 *通过使用递归的方式，将字符串分为两部分来打印，新打印第一个字母，在打印第二个字母
 */
public class Permutation {
 public void permutation(String s){
	 if(s==null)
		 return;
	 permutation(s,0);
 }
 private void permutation(String s,int i){
	 String s1="";
	 for(int x=0;x<s.length();x++){
		 s+=s.charAt(x);
		 
	 }
 }
}
