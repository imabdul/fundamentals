import java.util.Scanner;
import java.util.StringTokenizer;


public class StackProblem {
	
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int capacity=in.nextInt();
		StackProblem sp=new StackProblem(capacity);
		String command[];
		String query="";
		String query1="";
		for(int i=0;i<capacity;i++)
		{
			String input=in.nextLine();
			if(input.contains("push"))
			{
				command=input.split(" ");
				System.out.println(sp.push(command[1]));
				
			}
			else if(input.contains("pop"))
			{
				System.out.println(sp.pop());
				
			}
			else if (input.contains("inc"))
			{
				command=input.split(" ");
				System.out.println(sp.inc(command[1],command[2]));
			}
		}
        
	}
	static String[] stk;
	static int n=0;
	
	
	public StackProblem(int capacity)
	{stk = new String [capacity];}
	
	public String push (String item)
	{stk[n++]=item;
	return item;}
	
	public String pop ()
	{ 
		--n;
		if (!isEmpty()){
			 return stk[n-1];
			
		// stk[n-1];
		// stk[n-1];
		} return "EMPTY";
	}
	
		public boolean isEmpty()
	{
		return n<=0;
	}
	
	public String inc (String items, String num)
	{
		for (int i=0; i<Long.parseLong(items); i++){
		stk[i]=String.valueOf(Long.parseLong(stk[i])+Long.parseLong(num));
		
	}
		return stk[n-1];
	}
}
