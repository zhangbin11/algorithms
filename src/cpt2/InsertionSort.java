package cpt2;


import edu.princeton.cs.algs4.StdOut;

/**
 *
 * 插入排序
 *
 */
public class InsertionSort {

    public static void sort(Comparable[] a) {

        if(a==null || a.length<2){
            return;
        }

        for(int i=1;i<a.length;i++){
            for(int j = i;j>0;j--){
                if(a[j].compareTo(a[j-1])<0){
                    exch(a,j-1,j);
                }
            }
        }


    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }
    public static boolean isSorted(Comparable[] a)
    { // 测试数组元素是否有序
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
    public static void main(String[] args)
    { // 从标准输入读取字符串，将它们排序并输出
//        String[] a = In.readStrings();
        String[] a = {"1","2","321"};
        sort(a);
//        assert isSorted(a);
//        show(a);
        if(isSorted(a)){
            show(a);
        }
    }
}
