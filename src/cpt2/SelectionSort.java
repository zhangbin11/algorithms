package cpt2;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * 选择排序
 *
 */
public class SelectionSort  {

    public static void sort(Comparable[] a) {

        if(a==null || a.length<1){
            return;
        }

        for(int i =0 ; i < a.length ; i++){
            Comparable min = a[i];
            int index = i;
            for(int j = i+1;j < a.length; j++){
                if(a[j].compareTo(min) > 0){
                    continue;
                }
                min = a[j];
                index = j;
            }
            if(i==index){
                continue;
            }

            exch(a,index,i);

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
//        String[] a = {"41","2","321"};
        String[] a = {"f","c","e"};
        show(a);
        sort(a);
        if(isSorted(a)){
            show(a);
        }
    }



}


