/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */
// YOUR CODE GOES HERE 

public class ASCIIArt{
	
	public static void main(String[] args) {
		/*
		 * Function calls
		 */
		printBorder();
		printBorder(); 
		printASCII();
		printMessage1();	
		printMessage2();
		printMessage1();
		printMessage3();
		System.out.println("\n\n");
		printBorder();
		printBorder();
	}
	
	/*
	 * Static Methods
	 */
	public static void printASCII() {
		/*
		 * Main Part
		 */
		System.out.println("                                     /");
		System.out.println("                                    /*|");
		System.out.println("			           /***)");
		System.out.println("		                   /***)");
		System.out.println("			          /***/");
		System.out.println("	                         /***/");
		System.out.println("                               /***/          //  ");
		System.out.println("                             /###/ 	    /*/");
		System.out.println("                           /###/         /**/ ");
		System.out.println("                          /##/	         /*/	                                          ________________________");
		System.out.println("                        /##/	       /**)                                              |########################|                   //\\\\                         |#                        #|                         //\\\\             ");
		System.out.println("                      (###/	      (**|                                                \\######################/                   /#  #\\                        |#                        #|                        /#  #\\");
		System.out.println("                     (###/	       (**\\                                                         |##|			    /# 	  #\\			   |#    		     #|	   		      /#    #\\ ");
		System.out.println("                       \\##\\		 \\***\\	                                                    |##|                           /#      #\\                      |#                        #|                      /#      #\\");
		System.out.println("                         \\#\\   	         \\****\\                                                     |##|                          /#        #\\                     |#                        #|                     /#        #\\");
		System.out.println("                           \\#\\	           \\***)                                                    |##|                         /#          #\\                    |#                        #|                    /#          #\\");
		System.out.println("                             \\#\\	    \\**/		                                    |##|                        /#            #\\                   |#                        #|                   /#            #\\");
		System.out.println("                               \\#\\	    (*/                                                     |##|                       /#              #\\                   \\#                      #/                   /#              #\\");
		System.out.println("                                 \\ 	   /*)           __                                         |##|                      /#                #\\                   \\#                    #/                   /#                #|");
		System.out.println("      		 /	 	  \"                      \\@)                                        |##|                     |#                  #|                   \\#                  #/                   |#                 #|");
		System.out.println("	       /&/                                         \\@@)                                     |##|                     |#                  #|                    \\#                #/                    |#                 #|");
		System.out.println("	      /&&\\ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _             \\@@)                                   |##|                     |#                  #|                     \\#              #/                     |#                 #|");
		System.out.println(" 	      \\&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&-            |@@)                                  |##|                     |####################|                      \\#            #/                      |###################|");
		System.out.println("                                                              /@@)                                  |##|                     |#                  #|                       \\#          #/                       |#                 #|");
		System.out.println("                     /                                       /@@/                     ##            |##|                     |#                  #|                        \\#	     #/                        |#                 #|");
		System.out.println("		    /&\\_ _ _ _ _ _ _ _ _ _ _ _ _ _         /@@)                      |##|           |##|                     |#                  #|                         \\#      #/                         |#                 #|");
		System.out.println("		    \\&&&&&&&&&&&&&&&&&&&&&&&&&&&/	/@@)                         |##|           |##|                     |#                  #|                          \\#    #/                          |#                 #|");
		System.out.println("                                                                                     |#################|                     |#                  #|                            \\##/                            |#                 #|");
		System.out.println("		       <&&&&&&&&&&&&&&&&&&&&&&&>                                      \\###############/                      |#                  #|                             \\/                             |#                 #| ");
		System.out.println("		        (&&&&&&&&&&&&&&&&&&&&&)");
		System.out.println("	/``\\	          \\***************/");
		System.out.println("       /****/");
		System.out.println("      (***/ 					      ____");
		System.out.println("      (****\\_                 __________/------------/***/ ");
		System.out.println("       \\******-----------*******************************/");
		System.out.println("	\\###################/		");
		System.out.println("					/&#####################)");
		System.out.println("			($$$$$$$$$$$$$$$$$&/");
		
	}
	
	public static void printMessage1() {
		/*
		 * Print caption
		 */
		System.out.println("\n\n\nWHEN \"JAVA\" ENCOUNTERS ASCII ART....................");	
	}
	
	public static void printMessage2() {
		/*
		 * Print message 2
		 */
		System.out.println("Everything seems good........................................");	
	}
	
	public static void printMessage3() {
		/*
		 * Print message 3
		 */
		System.out.println("How can I make this better?");	
	}
	
	public static void printBorder() {
		/*
		 * Print border
		 */
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
