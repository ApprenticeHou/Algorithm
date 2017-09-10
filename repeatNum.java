package 剑指offer;
/**
 * 用来检测数组中是否存在重复数字
 * @author Hou
 * 时间复杂度O(n)，空间复杂度为O(1)
 * 只应用于数组中的数字小于该数组的长度
 */
public class repeatNum {
public static void repeat(int[] i){
	int l=i.length;
	if(l<=1){
		System.out.println("没有重复数字");
	}
	else{
		for(int x=0;x<l;x++){
			int temp=i[x];//记录当前i【x】为多少
			if(temp!=x){//如果该位置不为所对应的数字则进行改换
				if(i[temp]==temp)
					System.out.println(temp+"是重复数字");
				else{
				i[x]=i[temp];
				i[temp]=temp;
				}
			}
		}
	}
}
public static void main(String[] args) {
	int[] i={1,1,2,3,3,5};
	repeat(i);
}
}
