import java.util.ArrayList;
class DrinksMenu{
	

  public static void main(String[] args){

      TextUI ui = new TextUI();

     
     // String age = Integer.parseInt(ui.getNumericInput("Hvor gammel er du?"));
     
      int age = ui.getNumericInput("Hvor gammel er du?");
     
      System.out.println(age);


      ArrayList<String> options = new ArrayList<String>();
      ArrayList<String> choices = new ArrayList<String>();

      if(age >= 18){
        options.add("Gin&Tonic");
  		options.add("Martini");
  		options.add("Gin&Hass");
  		
      }else{
         options.add("Milk");
         options.add("Juice");
         options.add("Saftevand");
         	
      }
      	options.add("vand");
      

      //get number of times the while loop should run
      int numberOfDrinks = ui.getNumericInput("Hvor mange drinks vil du bestille?");

        while(choices.size() < numberOfDrinks){ 
       		String choice = ui.getChoice(options, "Vælg en drink fra listen: ");
       		choices.add(choice);
   		}

   	  ui.displayList(choices, "Du har bestilt flg.: ");

  }

  

}