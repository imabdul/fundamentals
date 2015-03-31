
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CirclesExistence {
	
	 static String doesCircleExists(String commands) { 

		            //Command infinite repetion Logic
			 		while (commands.length()<=2500){
			 			commands=commands + commands;
			 		}
			 		//Command Length should be in 2500 can be 2499
			String rptCommand = commands.substring(0,2500); 
			System.out.println(rptCommand);
		 char[] cmd = rptCommand.toCharArray();
		 //System.out.println(Arrays.toString(cmd));
	        int angle=0;
	        int dist=0;
	 
	       // for (int i=0; i<cmd.length; i++){            
	            for (int j=0; j<cmd.length; j++){
	                switch(cmd[j]) {
	                    case 'G' : {
	                    	dist++;
	                         break;
	                    }
	                    case 'L' : { 
	                         angle-=90;
	                         break;
	                    }
	                    case 'R' : { 
	                         angle+=90; 
	                         break;
	                    }
	                }
	            }   //System.out.println(angle);             

	 
	        if (Math.abs(angle) >= 360)//might be only greater than
	            return  "YES";
	        else return "NO";
	    }

		public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        /*final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));*/
	        String res;
	        String _commands = "L";
	        /*try {
	            _commands = in.nextLine();
	        } catch (Exception e) {
	            _commands = null;
	        }
	        */
	        res = doesCircleExists(_commands);
	        System.out.println(res);
	        /*bw.write(res);
	        bw.newLine();
	        
	        bw.close();*/
	    }
	}
