package org.apex.assignment;

public class StringCheck {
	
	public boolean isInteger(String str) 
	{
		boolean result = false;
		
		try 
		{
			Integer.parseInt(str);
			result = true;
		}catch(Exception exc) {}
		return result;
	}
	
	public boolean isOddNumber(String str) 
	{
		boolean result;
		
		if(isInteger(str)) {
			int n = Integer.parseInt(str);
			if(n%2 == 0) result = false;
			else result = true;
		}else {			
			result = false;		
		}
		
		return result;
	}
	
	public boolean isEvenNumber(String str) 
	{
		boolean result;
		
		if(isInteger(str)) {
			int n = Integer.parseInt(str);
			if(n%2 != 0) result = false;
			else result = true;
		}else {			
			result = false;		
		}
		
		return result;
	}
	
	public boolean isPrimeNumber(String str) 
	{
		boolean result = true;
		
		if(isInteger(str)) {
			int n = Integer.parseInt(str);
			
			for(int i=2; i < n; i++) {
				if(n%i == 0)
					result = false;
					break;
			}


		}else {			
			result = false;		
		}
		
		return result;
	}
	
}
