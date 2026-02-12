// package Rating_800;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) { 
			int n=sc.nextInt();
			int [] arr=new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			int count=0;
			int ans=0;
			
			for(int i=0; i<n; i++ ) {
				if(arr[i]==0) {
					count++;
				}
				else {
					ans=Math.max(count, ans);
					count=0;
				}
			}
			ans=Math.max(count, ans);
			
			System.out.println(ans);
			
		}

	}

}