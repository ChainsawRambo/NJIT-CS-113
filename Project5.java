//Devon Keen

//4/24/19

//CS113-002

//Project 5

public class Project5 {

    public static void main(String[] args) {

        int n = args.length == 1 ? Integer.parseInt(args[0]) : 1;

        for (int i = 1; i <= n; ++i) {
            int[] arr = Pascal.triangle(i);
            System.out.print((i < 10 ? " " : "") + i + ": ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Pascal {

    public static int[] triangle(int n) {
      int[] array = new int[n+1];
      if (n == 0){
         array[0] = 1;
         return array;
      }
      int[] present = triangle(n-1);
      array[0] = array[n] = 1;
      for (int i = 1; i< present.length; ++i){
         array[i] = present[i-1] + present[i];
      }
      return array;
    }
}
