package cpt2;


import edu.princeton.cs.algs4.StdOut;

public class ShellSort {

    public static void sort(Comparable[] a) {

        for( int d = a.length/2;d>0;d=d/2){

            for(int m=d ; m<a.length; m++){

                for(int n = m-d ;n>=0; n=n-d){
                    if(a[n].compareTo(a[m])>0){
                        exch(a,n,m);
                    }

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
        String[] a = {"433","2","321"};
        sort(a);
//        assert isSorted(a);
//        show(a);
        if(isSorted(a)){
            show(a);
        }
    }
}
