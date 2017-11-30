import java.util.Scanner;

public class StarArrangements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int starNum = Integer.parseInt(scan.nextLine());
		int x = 2;
		int y = 1;
		while (x<starNum){
			if (starNum%(x+y)==x||starNum%(x+y)==x||starNum%(x+y)==0){
				System.out.print(x);
				System.out.print(",");
				System.out.print(y);
				System.out.println();
			}
			if (x>y){
				y++;
			}
			else{
				x++;
			}
		}
	}

}
