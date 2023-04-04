import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
class ClicksChat {
	public static void main(String[] args){
		int a=1;
		Scanner scan = new Scanner(System.in);
		int status=0;
		System.out.println("                              ==================================================================");
		System.out.println("                                                     WelCome To ClicksChat....!!");
		System.out.println("                                                        Easy To Connect " +(char)3);
		System.out.println("                              ==================================================================");
		System.out.println();
		System.out.println();
	
		System.out.println();
		System.out.println();
	
	while(true){
		System.out.println();
		System.out.println("   "+(char)4+"Connect-1       " +(char)5+ "Chat-2       " +(char)6+"Speil-3         "   +(char)6+"Calls-4        "      +(char)6+"Locater-5          " +(char)6+"Settings-6           " +(char)3+"Hmm-7" );
		System.out.println();
		System.out.println("      ----------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Option : ");
		int Choice = scan.nextInt();
		System.out.println();
		
		switch(Choice){
			case 1:
			System.out.println("Welcome To Search");
			System.out.println();
			System.out.println("For Searching (Bluetooh & wifi Must Be On)");
			System.out.println();
			System.out.print(" $ Bluetooth-Disabled : "+"(Press 1 to Enable:) : ");
			int bluetooth=scan.nextInt();
			System.out.println();
			if(bluetooth==1)
			{
				System.out.println(" $ Bluetooth-enebled" +bluetooth);
				System.out.println();
			}
			System.out.println();
			System.out.println(" $ Wifi-Disabled : "+"(Press 1 to Enable:) : ");
			int wifi=scan.nextInt();
			if(wifi==1)
			{
				System.out.println(" $ Wifi-enebled" +wifi);
				System.out.println();
			}
			System.out.print("Searching....Click 1 For Check Available Device :  ");
			String Scan=scan.next();
			System.out.println("");
			System.out.println("Avalable Device is: Varsha....");
			System.out.println("Avalable Device is: Raghu....");
			System.out.println("Avalable Device is: punam....");
			System.out.println("");
			System.out.println("");
			System.out.print("Confirm pair With varsha(click-1) :  ");
			System.out.print("Confirm pair With Raghu(click-2) :  ");
			System.out.print("Confirm pair With Punam(click-3) :  ");
			System.out.println();
			System.out.println();
			System.out.println("Choosepair : ");
			int choosepair=scan.nextInt();
			if(choosepair==1){
			System.out.println("");
			System.out.println(">Varsha Accepted Your Request....");
			System.out.println();
			System.out.println(">You Connected With Varsha...Go to chat Option To Chat with Varsha");
			System.out.println("");
			System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
			System.out.println("");
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println();
			System.out.println("Continue press 1");
			System.out.println("Exit press 0");
			status=scan.nextInt();
			System.out.println();
			System.out.println("      ----------------------------------------------------------------------------------------------------------");
			}
			else if(choosepair==2){
			System.out.println("");
			System.out.println("");
			System.out.println(">Raghu Reject Your Request....");
			System.out.println();
			System.out.println(">Go back for Search Option To Find New Friends");
			System.out.println("");
			System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
			System.out.println("");
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println();
			System.out.println("Continue press 1");
			System.out.println("Exit press 0");
			status=scan.nextInt();
			System.out.println();
			System.out.println("      ----------------------------------------------------------------------------------------------------------");
			}
			else if(choosepair==3){
			System.out.println("");
			System.out.println(">Punam Holded Your Request....");
			System.out.println();
			System.out.println(">Wait For Sometime...");
			System.out.println();
			System.out.println(">Poonam is typing............");
			System.out.println();
			System.out.println(">Poonam is offile mode");
			System.out.println("");
			System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
			System.out.println("");
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println();
			System.out.println("Continue press 1");
			System.out.println("Exit press 0");
			status=scan.nextInt();
			System.out.println();
			System.out.println("      ----------------------------------------------------------------------------------------------------------");
			}
			break;
			case 2:
				System.out.println("					    Welcome To Chat");
				System.out.println();
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				System.out.print("Varsha...");
				System.out.println("Varsha in online");
				System.out.println("For Chat click on name/ (Press 1) To chat with Varsha");//i am using 1 for click on name
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				System.out.print("RamyaSri...");
				System.out.println("RamyaSri in online");
				System.out.println("                                                              --Notification From RamyaSri(1)");
				System.out.println("For Chat click on name/ (Press 2) To chat with RamyaSri");//i am using 1 for click on name
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				System.out.print("choose-name : ");
				int choosename=scan.nextInt();
				if(choosename==1)
					{
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				System.out.println("          Varsha "+(char)3);
				System.out.println("............................");
				System.out.println("");
				System.out.println("you");
				System.out.print("Type Here : ");
				String TypeHere=scan.next();
				System.out.println("");
				System.out.println(" "+"                                       Varsha : Hi bangaram");
				System.out.print("Type Here : ");
				String TypeHere1=scan.next();
				System.out.println("                                        "+"Varsha : ipude class nunchi vachanu..nu m chesthunav bangaram");
				System.out.println("you");
				System.out.print("Type Here : ");
				String TypeHere2=scan.next();
				System.out.println("");
				System.out.println("                                        "+"Varsha : Oh cool.thinava mari?");
				System.out.println("you");
				System.out.print("Type Here : ");
				String TypeHere3=scan.next();
				System.out.println("");
				System.out.println("                                        "+"Varsha :Ha.thinanu");
				System.out.println("you");
				System.out.print("Type Here : ");
				String TypeHere4=scan.next();
				System.out.println("");
				System.out.println("					"+"Varsha : No baby koncham Work undi malli chesthanu m anukoku");
				System.out.println("you");
				System.out.print("Type Here : ");
				String TypeHere5=scan.next();
				System.out.println("");
				System.out.println("                                       "+ "Varsha : Tq baby..bye"+(char)3);
				System.out.println();
				System.out.println("you");
				System.out.println("Type Here : "+(char)3+" "+(char)3+" "+(char)3);
				System.out.println();
				System.out.println("                                   ----------------------------------------------");
				System.out.println("                                           Varsha Taken Screeshot of chat");//Screenshot Recognization
				System.out.println("                                   ----------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                                           " +"Varsha is offline mode");
				System.out.println("========================================================================================================================");
				System.out.println("");
					}
					else if(choosename==2)
					{ 
						System.out.println("											Ramya: Hi Ravan"+(char)3);
						System.out.println();
						System.out.println("you");
						System.out.print("Type Here : ");
						String TypeHere6=scan.next();
						System.out.println("											Ramya: m chesthunav");
						System.out.println();
						System.out.println("you");
						System.out.print("Type Here : ");
						String TypeHere7=scan.next();
						System.out.println("											Ramya: Timepass kavatledu");
						System.out.println();
						System.out.println("you");
						System.out.print("Type Here : ");
						String TypeHere8=scan.next();
						System.out.println("											Ramya: sarele , ayina matho enduku chat chesthav le");
						System.out.println();
						System.out.println("you");
						System.out.print("Type Here : ");
						String TypeHere9=scan.next();
						System.out.println("											Ramya:Chat cheyu pls");
						System.out.println("											Ramya:oiii");
						System.out.println("											Ramya:Reply Ivvu");
						System.out.println();
						System.out.println();
						System.out.println("                                           " + "You Blocked RamyaSri " + " unblock press(3) ");
					}
					else if(choosename==3)
					{
						System.out.println();
						System.out.println("                                                  You Unblocked RamyaSri(press 4 to chat)                                ");
						System.out.println();
					}
						else if(choosename==4)
					{ 
						System.out.println();
						System.out.println("			     You Unblocked RamyaSri, Continue Chat With RamyaSri ");
						System.out.println();
					}
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("To go back- Click on back button");//am using 1 for go back
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				break;
			case 3:
				System.out.println("                                                     " +"Welcome To Speil");
				System.out.println();
				System.out.println("...............................................................");
				System.out.println("$---Leave A Note");
				System.out.println("$---My Speil"+"  Tap to add status");;
				System.out.println("...............................................................");
				System.out.print("Note For 1"+" && "+"	Status For 2" +" :    ");
				int select=scan.nextInt();
				System.out.println("...............................................................");
				
			if(select==1)
				{
					System.out.print("Leave A Note  :  ");
				String note=scan.next();
				System.out.println();
				System.out.println("                                                         "+"----"+note+"----");
				System.out.println();
				System.out.println();
				System.out.println("Posted Time:  "+java.time.Clock.systemUTC().instant());
				System.out.println("...............................................................");
				System.out.println("Your post/note will be Automatically Deleted in After 24hours");
				System.out.println("...............................................................");
				System.out.println("========================================================================================================================");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("To go back- Click on back button");//am using 1 for go back
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
			}
			else{
				System.out.println("Add status");
				String status1=scan.next();
				System.out.println();
				System.out.println("                                                         "+"----"+status1+"----");
				System.out.println();
				System.out.println();
				System.out.println("Posted Time:  "+java.time.Clock.systemUTC().instant());
				System.out.println("...............................................................");
				System.out.println("Your post/note will be Automatically Deleted in After 24hours");
				System.out.println("...............................................................");
			}

				System.out.println("To go back- Click on back button");//am using 1 for go back
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				System.out.println("========================================================================================================================");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("To go back- Click on back button");//am using 1 for go back
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				break;
				case 4:
				System.out.println("                                                     " +"Welcome To Calls");
				System.out.println("                                         Here You Can Make voice call & Video call");
				System.out.println();
				System.out.println("Select Contact Name/Type Contact Name");
				String contactname=scan.next();
				System.out.println();
				System.out.println("Click 1 For Video Call " +" & "+ " Click 2 For Voice Call ");
				int calls=scan.nextInt();
				if(calls==1)
			{
					System.out.println("Ringing");
					System.out.println(".");
					System.out.println("..");
					System.out.println("...");
					System.out.println("....");
					System.out.println("Connected with: " +contactname);
					System.out.println("To end the call press powerButton or 1");
					System.out.println("call is running....");
					int running=scan.nextInt();
					System.out.println("call ended");
					System.out.println("========================================================================================================================");
					System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
					System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
					System.out.println("To go back- Click on back button");//am using 1 for go back
					System.out.println("Continue press 1");
					System.out.println("Exit press 0");
					status=scan.nextInt();
			}
			else
			{
				System.out.println("Ringing");
					System.out.println(".");
					System.out.println("..");
					System.out.println("...");
					System.out.println("....");
					System.out.println("Connected with: " +contactname);
					System.out.println("To end the call press powerButton or 1");
					System.out.println("call is running....");
					int running=scan.nextInt();
					System.out.println("call ended");
					System.out.println("========================================================================================================================");
					System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
					System.out.println("");
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println();
					System.out.println("To go back- Click on back button");//am using 1 for go back
					System.out.println("Continue press 1");
					System.out.println("Exit press 0");
					status=scan.nextInt();
					break;
			}
				case 5:
			{
			System.out.println("Welcome To Locater");
			System.out.println();
			System.out.println("Enter contact name/Number For Traceing");
			String trace=scan.next();
			System.out.print("loading data.......");
			System.out.println("....");
			System.out.println(".......");
			System.out.println("...........");
			System.out.println("location Founded...........");
			System.out.println();
			System.out.print("View location "+" press 1 "+" & " +"press 2 for full details : ");
			int location=scan.nextInt();
			System.out.println();
			if(location==1)
				{
				System.out.println("Kphb phase-1, j-spders new Building,SBH");
				System.out.println();
				System.out.println("Latitude : 17.411");
				System.out.println();
				System.out.println("Longitude : 78.4487");
				System.out.println();
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
			else
				{
				System.out.println("Kphb phase-1, j-spders new Building,SBH");
				System.out.println();
				System.out.println("Latitude : 17.411");
				System.out.println();
				System.out.println("Longitude : 78.4487");
				System.out.println();
				System.out.println("Location Updated : 15Min Ago");
				System.out.println();
				System.out.println("Today Spotted Locations And (Duration)");
				System.out.println();
				System.out.println("Location 1: MetroPiller No:743 KPHB (8.08 min)");
				System.out.println();
				System.out.println("Location 2: Dharmareddy colony,KPHB,Kundabiriyani Restarant (1hour2min39sec)");
				System.out.println();
				System.out.println("Location 3: NexuxMall(sujana mall),KPHB Phase-6, (2hours10min2sec)");
				System.out.println();
				System.out.println("Location 4: Ritz Women Deluxe PG , KPHB, Phase-1, (3min24sec)");
				System.out.println();
				}
			System.out.println();
			System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
			System.out.println("");
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
			System.out.println("                                      -----------------------------------------------     ");
			System.out.println();
			System.out.println("========================================================================================================================");
			System.out.println("");
			System.out.println("Continue press 1");
			System.out.println("Exit press 0");
			status=scan.nextInt();
			break;
			}
			case 6:
			{
			System.out.println("                                              Welcome To Settings");
			System.out.println();
			System.out.println("                                                   Settings");
			System.out.println();
			System.out.println("========================================================================================================================");
			System.out.println();
			System.out.println(" Profile-(1) "+" Account-(2) "+" Chats-(3) "+" Notifications-(4) "+" Storage And Data-(5) "+" App Language-(6) "+" Theme-(7) "+" Help-(8)");
			System.out.println();
			System.out.println("========================================================================================================================");
			System.out.println();
			System.out.print("Choose Option : ");
			int option=scan.nextInt();
			System.out.println();
			if(option==1)
				{
				System.out.println("                                                    Profile");
				System.out.println();
				System.out.println("change Dp(press-1) "+"(Or)" +" Remove Dp(press-2)");
				System.out.println("Change Dp" + " (press 1)");
				String dp=scan.next();
				System.out.println("To Check Dp Was Changed Or Not : " +" press 1");
				String changed=scan.next();
				System.out.println();
				System.out.println("Your Dp Was Changed");
				System.out.println();
				System.out.println("Posted Time:  "+java.time.Clock.systemUTC().instant());
				System.out.println();
				System.out.println("...........................");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
				else if(option==2)
				{
				System.out.println("                                                     Account");
				System.out.println();
				System.out.println("Privacy");
				System.out.println();
				System.out.println("Last Seen And Online : Nobody & Everyone");
				System.out.println();
				System.out.println("Profile Photo : Everyone");
				System.out.println();
				System.out.println("About : Everyone");
				System.out.println();
				System.out.println("Status : 13 Contacts Selected");
				System.out.println();
				System.out.println("Finger-Print : Enabled");
				System.out.println();
				System.out.println("...........................");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
				else if(option==3)
				{
				System.out.println("                                                         Chats");
				System.out.println();
				System.out.println("ChatBackUp-Enebled");
				System.out.println();
				System.out.println("Chat-history : Deleted");
				System.out.println();
				System.out.println("Wallpeper : Default ");
				System.out.println();
				System.out.println("...........................");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
				else if(option==4)
				{
				System.out.println("                                                      Notifications");
				System.out.println();
				System.out.println("RingTone-Enebled");
				System.out.println();
				System.out.println("RingTone Name- Thakita Thakajum Thakita Thakajum Palikenena");
				System.out.println();
				System.out.println("Message tone : Enebled");
				System.out.println();
				System.out.println("Message Tone Name-ClickClick");
				System.out.println();
				System.out.println("Vaibration-On");
				System.out.println();
				System.out.println("Indicater-Blinking-Green");
				System.out.println();
				System.out.println("Notification Glimps-Off");//Nothing mobile lighting
				System.out.println();
				System.out.println("...........................");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
				else if(option==5)
				{
				System.out.println("                                                      Storage And Data");
				System.out.println();
				System.out.println("Manage Storage : 20.0 Mb");
				System.out.println();
				System.out.println("Network Usage : 2.9 GB Sent & 55.9 Gb Received");
				System.out.println();
				System.out.println("Use Less Data For Calls : Disbled");
				System.out.println();
				System.out.println("-----------------------------------------------------");
				System.out.println("                  Media Auto Downloded");
				System.out.println("-----------------------------------------------------");
				System.out.println();
				System.out.println("When using Mobile Data : Photos");
				System.out.println();
				System.out.println("When connctedb on wifi - All Media");
				System.out.println();
				System.out.println("When Roaming : No Media");
				System.out.println();
				System.out.println("Media Upload Quality : High");
				System.out.println();
				System.out.println("...........................");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
				else if(option==6)
				{
				System.out.println("                                                      App Language");
				System.out.println();
				System.out.println(">Choose Language");
				String language=scan.next();
				System.out.println();
				System.out.println(">App language : "+language);
				System.out.println();
				System.out.println(">Language Changed Sucessfully into : " +language);
				System.out.println("...........................");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
				else if(option==7)
				{
				System.out.println("                                                         Theme");
				System.out.println();
				System.out.println("                            (1)For dark-mode " + "(2) For white-mode " +"(3) For System-default ");
				System.out.print(">Choose Theme : ");
				int theme=scan.nextInt();
				System.out.println();
					if(theme==1)
					{
						System.out.println("Dark Mode is enebled");
					}
					else if(theme==2)
					{ 
						System.out.println("White mode is enebled");
					}
					else{
					System.out.println("System Default");
					}
				System.out.println("...........................");
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				}
			else if(option==8)
				{
				System.out.println("                                                     "+"Help");
				System.out.println("Help Centre");
				System.out.println();
				System.out.println("-> 1-Questions "+" -> 2-Need Help "+" ->3 For Updates And Relese Dayes "+" ->4 Any Other");
				System.out.println();
				System.out.print("Enter Option : ");
				int contactus=scan.nextInt();
				System.out.println();
					if(contactus==1)
					{
					System.out.println("Questions?");
					String question=scan.next();
					System.out.println();
					System.out.println("Question is Sended - Wait For Responce");
					}
					else if(contactus==2){
					System.out.println("Need Help");
					String needhelp=scan.next();
					System.out.println();
					System.out.println("Need Help is Requested  - Wait For Responce");
					}
					else if(contactus==3){
						System.out.println();
					System.out.println(".........................");
					System.out.println("Updates And Relese Dates");
					System.out.println(".........................");
					System.out.println();
					System.out.print("Press-1 To Check Software Updates : ");
					int softwareupdates=scan.nextInt();
					System.out.println();
					if(softwareupdates==1)
						{

					System.out.println("Your Version Is Up-to-date");
					System.out.println("............................");
					System.out.println();
					}
					System.out.println();
					System.out.println("***************************************************************************************");
					System.out.println("                                > Web Version Will Be relesed On 2023 1st-Quarterly <");
					System.out.println();
					System.out.println("                                > News Feed Corosel Will Add Soon <");
					System.out.println();
					System.out.println("                                > Customization Will Add Soon <");
					System.out.println();
					System.out.println("***************************************************************************************");
					System.out.println();
					}
					else{
					System.out.println("Any Other");
					String anyother=scan.next();
					System.out.println();
					System.out.println("Wait for movement our customer support will be back");
					}
				}
				System.out.println("..............................................");
				System.out.println();
				System.out.println("Terms And Privacy : " + "Encrypted");
				System.out.println();
				System.out.println("App Info : Clickschat/B-chat - version 2.1.1.21.83");
				System.out.println();
				System.out.println("..............................................");
				System.out.println();
				System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
				System.out.println("");
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
				System.out.println("                                      -----------------------------------------------     ");
				System.out.println();
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("========================================================================================================================");
				System.out.println("");
				System.out.println("Continue press 1");
				System.out.println("Exit press 0");
				status=scan.nextInt();
				break;
			}
				case 7:
					{
					System.out.println("Message Disapearing-(1) "+" Dp History-(2) "+" Screenshots-(3) " +"Payments $-(4)");
					System.out.println();
					System.out.print("Enter Option : ");
					int enterHmmOption=scan.nextInt();
					System.out.println();
						if(enterHmmOption==1)
						{
							System.out.println("Message Disappearing - Off");
							System.out.println("Press 1 For On");
							int messagedisappearing=scan.nextInt();
							System.out.println();
							System.out.println( "Message Disappearing - On");
					}
					else if(enterHmmOption==2){
					System.out.println("Dp Posted Time:  "+java.time.Clock.systemUTC().instant());
					}
					else if(enterHmmOption==3){
					System.out.println("Screenshots-Off");
					System.out.println();
					System.out.println("To Start ScreenShot press-1");
					int tostartscreenShot=scan.nextInt();
					System.out.println("");
					System.out.println("Screenshots-On");
					System.out.println();
					System.out.println("->To check Who Take ScreenShots Press-2 ");
					int whoTakescreenShots=scan.nextInt();
					System.out.println();
						if(whoTakescreenShots==2)
						{
					System.out.print("ScreenShots Supported For : ");
					System.out.println("Selected Contacts Only");
					System.out.println();
					System.out.print("->Do you want to change ScreenShots Support:");
					System.out.println();
					System.out.println("->Press-3 For Selected Contacts");
					System.out.println("->Press-4 For My Contacts Only"); 
					System.out.println("->Press-5 For Saved Numbers");
					System.out.println();
					}
					System.out.print("Enter The Option Number : ");
					int number=scan.nextInt();
					System.out.println();
					if(number==3){
					System.out.println("Changed To :Selected Contacts ");
					System.out.println();
					System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
					System.out.println("");
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println();
					System.out.println("========================================================================================================================");
					System.out.println("");
					System.out.println("========================================================================================================================");
					System.out.println("");
					System.out.println("Continue press 1");
					System.out.println("Exit press 0");
					status=scan.nextInt();
						}
					else if(number==4){
					System.out.println("Changed To :My Contacts Only ");
					System.out.println();
					System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
					System.out.println("");
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println();
					System.out.println("========================================================================================================================");
					System.out.println("");
					System.out.println("========================================================================================================================");
					System.out.println("");
					System.out.println("Continue press 1");
					System.out.println("Exit press 0");
					status=scan.nextInt();}
					else if(number==5){
					System.out.println("Changed To :Saved Numbers Only");
					System.out.println();
					System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
					System.out.println("");
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
					System.out.println("                                      -----------------------------------------------     ");
					System.out.println();
					System.out.println("========================================================================================================================");
					System.out.println("");
					System.out.println("========================================================================================================================");
					System.out.println("");
					System.out.println("Continue press 1");
					System.out.println("Exit press 0");
					status=scan.nextInt();
					}
					}
					if(enterHmmOption==4)
						{
							System.out.println("                                                   Welcome To Payments                         ");
							System.out.println();
							System.out.println("Transfer Money Press-1 " + " & "    +" Balance Enquiry press-2 ");
							System.out.println();
							System.out.print("Enter Option : ");
							int payments=scan.nextInt();
							System.out.println();
							if(payments==1)
							{
							System.out.println("                                     Enter phone Screen lock pattern, PIN , password or Fingerprint");
							System.out.println("                                                             Unlock Payments");
							int screenlockpassword=scan.nextInt();
							System.out.println();
							System.out.println("Password Is Correct " + " & "+" Once Again Welcome To Payments ");
							System.out.println();
							System.out.print("Enter Mobile number/ Bank Account Number : ");
							String mobilenum=scan.next();
							System.out.println();
							System.out.println("Loading.........");
							System.out.println("........................");
							System.out.println("..................");
							System.out.println("..............");
							System.out.println("......");
							System.out.println();
							System.out.print("Enter Amount : ");
							int amount=scan.nextInt();
							System.out.println();
							System.out.println("You Entered Amount is : " +amount+ " Rs");
							System.out.println();
							System.out.print("Enter Your UPI Id : ");
							String UpiId1=scan.next();
							System.out.println();
							System.out.println("Loading.........");
							System.out.println("........................");
							System.out.println("..................");
							System.out.println("..............");
							System.out.println("......");
							System.out.println();
							System.out.println("Amount Successfully Transferred to : "+mobilenum);
							System.out.println();
							System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
							System.out.println("");
							System.out.println("                                      -----------------------------------------------     ");
							System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
							System.out.println("                                      -----------------------------------------------     ");
							System.out.println();
							System.out.println("========================================================================================================================");
							System.out.println("");
							System.out.println("========================================================================================================================");
							System.out.println("");
							System.out.println("Continue press 1");
							System.out.println("Exit press 0");
							status=scan.nextInt();
							}
								else if(payments==2){
								System.out.println("Welcome to Balance Enquiry");
								System.out.println();
								System.out.print("Enter Your UPI Id : ");
								String upiid=scan.next();
								System.out.println("You Blance Amount Is : 1,00,000.18 ");
								System.out.println();
								System.out.println("ThankYou For Chooseing ClicksChat"+(char)3);
								System.out.println("");
								System.out.println("                                      -----------------------------------------------     ");
								System.out.println("                                         Designed By- Sainath Alampally"+(char)3);
								System.out.println("                                      -----------------------------------------------     ");
								System.out.println();
								System.out.println("========================================================================================================================");
								System.out.println("");
								System.out.println("========================================================================================================================");
								System.out.println("");
								System.out.println("Continue press 1");
								System.out.println("Exit press 0");
								status=scan.nextInt();
							}
							
					break;
						}
						}
				default:System.out.println("Something Went Wrong / Select Proper Option");
			}
			while(status==0);
	}
	}
}
	