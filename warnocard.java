	//imports
	import javax.swing.JOptionPane;
	import java.util.*;
	public class warnocard {

	    public static void intro() {

	        // Vars
	        String username;
	        String title;
	       do{  title = JOptionPane.showInputDialog("In this day and age I am not able to tell if you are a King or a Queen..... \n so? answer me:");
			 }
			 while((!title.equals("king")) && (!title.equals("queen")));
				 
				 
			 
				 
				 
				  
				 
			 title = title.substring(0, 1).toUpperCase() + title.substring(1);;
			 title = title + " ";
			
	        // user inputs their name
	        username = JOptionPane.showInputDialog("My " + title + " I am sorry but I...I forgot what your name is\n could you tell me again?");
	     
	        // makes first char uppercase found here:https://stackoverflow.com/questions/3904579/how-to-capitalize-the-first-letter-of-a-string-in-java
	        username = username.substring(0, 1).toUpperCase() + username.substring(1);;
	        //Tells the user the rules
	        JOptionPane.showMessageDialog(null, " Welcome " + title + username + " I am Patsy your fathful servent!\n We shall be going to WAR!!! \n You and the mighty computer shall send out your troops and they shall fight I shall be watching the battle for you and shall report back at the end of the battle. \n how many troops you sent how many the computer sent and who won the battle! \n if you both send out the same number of troops then  I shall call for renforcements and so shall our foe!);
	        //turns username var to name var for easier typeing of code pointless to have
	        String name = username;

	        // Goes to the game and brings the username with it
	        game(name,title);
	    }

	    public static void game(String name,String title) {
			//random number maker
Random num = new Random();
	        // Vars
	        int hand = Integer.parseInt(JOptionPane.showInputDialog( title + name + " How many days shall this battle take place?", "5"));
	        int usrpoints = 0;
	        int compoints = 0;

	        // runs the game as long as hand which is user chosen is greater than i every time it is ran it adds 1 to i
	        for (int i = 0; i < hand; i++) {

	            // sets  comnum as a random number 1 - 10

	            int comnum = num.nextInt(10)+1;

	            // makes a var called win and sets it to nix as a placeholder value
	            String win = "nix";

	            // sets the vars for the "battle" and adds the 3 "battle" numbers together for the battle total one of the 3 for both the user and the com is able to be a high number so that it is a mega number
	            int user1 = num.nextInt(10)+1;
	            int user2 = num.nextInt(10)+1;
	            int user3 = num.nextInt(900)+1;
	            int battletotaluser = user1 + user2 + user3;

	            int com1 = num.nextInt(10)+1;
	            int com2 = num.nextInt(900)+1;
	            int com3 = num.nextInt(10)+1;
	            int battletotalcom = com1 + com2 + com3;

	            //makes a var called battlewin and sets it to nix as a placeholdervale
	            String battlewin = "nix";
					int usernum = Integer.parseInt(JOptionPane.showInputDialog("How many troops shall I send out my " + title+ "?"));
					if (usernum >=11){
						JOptionPane.showMessageDialog(null, "We only have enough troops to send out 10 at a time");
						 usernum = Integer.parseInt(JOptionPane.showInputDialog("How many troops shall I send out my " + title +"?"));} 
						else if (usernum<=0){
							JOptionPane.showMessageDialog(null, "We must send out at least one troop otherwise we will be over ran!!!!"); 
							usernum = Integer.parseInt(JOptionPane.showInputDialog("How many troops shall I send out my " + title +"?"));}
	            // checks to see if the var usernum is greater than comnum and if it is it sets the var win to the string "You" and adds a point to the  users point (var usrpoints) and displays a message saying what number/card was drew by both the user and the computer and the winner and also the total number of points of both the user and the computer
	            if (usernum > comnum) {
	                win = "You";
	                usrpoints = usrpoints + 1;
	                JOptionPane.showMessageDialog(null, "You drew " + usernum + "\n The computer drew " + comnum + "\n the winner is " + win + "\n You have " + usrpoints + " Points \n" + " The computer has " + compoints + " Points");
	            }
	            // checks to see if the var usernum is less than comnum and if it is it sets the var win to the string "Computer" and adds a point to the  computers point (var usrpoints) and displays a message saying what number/card was drew by both the user and the computer and the winner and also the total number of points of both the user and the computer only runs if the first check of usernum > comnum declares as false
	            else if (usernum < comnum) {
	                win = "Computer";
	                compoints = compoints + 1;
	                JOptionPane.showMessageDialog(null, "You sent out  " + usernum + " troops \n The computer sent " + comnum + " toops\n the winner is " + win + "\n You have " + usrpoints + " wins \n" + " The computer has " + compoints + " wins");
	            } else if (usernum == comnum) {

	                if (battletotaluser > battletotalcom) {

	                    battlewin = "You";
	                    usrpoints = usrpoints + 3;
	                    JOptionPane.showMessageDialog(null, "You had sent out " + usernum + " troops The computer sent out  " + comnum + " troops \n I had called more troops to come to our aid ! /n the computer had called for " + battletotalcom + "toops \n I called for .... " + battletotaluser + " troops You won the battle!" + "\n You have " + usrpoints + " wins \n" + " The computer has " + compoints + " wins");
	                } else if (battletotaluser<battletotalcom){
	                    battlewin = "Computer";
	                    compoints = compoints + 3;
	                    JOptionPane.showMessageDialog(null, "You had sent out " + usernum + " troops The computer sent out  " + comnum + " troops \n I had called more troops to come to our aid ! /n the computer had called for " + battletotalcom + "toops \n I called for .... " + battletotaluser + " You have lost the battle!" + "\n You have " + usrpoints + " w \n" + " The computer has " + compoints + " wins");
	                }
	            }
	        }
	        
	        if (usrpoints > compoints) {
	            JOptionPane.showMessageDialog(null, "My Leige we have won the war!!");
	            playmorewin(name,title);

	        } else if (usrpoints < compoints){
	            JOptionPane.showMessageDialog(null, "My Leige we have lost the war we must flee \n they have killed all our troops we are the only ones left ");
	            playmorelost(name,title);
	        } else{
				JOptionPane.showMessageDialog(null,title + name + " We are at a standstill neither side as gained any ground! \n We must retreat at wait a week to fight agin!");
				JOptionPane.showMessageDialog(null,"(ONE WEEK LATER!!!!!!!!");
				game(name,title);
	    }}



	    public static void playmorewin(String name,String title) {
	        name = name;
	        String play = "nix";
	        play = JOptionPane.showInputDialog(title + name + " do you want to go back to war once more , I can ready the troops on your command! (Yes or no)");
	        if (play.equalsIgnoreCase("yes")) {
	            game(name,title);
	        } else if (play.equalsIgnoreCase("no")) {
	            JOptionPane.showMessageDialog(null, "We shall rest up then and wait for your command it has been an honor to serve under you my Lord!");
	            System.exit(0);
	        } else {
	            System.exit(0);
	        }
	    }

	    public static void playmorelost(String name,String title) {
	        name = name;
	        title = title;
	        String play = "nix";
	        play = JOptionPane.showInputDialog(title + name + " do you want to go back to war once more, I can find some common folk to join us! (Yes or no)");
	        if (play.equalsIgnoreCase("yes")|| play.equalsIgnoreCase("y")) {
	            game(name,title);
	        } else if (play.equalsIgnoreCase("no") || play.equalsIgnoreCase("n")) {
	            JOptionPane.showMessageDialog(null, "We shall go to in camealot then!");
	            System.exit(0);
	        }
	    }

	 
	    public static void main(String[] args) {
	        intro();
	    }
	}
