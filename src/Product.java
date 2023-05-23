//WAP to find the maximum possible product of two numbers in an array.
public class Product {
    int[] input;
    int maxNum;
    int secondMaxNum;
    int maxProductOfTwo;
    int smallestNum;
    int secondSmallestNUM;

    Product(int[] input) {
        this.input = input;
    }

    public void setMaxAndSmallestNum() {
        //Setting highest and lowest values between array index 1 and 2.
        if (input[0] > input[1]) {
            this.maxNum = input[0];
            this.secondMaxNum = input[1];
            this.smallestNum = input[1];
            this.secondSmallestNUM = input[0];
        } else {
            this.maxNum = input[1];
            this.secondMaxNum = input[0];
            this.smallestNum = input[0];
            this.secondSmallestNUM = input[1];
        }
    }

    public void setMaxNumAndSmallestNumInInput() {
        // setting Highest and Second-highest values in tha array.
        setMaxAndSmallestNum();
        for (int i = 2; i < input.length; i++) {
            if (input[i] > maxNum) {
                this.secondMaxNum = maxNum;
                this.maxNum = input[i];
            } else if (input[i] > secondMaxNum) {
                this.secondMaxNum = input[i];
            }
            if (input[i] < smallestNum) {
                this.secondSmallestNUM = smallestNum;
                this.smallestNum = input[i];
            } else if (input[i] < secondSmallestNUM) {
                this.secondSmallestNUM = input[i];
            }
        }
    }

    public void CalculatingMaxProductOfTwo() {
        setMaxNumAndSmallestNumInInput();
        if (maxNum * secondMaxNum > smallestNum * secondSmallestNUM){
            this.maxProductOfTwo = maxNum * secondMaxNum;
        }else {
            this.maxProductOfTwo = smallestNum * secondSmallestNUM;
        }
    }

    public void display() {
        System.out.println("Maximum possible product of two numbers in an array is " + maxProductOfTwo);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, -2, 4, 9, 3, -8};
        Product input1 = new Product(arr1);
        input1.CalculatingMaxProductOfTwo();
        input1.display();
    }
}




