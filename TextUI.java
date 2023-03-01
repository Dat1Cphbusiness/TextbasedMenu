import java.util.Scanner;
//import java.util.regex.Pattern;
import java.util.ArrayList;

class TextUI{
	private Scanner scan = new Scanner(System.in);
   // private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");


    public String getInput(String msg){
    
    	System.out.println(msg);

        String input = scan.nextLine();

        /* 
		  
		No longer needed after adding a special method for getting numeric input
        

        if(numeric && !isNumeric(input)){
                //rekursivt kald
				input = getInput(msg);
         }
         
         */

        return input; 
   }

      public int getNumericInput(String msg){
    
    	System.out.println(msg);


		// todo: add try catch to handle InputMismatchException
        int input = scan.nextInt();

         // flush prompt after nextInt (scanner bug)
         scan.nextLine();
         return input; 
  
   }
    
    public String getChoice(ArrayList<String> options, String msg){

         this.displayList(options, msg);
        // lader brugeren vælge 1 element
       
        String input = this.getInput("");
         // check om det valgte findes i listen
		if(!options.contains(input)){

			System.out.println(" ***   invalid input, try again   ***");
			input = getChoice(options, msg);

		}
        //returnerer brugers valg
		return input;

    }

    public void displayList(ArrayList<String> list, String msg){

    	System.out.println(msg);
  		for(String s: list){
  			System.out.println(s);
  		}
    }



   /*
	public boolean isNumeric(String strNum) {
   		 if (strNum == null) {
      		  return false; 
    	}
    return pattern.matcher(strNum).matches();
	}
*/



}