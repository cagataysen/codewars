package XO;

public class XO {
	public static boolean getXO (String str) {
	    
	    String newStr = str.toLowerCase();
	    int countX = 0;
	    int countO = 0;
	    
	    for(int i = 0; i < newStr.length(); i++){
	      if(newStr.charAt(i) == 'x'){
	        countX++;
	      }
	      else if(newStr.charAt(i) == 'o'){
	        countO++;
	      }
	    }
	    if(countX == countO){
	      return true;
	    }
	    else{
	      return false;
	    }
	    
	  }
}

