package ExtraCredit;

import java.util.Stack;

public class ExtraCredit {
	public static String reverse(String s) {
		Stack<String> temp= new Stack<String>();
		int start=0,end=0;
		while(end<s.length()&&start<s.length()){
			if(s.charAt(start)!=' '&&s.charAt(end)!=' '){
				if(end+1==s.length()){
					temp.push(s.substring(start,end+1));
					start=++end;
				}
				else if(s.charAt(end+1)==' '){
					temp.push(s.substring(start,end+1));
					start=++end;
				}else{
					end++;
				}
			}
			else{
				start++;
				end++;
			}			
		}		
		String result="";
		if(!temp.isEmpty()){
			result=temp.pop();
			while(!temp.isEmpty()){
				result=result+" "+temp.pop();
			}
			return result;
		}else{
			return "";
		}			     
	}
	public static void main(String[] args) {
		String str=" The sky  is      blue ";
		System.out.println('"'+reverse(str)+'"');
	}
}
