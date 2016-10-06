import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		try{
			String aStr = in.next();
			int aInt = Integer.parseInt(aStr);
			
			if (aInt > 999){
				Exception e = new Exception("Over 999");
				throw e;
			}
				
			String bStr = in.next();
			int bInt = Integer.parseInt(bStr);
			
			if (bInt > 999){
				Exception e = new Exception("Over 999");
				throw e;
			}
			
			float cFlt = aInt / bInt;
			
			System.out.println(cFlt);
		}
		catch(ArithmeticException ae){
			System.out.println("Div 0");
		}
		catch(NumberFormatException e){
			System.out.println("Not num");
	    }
		catch(Exception e){
			System.out.println("Over 999");
		}

	}

}
