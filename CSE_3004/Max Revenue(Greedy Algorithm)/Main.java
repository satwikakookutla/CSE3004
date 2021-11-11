import java.util.*;
import java.lang.*;
class Main{
static int max_value(int array[][], int M,int K, int N)
{
	int[] time = new int[M];
    for(int i = 0; i < N; i++)
	{
		time[array[i][0]] = array[i][1];
	}
    int[][] dp = new int[M][2];
	dp[0][0] = 0;
	dp[0][1] = time[0];
           for(int i = 1; i < M; i++)
	{
		dp[i][0] = Math.max(dp[i - 1][0],dp[i - 1][1]);
dp[i][1] = time[i];if (i - K >= 0)
		{
	           dp[i][1] += Math.max(dp[i - K][0],dp[i - K][1]);
		}
	}
	return Math.max(dp[M - 1][0], dp[M - 1][1]);
}
public static void main(String[] args)
{
	int array[][] = { { 0, 10 },{ 4, 110 },{ 5, 30 } };
	int N = 3;
	int K = 2;
	int M = 6;
          System.out.println(max_value(array, M, K, N));
}
}




