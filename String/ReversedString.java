public class ReversedString {
    public static void main(String[] args) {
		
		String s[] = "i love coffee".split(" ");
		
		String ans = " ";
		
		for(int i = s.length - 1; i>=0;i--) {
			
			ans= ans + s[i] + " ";
		
		}
		System.out.println("Reversed String");
		System.out.println(ans.substring(0,ans.length() -1));
			
//		System.out.print(a.substring(7,13));
//		
//		System.out.print( " " +a.substring(2,6));
//	   
//		System.out.print( " " +a.substring(0,2));
		
}
