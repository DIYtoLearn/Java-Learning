package GFG.Loops;

        public class Fibo
        {
            public static void main(String ag[])
            {
                    int n = 3;
                    if(n==1 || n==2)
                    System.out.print("1");

                    else {
                            int a = 1;
                            int b = 1;
                            int nw = 0;
                            System.out.print(a + " " + b);

                            for (int i = 3; i <= n; i++) {
                                    nw = a + b;
                                    System.out.print(" " + nw);
                                    a = b;
                                    b = nw;


                            }

                            System.out.println();
                            System.out.print(nw);
                    }
            }
        }