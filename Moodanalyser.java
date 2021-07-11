import java.util.Scanner;

public class Moodanalyser {

private String message;
   //constructor
  Moodanalyser()
  
  {
  System.out.println("Please Enter your mood: ");
  Scanner sc = new Scanner(System.in);
  String in = sc.nextLine();
  if(in.isEmpty()) this.message=null;
  else this.message=in;
  
   }
   Moodanalyser(String message){
  this.message=message;
}

   //exception handling
  public String analyseMood() {
   String message=this.message;
  try {
	  
   boolean checkMood = message.toLowerCase().indexOf("sad") !=-1? true: false;
   if(checkMood) return "SAD";
   
     }
  catch(NullPointerException e)
  {
	  
  System.out.print("NullPointerException Caught\n");
  return "HAPPY";
  
  }
  return "HAPPY";
  }

public static void main(String[] args) {
Moodanalyser analyse = new Moodanalyser();
System.out.println("Analysed Mood: "+analyse.analyseMood());

}
}
