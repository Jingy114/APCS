public class FastSelect {

//swapping elements x and y in an array
  public static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

//let a be element 0, b be last element and c the pivot
  public static int partition(int[] arr, int a, int b, int c) {
    int pivit = arr[c];
    swap(arr, c, b);
    c = a;
    for(int i = a; i < b; i++){
      if(arr[i] <= pivot){
        swap(arr, i, c);
        c++;
      }
    }
    swap(arr, c, b);
    return c;
  }

public static void print(int[] arr){
  for (int i = 0; i < arr.length; i++){
    System.out.println(arr[i] + " ");
  }
  System.out.println();
}

public static int fastSelect(int[] arr, int a, int b, int k){
  if (a ==b){
    return arr[a];
  }
  int c = 
}

//exmaple arrays
//
//
//


public static void main(String[] args){
  System.out.println()
}
  
}
