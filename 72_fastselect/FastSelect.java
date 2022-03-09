kpublic class FastSelect {

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
        c++; // heyyy shawty
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
  int s = 0;
  printArr(array);
  int kVal = array(k);
  s = partition(array, a, b, k);

  if(k == (y-1){
    return kVal;
  }else if(s < (y-1){
    return fastSelect(y-s, array, s, b, b);
  }else{
    return fastSelect(y, array, a, s-1, s-1);
  }
  }
  }
}

//exmaple arrays
//
//
//


public static void main(String[] args){
  System.out.println()
}
  
}
