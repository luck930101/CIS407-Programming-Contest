import java.util.Scanner;

public class Alphabet {
	public static int lengthOfLIS(String str) {
	    if(str==null || str.length()==0)
	        return 0;
	 
	    int[] max = new int[str.length()];
	 
	    for(int i=0; i<str.length(); i++){
	        max[i]=1;
	        for(int j=0; j<i;j++){
	            if((int)str.charAt(i)>(int)str.charAt(j)){
	                max[i]=Math.max(max[i], max[j]+1);
	            }
	        }
	    }
	 
	    int result = 0;
	    for(int i=0; i<max.length; i++){
	        if(max[i]>result)
	            result = max[i];
	    }
	    return 26-result;
	}

	public static void main(String[] args) {
		//
		// TODO Auto-generated method stub
//		System.out.println(lengthOfLIS("xyzabcdefghijklmnopqrstuvw"));
//		System.out.println(lengthOfLIS("aiemckgobjfndlhp"));
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(lengthOfLIS(s));
	}

}
