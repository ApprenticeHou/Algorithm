package ½£Ö¸offer;

public class printToMax {
public static void printTomax(int n){
	if(n<=0)
		return;
	char[] ch=new char[n+1];
	for(int i=0;i<10;i++)
	{
		ch[0]=(char) ('0'+i);
		printTomaxDigit(ch,n,0);
	}
}
public static void printTomaxDigit(char[] ch,int length,int index){
	if(index==length-1){
		System.out.println(ch);
		return;
	}
	for(int i=0;i<10;i++){
		ch[index+1]=(char) (i+'0');
		printTomaxDigit(ch,length,index+1);
	}
}
public static void main(String[] args) {
	printTomax(2);
}
}
