package com.trickyJavaConcepts;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        //example1
        int jaggedArray [][] = new int[3][];
        jaggedArray[0]=new int[]{10,11,12};
        jaggedArray[1]=new int[]{13,14,15,16};
        jaggedArray[2]=new int[]{17,18,19,20,21};
        for(int i:jaggedArray[2])
        {
            //  System.out.print(i);
        }

        //example2
        int arr[][]= new int[2][];
        int count=0;
        arr[0]= new int[3];
        arr[1]= new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                arr[i][j]= count++;

            }
        }

        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
        //        System.out.print(arr[i][j]);
            }
          //  System.out.println();
        }

        //example 3
        int arr1[][] = new int[5][];

        for(int i =0;i<arr1.length;i++){
            arr1[i] = new int[i+1];
        }
          int temCount=0;
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=temCount;
                temCount++;
            }
        }


        for(int i =0;i<arr1.length;i++){
            for(int j=0;j< arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }




    }



}

