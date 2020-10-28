
public class triangle {

	
	public static void main(String[] args) {
		try {
		if(args.length>0&&args.length<=3) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = Integer.parseInt(args[2]);
			
			if(x>0&&y>0&&z>0) {
				if(x<=26&&y<=26&&z<=26) {
				if(x+y>z&&y+z>x&&z+x>y) {
					if(x==y&&y==z) {
						System.out.println("Equilateral");
					}else if(x==y||y==z) {
						System.out.println("Isosceles");
					}else {
						System.out.println("Scalene");
					}
					
				}else {
					System.out.println("Error, Not a triangle");
				}
				}else {
					System.out.println("Error, all values must be less than or equal max value (26)");
				}
			}else {
				System.out.println("Error, all value's must be greater than 0");
			}
		}
		}catch(Exception e) {
			
			System.out.println("Error, required Three positive integers");
			
		}
		

	}
	

}
