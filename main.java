   import java.util.Scanner;

   public class Main {
	static Scanner castillo_scan = new Scanner(System.in);	      
        private static int Percent, Number, TotalNum, Case;
	public static void Input(){
		System.out.print("INPUT OBTAINED  VALUE: ");
		Number = castillo_scan.nextInt();
		System.out.print("INPUT THE TOTAL VALUE: ");
         	TotalNum = castillo_scan.nextInt();
	}
	public static void Output(){

         Case = Number*100/TotalNum;
	   System.out.println(" ");   
           System.out.println(Case+"%");                                    
	}
	public static void main(String[] args) {
		Input();
		Output();
	}
}
