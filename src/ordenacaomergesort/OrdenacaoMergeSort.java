package ordenacaomergesort;

import java.util.Arrays;

public class OrdenacaoMergeSort {

    public static void main(String[] args) {
        
        MergeSort m = new MergeSort();
        
        int []v = {4, 6, 2, 3, 5, 7, 1, 8};
        int []w = new int[v.length];
        
        m.mergeSort(v, w, 0, v.length - 1);
        System.out.println(Arrays.toString(v));
    }
    
}
