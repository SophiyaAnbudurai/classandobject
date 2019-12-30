package classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(a);
		String s1,s2;
		s1 = br.readLine();
		s2 = br.readLine();
		Team t=new Team(s1,s2);
		

	}

}
