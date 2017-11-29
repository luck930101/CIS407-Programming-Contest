import java.util.Scanner;

public class Cameras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String[] firstLine = scan.nextLine().split(" ");
		int houseNumber = Integer.parseInt(firstLine[0]);
		int cameraNumber = Integer.parseInt(firstLine[1]);
		int density = Integer.parseInt(firstLine[2]);
		int[] houselist = new int[houseNumber];
		int[] cameralist = new int[houseNumber-density+1];
		int newcamera = 0;
		
		for (int i = 0; i< cameraNumber;i++){
			int camPosition = Integer.parseInt(scan.nextLine());
			houselist[camPosition-1] = 1;
			for (int j = 0; j< density;j++){
				if(camPosition-j>=1&&camPosition-j<=cameralist.length){
					cameralist[camPosition-j-1]++;
				}
			}
		}
		
//		System.out.print("house list:");
//		for (int i = 0; i< houselist.length;i++){
//			System.out.print(houselist[i]);
//		}
		
		for (int i = 0; i< cameralist.length;i++){
			if (cameralist[i] ==1){
				newcamera++;
				for (int j = 0; j< density;j++){
					if(i+j<cameralist.length){
						cameralist[i+j]++;
					}
				}	
			}
			else if (cameralist[i] ==0){
				newcamera++;
				for (int j = 0; j< density;j++){
					if(i+j<cameralist.length){
						cameralist[i+j]++;
					}
				}
				newcamera++;
				for (int j = 0; j< density-1;j++){
					if(i+j<cameralist.length){
						cameralist[i+j]++;
					}
				}	
				
			}
		}
//		System.out.print("should add :");
		System.out.print(newcamera);
//		System.out.print("camlist :");
//		for (int i = 0; i< cameralist.length;i++){
//			System.out.print(cameralist[i]);
//		}
	}

}
