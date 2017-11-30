import java.util.Scanner;

public class Gravity {
	static int n;
	static int m;
	public static void swap(String[][] map, int x, int y){
		

		if (x<=n-2){
			if(map[x][y].equals("o")&&map[x+1][y].equals("o")){
				swap(map,x+1,y);
				
			}
			else if(map[x][y].equals("o")&&map[x+1][y].equals(".")){
				map[x][y]=".";
				map[x+1][y]="o";
			}
			else if(map[x][y].equals("o")&&map[x+1][y].equals("#")){
			}
			
			if(map[x][y].equals("o")&&map[x+1][y].equals(".")){
				map[x][y]=".";
				map[x+1][y]="o";
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] firstLine = scan.nextLine().split(" ");
		n = Integer.parseInt(firstLine[0]);
		m = Integer.parseInt(firstLine[1]);
		
		String[][] map =new String[n][m];
		for(int i =0; i<n;i++){
			String[] mapLine = scan.nextLine().split("");
				map[i]=mapLine;
			
			
		}
//		for(int i =0; i<n;i++){
//			for(int j =0; j<m;j++){
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}

		for(int i =0; i<n;i++){
			for(int j =0; j<m;j++){
				swap(map,i,j);
			}
		}
		
		for(int i =0; i<n;i++){
			for(int j =0; j<m;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}

}
