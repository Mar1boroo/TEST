    import java.util.Scanner;

    public class Main
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); int m = sc.nextInt();
            int[] arr = new int[n+1];

            for(int i = 0  ; i < arr.length ; i ++)
                arr[i] = i ;

            for(int i = 0; i < m ; i ++)
            {
                int begin = sc.nextInt() ; int end = sc.nextInt(); int mid = sc.nextInt();
                int[] temp = new int[mid-begin];
                int[] temp2 = new int[end-mid+1];
                for(int j = 0 ; j < temp.length ; j++)
                    temp[j] = arr[begin+j];

                for(int j = begin ; j <= end-mid+1  ; j++)
                    arr[j] = arr[j+mid-1];

                for(int j = 0 ; j < temp.length ; j++)
                    arr[end-mid+2+j] = temp[j];

            }
            System.out.println("aaaaaaaaaaaaaaaaaaa");
            for(int i = 1 ; i < arr.length ; i ++)
                System.out.print(arr[i] + " ");
            for(int j = 1 ; j < arr.length ; j ++)
                System.out.println("123123");

            System.out.println("Hello Test");
        }
    }
