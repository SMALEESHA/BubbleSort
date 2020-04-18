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
public class BubbleSort {
    
    private long [] arr;
    private int nElements;
    
    public BubbleSort(int max){
        arr=new long [max];
        nElements=0;
    }
    public void insert(long value){
        arr[nElements]=value;
        nElements++;
    }
    public void display(){
        for(int j=0;j<nElements;j++){
            System.out.print(arr[j]+" ");
           // System.out.println(" ");
        }
    }
    public void bubbleSort(){
        int out,in;
        for (out =nElements -1;  out>1;out--) {
           for(in=0;in<out;in++){
               if(arr[in]>arr[in+1])
                   swap(in,in+1);
           }
            
        }
    }

    private void swap(int one, int two) {
        long temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public static void main(String[] args) {
        int maxSize=100;
        BubbleSort array=new BubbleSort(maxSize);
        System.out.println("Array.....");
        array.insert(77);
        array.insert(99);
        array.insert(55);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(22);
        array.insert(33);
        array.display();
        System.out.println(" ");
        System.out.println("After bubble sort........");
        array.bubbleSort();
        array.display();
    }
}
