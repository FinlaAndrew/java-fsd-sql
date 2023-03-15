package practiseQ;


	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;

	public class Repeated {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner n = new Scanner(System.in);
			System.out.println("Enter a string : ");
			String s = n.nextLine();
			//String s = "I love Love to To tO code";
			//String s1 = "";
			String s2 = s.toLowerCase();
			String[] s3=s2.split(" ");
			
			List<String> ls = Arrays.asList(s3);
			
			List<String> lss = ls.stream().distinct().toList();
			
			String[] lsttostr = lss.toArray(new String[lss.size()]);
			StringBuilder builder = new StringBuilder();
			for(String ss:lsttostr)
				builder.append(ss + " ");
			String strr = builder.toString();
			System.out.println(strr);
		}

	}


