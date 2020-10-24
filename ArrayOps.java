public class ArrayOps {
  public static void main (String[] args) {

  }

//4c: returns the sum of individual values in array
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum+= arr[i];
    }
    return sum;
  }

//4b: returns the largest value in array
  public static  int largest(int[]arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }


}
