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
  /* sumRows()` takes a 2D array of int, and returns a 1D array of int
  with each element being the sum of the individual rows of the 2D array.
  */
  public static int[] sumRows(int[][] matrix) {
    int[] sumArr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      sumArr[i] = sum(matrix[i]);
    }
    return sumArr;
  }

  public static  int[] largestInRows(int[][] matrix) {
    int[] maxArr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        maxArr[i] = largest(matrix[i]);
    }
    return maxArr;
  }
}
