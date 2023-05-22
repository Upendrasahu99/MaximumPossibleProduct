//WAP to find the maximum possible product of two numbers in an array.
public class Product {
    int[] input;
    int maxNum;
    int secondMaxNum;
    int maxProductOfTwo;

    Product(int[] input) {
        this.input = input;
    }

    public void setMaxAndSecondMaxNum() {
        //Setting highest and lowest values between array index 1 and 2.
        if (input[0] > input[1]) {
            this.maxNum = input[0];
            this.secondMaxNum = input[1];
        } else {
            this.maxNum = input[1];
            this.secondMaxNum = input[0];
        }
    }
    public void setMaxNumAndSecondMaxInArray(){
        // setting Highest and Second-highest values in tha array.
        setMaxAndSecondMaxNum();
        for (int i = 2; i < input.length; i++) {
            if(input[i] > maxNum){
                this.secondMaxNum = maxNum;
                this.maxNum = input[i];
            } else if (input[i] > secondMaxNum) {
                this.secondMaxNum = input[i];
            }
        }
    }

    public  void CalculatingMaxProductOfTwo(){
        setMaxNumAndSecondMaxInArray();
        this.maxProductOfTwo = maxNum * secondMaxNum;
    }

    public void display(){
        System.out.println("Maximum possible product of two numbers in an array is " + maxProductOfTwo);
    }


    public static void main(String[] args) {
        int[] arr1 = {3, 4, -2, 4, 9, 3, 8};
        Product input1 = new Product(arr1);
        input1.CalculatingMaxProductOfTwo();
        input1.display();
    }
}
