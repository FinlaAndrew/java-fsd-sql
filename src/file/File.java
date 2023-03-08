package file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class File {

	public static void  main(String[] args) {
		try {
		String s ="Welcome to UST";
		FileOutputStream fout=new FileOutputStream("D://text.txt");
		byte b[]=s.getBytes();
		fout.write(b);
		
		FileInputStream f =new FileInputStream("D://text.txt");
		int i=0,count=0;
		while((i=f.read())!=-1){
			if(i==' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
