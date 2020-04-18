/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author u162071
 */
public class SelectionSort {
    private long[] a;
    private int n;
    public SelectionSort(int max){
        a=new long[max];
        n=0;
        
    }
    public void insert(long val){
        a[n]=val;
        n++;
    }
    public void display(){
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
            
        }
        
    }
    public void selectionSort(){
        int out,in,min;
        for(out=0;out<n-1;out++){
            min=out;
            for(in=out+1;in<n;in++){
                if(a[in]<a[min])
                    min=in;
            }
                swap(out,min);
            
        }
    }

    private void swap(int one, int two) {
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;
        }
    public static void main(String[] args) {
        int size=100;
        SelectionSort arr=new SelectionSort(size);
        System.out.println("Array...");
        arr.insert(23);
        arr.insert(19);
        arr.insert(5);
        arr.insert(90);
        arr.insert(10);
        arr.insert(45);
        arr.insert(38);
        arr.insert(85);
        arr.display();
        System.out.println("");
        System.out.println("After selection sort.........");
        arr.selectionSort();
        arr.display();
        
    }
}
