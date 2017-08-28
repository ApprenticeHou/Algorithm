package 剑指offer;


/**
 * 实现链表的反转
 * @author DELL
 *分别通过循环和递归的方式进行反转操作
 */
public class LinkReverse {
	//通过循环来实现反转
public T reverse(T t){
	T pre=null;
	while(t!=null){
		T next=t.next;
		t.next=pre;
		pre=t;
		t=next;
	}
	return pre;
	}
//通过递归来实现链表的反转

public T reverse1(T t1){
	if(t1.next==null)
		return t1;
	T next=t1.next;
	T res=reverse1(next);
	next.next=t1;
	t1.next=null;
	return res;
}
T pre=null;
public T reverse2(T t1){
	T next=t1.next;
	t1.next=pre;
	if(next==null)
		return t1;
	
	pre=t1;
	return reverse2(next);
	
}
public static void main(String[] args) {
	LinkReverse lr=new LinkReverse();
	T t1=new T(1);
	T t=t1;
	for(int i=2;i<9;i++){
		t1.next=new T(i);
//		System.out.println(t1.value);
		t1=t1.next;
	}
	/*T tt=new T(2);
	t1.next=tt;*/
	
	T t2=lr.reverse2(t);
	
	while(t2!=null){
		System.out.println(t2.value);
		t2=t2.next;
	}
	
}

}
