public class ArrayOps {
  public static void main (String[] args) {

  }

//4c: sum returns the sum of individual values in array
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum+= arr[i];
    }
    return sum;
  }

//4b: largest returns the largest value in array
  public static  int largest(int[]arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  // 4c: sumRows returns array with sum of each row.
  public static int[] sumRows(int[][] matrix) {
    int[] sumArr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      sumArr[i] = sum(matrix[i]);
    }
    return sumArr;
  }

  //4d: largestInRows returns array with largest value from each array.
  public static  int[] largestInRows(int[][] matrix) {
    int[] maxArr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        maxArr[i] = largest(matrix[i]);
    }
    return maxArr;
  }

  //4e: sum takes a 2D array of int,
  //and returns the sum of all the individual values in all of the arrays.
  public static  int sum(int[][] arr) {
    int totalSum = 0;
    int[] sumArr = sumRows(arr);
    for (int i = 0; i < sumArr.length; i++) {
      totalSum += sumArr[i];
    }
    return totalSum;
  }

  //5a: sumCols  returns a 1D array of int with each element
  //being the sum of the individual columns of the 2D array.
  public static int[] sumCols(int[][] matrix) {
    if (matrix.length == 0) {
      return new int[0];
    }
    int[] colsSum = new int[matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        colsSum[j] += matrix[i][j];
      }
    }
    return colsSum;
  }
}
