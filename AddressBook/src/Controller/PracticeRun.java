package Controller;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeRun {
    int[] A ={1,2,3,2,5};
    int[] B ={2,5,6,1,3,3};
    public void sum(){
        int sum= Arrays.stream(A).sum();
        System.out.println("Sum of the Integer Element:-"+sum);
    }

    public void largeElement(){
        int large=A[0];
        for (int i = 0; i < A.length; i++) {
            if (large < A[i]) {
                large = A[i];
            }
        }
        System.out.println("Largest element in Array:-"+large);
    }
    public void secondLargeElement(){
        int large;
        for (int i = 0; i < A.length; i++)
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    large = A[i];
                    A[i] = A[j];
                    A[j] = large;
                }
            }
        System.out.println("Largest element in Array:-"+A[A.length-2]);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i ]);
        }
    }

    public void reverse(){
           int a=A.length-1;
       for(int i=0;i<A.length/2;i++){
           int temp1=A[i];
           int temp2=A[a];

           A[i]=temp2;
           A[a]=temp1;
           a--;
       }
        for (int i = 0; i <a; i++) {
            System.out.println(A[i]);
        }
    }
    public void duplicate(){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    j++;
                } else if (A[i] == A[j]) {
                    A[i]=0;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public void rotation(){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int l=A.length-1;
        for (int i = a; i < A.length; i++) {
            int first=A[i];
             int last=A[l];

             A[i]=last;
             A[l]=first;
             l--;
        }
        for (int i = 0; i < A.length ; i++) {
            System.out.println(A[i]);
        }
    }

    public void intersection(){
        int C[]=new int[A.length];
        int z=0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length ; j++) {
                if (A[i]==B[j]) {
                    C[z]=A[i];
                    z++;
                }
            }
        }
        for (int i = 0; i < C.length ; i++) {
            System.out.println(C[i]);
        }
    }

//    public Integer smallElement(int arr[]){
//        int small=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<=arr[0]) {
//                small=arr[i];
//            }
//        }
////        System.out.println("Smallest Element in Array is:-"+small);
//        return small;
//    }

    public void smallElement(){
        int small=B[0];
        int x=0;
        Integer C[]=new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            if (small >= B[i]) {
                small=B[i];
                C[x]=B[i];
                x++;
            }
        }
//        System.out.println("Smallest Element in Array is:-"+small);
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }
    }

    public void secondSmallElement(){
//        int small=B[0];
//        int x=0;
//       Integer[] c = new Integer[B.length];
//        for (int i = 0; i < B.length; i++) {
//            if (small<=B[i]) {
//                c[x]=B[i];
//                small=B[i];
//                x++;
//            }
//        }
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
//        System.out.println("Second Smallest Element in Array is:-"+c[1]);
//       Integer arr= smallElement();
        System.out.println();
        for (int i = 0; i < A.length ; i++) {
            if (A[0]>A[i] && A[i]>0) {
                System.out.println("Second Smallest Element in Array is:-"+A[i]);
            }
        }
//        int[] c = Arrays.stream(B).filter(x -> (small = Math.min(small, x)) <= x).toArray();
    }
    public void EvenOdd(){

    }

    public static void main(String[] args) {
        PracticeRun practiceRun=new PracticeRun();
//        practiceRun.reverse();
//        practiceRun.duplicate();
//        practiceRun.smallElement();
//        practiceRun.secondSmallElement();
        practiceRun.secondLargeElement();
//        practiceRun.rotation();
//        practiceRun.intersection();
//        practiceRun.largeElement();
    }
}
