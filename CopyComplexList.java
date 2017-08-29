package 剑指offer;
/**
 * 复制一个复杂的链表不仅有下一个元素，还存在着一个sibing的随机元素
 * @author DELL
 *通过用分支算法来实现，先来复制一部分（下一个元素），再来复制随机的元素，从而达到全部复制的效果
 */
public class CopyComplexList {
  
}
class ComplexListNode{
	int value;
	ComplexListNode next;
	ComplexListNode sibing;
}