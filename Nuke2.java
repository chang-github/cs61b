import java.io.*;


class Nuke2{
    public static void main(String[] args)throws Exception{
        String input=null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		input = in.readLine();
		System.out.println(input.substring(0,1)+input.substring(2));
    }
}