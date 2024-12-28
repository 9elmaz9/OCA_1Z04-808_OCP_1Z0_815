package Enthuware.Standart.one;

public class test4 {


    //Consider the following code for the main() method:
    public static void main(String[] args) throws Exception {
        int i = 1, j = 10;
        do {
            if (i++ > --j) continue;
        } while (i < 5);
        System.out.println("i=" + i + " j=" + j);
    }
}
//What will be the output when the above code is executed? i=5 j=6

/**
 * To understand the flow, let us put a print statement in the code:
        int i = 1, j = 10;
int k = 1;
do{
        System.out.

println("Iteration "+k+": i="+i+" j="+j);
   if(i++>--j)continue;

        }while(i< 5);
        System.out.

println("i="+i +" j="+j);

It generates the following output:
Iteration 1:i=1j=10
Iteration 2:i=2j=9
Iteration 3:i=3j=8
Iteration 4:i=4j=7i=5j=6
In the iteration 1,the if comparison goes like this:if(1++>--10)continue;=>if(1>9).
The values of i and j after the if statement are 2and 9
In theiteration 2,the if comparison goes like this:if(2++>--9)continue;=>if(2>8).
The values of i and j after the if statement are 3and 8
In the iteration 3,the if comparison goes like this:if(3++>--8)continue;=>if(3>7).
The values of i and j after the if statement are 4and 7
In the iteration 4,the if comparison goes like this:if(4++>--7)continue;=>if(4>6).
The values of i and j after the if statement are 5and 6
Now, i is not< 5 so the while(i<5) check fails and the loop terminates. So the final values are 5and 6.
*/