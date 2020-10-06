public class javatest {

       public static void main(String[] args){
       //Original Array

       int arrInt [] = new int[5];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

       //Count the size of an array without APIs

        int count = 0;
        int sizeOfArray;
        for (int i = 0; i<arrInt[i]; i++){
            //System.out.println(arrInt[i]);
            count = count + 1;
        }
        sizeOfArray = count;
        System.out.println("The current size of array is :" + sizeOfArray);
        //Copy of data from one array to new array

        for (int i = 0; i<sizeOfArray; i++){
            arrInt[i] = arrInt[i+1];
            System.out.println(arrInt[i]);
        }
        if (sizeOfArray != 0){
            System.out.println("The array is not empty");
        }else{
            System.out.print("Array is Empty");
        }

        }

}

