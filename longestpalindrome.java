package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class longest_palindrome {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> l=new ArrayList<String>();
		System.out.println("Enter the String");
		String str=sc.next();
		int n=str.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				String s=str.substring(i,j);
				String rev="";
				for(int k=s.length()-1;k>=0;k--) {
					rev=rev+s.charAt(k);
				}
				if(rev.equals(s)) {
					l.add(s);
				}
			}
		}
		int check=l.get(0).length();
		int index=0;
		for(int i=0;i<l.size();i++) {
			if(check<=l.get(i).length()) {
				check=l.get(i).length();
				index=i;
			}
		}
		System.out.println("Longest Palindrome : "+l.get(index));
	}
}
