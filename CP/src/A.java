import java.io.*;
import java.util.*;
 
public class A {
	public static void main(String[] args)throws IOException {
		FastScanner scan = new FastScanner();
		PrintWriter output = new PrintWriter(System.out);
		int t = scan.nextInt();
		for(int tt = 0;tt<t;tt++) {
			int arr[] = scan.readArray(7);
			long max = arr[6];
			outer:
				for(int i = 0;i<7;i++) {
					for(int j = i+1;j<7;j++) {
						for(int k = j+1;k<7;k++) {
							if(arr[i]+arr[j]+arr[k] == max) {
								output.println(arr[i]+" " + arr[j]+ " " +arr[k]);
								break outer;
							}
						}
					}
				}
		}
		output.flush();
		
	}
 
	public static int[] sort(int arr[]) {
		List<Integer> list = new ArrayList<>();
		for(int i:arr) list.add(i);
		Collections.sort(list);
		for(int i = 0;i<list.size();i++) arr[i] = list.get(i);
		return arr;
	}
 
	public static int gcd(int a, int b) {
		if(a == 0) return b;
		return gcd(b%a, a);
	}
 
	public static void printArray(int arr[]) {
		for(int i:arr) System.out.print(i+" ");
		System.out.println();
	}
 
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
 
}