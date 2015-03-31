	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Powerof2 {
		static int[] countTwos(int[] arr) {
			/*if (val == 0){
			resArr[i]=0;
			continue;
		}
		int temp=0;
		while (arr[i] != 1)
		{
			temp=arr[i]%2;
			if (val%2 != 0)
			  resArr[i]=0;
			  val = val/2;
		} 
		resArr[i]= 1;
		*/
			int len = arr.length;
			int resArr[] = new int[len];
			for (int i=0; i<len; i++){			
				int val=arr[i];
				double temp = (Math.log(val)/Math.log(2));
				if(Math.round(temp)==temp)
					resArr[i]=1;
				else		
					resArr[i]=0;
			} 
			return resArr;
		}		
		
		public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int[] res;
	        
	        int _arr_size = Integer.parseInt(in.nextLine());
	        int[] _arr = new int[_arr_size];
	        int _arr_item;
	        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	            _arr_item = Integer.parseInt(in.nextLine());
	            _arr[_arr_i] = _arr_item;
	        }

	        in.close();
	        res = countTwos(_arr);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            System.out.println(String.valueOf(res[res_i]));
	        }
	    }
	}
