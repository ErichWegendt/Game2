
public class Main {

	
	public static void main(String[] args )
	{
	   int n;   //command line parameters decide how many turns there will be
	   try 
	   {
		    int n2=Integer.parseInt(args[0]);
			System.out.println(n2);
			if (n2<0)
			{
			   throw new Exception();
			}
			n=n2;
			   new MyFrame(n);
	   }
	   catch(Exception e)
	   {
		    System.out.println("Error no command line parameters,there will be 5 turns");
		    n=5;
		    new MyFrame(n);    
	   }
		
	   
	}
}
