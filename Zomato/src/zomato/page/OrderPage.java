package zomato.page;

import java.util.Scanner;

public class OrderPage implements Page
{ 
	Scanner sc=new Scanner(System.in);
	String Veg;
	String NonVeg;

	@Override
	public void order() 
	{
		System.out.println("******************");
		System.out.println("Welcome to orders");
		System.out.println("*******************");
		System.out.println("1.Veg");
		System.out.println("2.Non-Veg");
		
		int option=sc.nextInt();
		
		switch(option)
		{
		  case 1:
		  {
				System.out.println("******************");
		     	System.out.println("Avaliable Veg Hotels");
				System.out.println("1.Saravana Bhavan");
				System.out.println("2,Anandh Bhavan");
				System.out.println("3.Jalapann veg Resturant");
				System.out.println("4.Ps4 Resturunt");
				int menu=sc.nextInt();
			
				switch(menu)
				{
					case 1:
					{
					  System.out.println("Menu in Saravan Bhavan");
					  System.out.println("1.Idily");
					  System.out.println("2.Pongal");
					  System.out.println("3.Poori");
					  System.out.println("4.Dosa");
					  int items=sc.nextInt();
					  switch(items)
					  	{
					  		case 1:
					  		{
						      int cost=30;
						      System.out.println("1 plate Idily Cost is:"+ cost);
						      System.out.println("Enter how many plates");
						      int plates=sc.nextInt();
						      double total =cost*plates;
						      System.out.println("the total of" + plates +" plates idily is:" +total);
						      break;
					  		}
					  		case 2:
					  		{
							  int cost=40;
						      System.out.println("1 plate pongal cost is:"+ cost);
						      System.out.println("Enter how many plates");
						      int plates=sc.nextInt();
						      double total =cost*plates;
						      System.out.println("the total of" + plates +" plates pongal is:" +total);
						      break;
					  		}
						  	case 3:
						  	{
							  int cost=35;
						      System.out.println("1 plate poori cost is:"+ cost);
						      System.out.println("Enter how many plates");
						      int plates=sc.nextInt();
						      double total =cost*plates;
						      System.out.println("the total of" + plates +" plates poori is:" +total);
						      break;
						  	}
						  	case 4:
						  	{
							  int cost=50;
						      System.out.println("1 plate dosa cost is:"+ cost);
						      System.out.println("Enter how many plates");
						      int plates=sc.nextInt();
						      double total =cost*plates;
						      System.out.println("the total of" + plates +" plates dosa is:" +total);
						      break;
						  	}
					  	}
					}
					break;
					case 2:
					{
						System.out.println("menu in Anandh Bhavan");
						System.out.println("1.Ghee dosa");
						System.out.println("2.masal dosa");
						System.out.println("3.poori");
						System.out.println("4.sambar idly");
						int items=sc.nextInt();
				  
						switch(items)
						{
							case 1:
							{
						      int cost=50;
						      System.out.println("1 plate Ghee dosa cost is:"+ cost);
						      System.out.println("Enter how many plates");
						      int plates=sc.nextInt();
						      double total =cost*plates;
						      System.out.println("the total of" + plates +" Ghee dosa is:" +total);
						      break;
							}
							case 2:
							{
							  int cost=40;
							  System.out.println("1 plate masal dosa cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates masal dosa is:" +total);
							  break;
							}
							case 3:
							{
							  int cost=35;
							  System.out.println("1 plate poori cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates poori is:" +total);
							  break;
							}
							case 4:
							{
							  int cost=50;
							  System.out.println("1 plate sambar idly cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates sambar idly is:" +total);
							  break;
							}
						}
					}
					break;
					case 3:
					{
						System.out.println("menu in Jalapann veg Resturant");
						System.out.println("1.Rotti");
						System.out.println("2.Dhall");
						System.out.println("3.Palaka pannier");
						System.out.println("4.Channamasala");
						int items=sc.nextInt();
						  
						switch(items)
						{
							case 1:
						  	{
						      int cost=70;
						      System.out.println("1 plate Rotti cost is:"+ cost);
						      System.out.println("Enter how many plates");
						      int plates=sc.nextInt();
						      double total =cost*plates;
						      System.out.println("the total of" + plates +" Rotti is:" +total);
						      break;
						  	}
						  	case 2:
						  	{
						  	  int cost=120;
						  	  System.out.println("1 plate Dhall cost is:"+ cost);
						  	  System.out.println("Enter how many plates");
						  	  int plates=sc.nextInt();
						  	  double total =cost*plates;
						  	  System.out.println("the total of" + plates +" plates Dhall is:" +total);
						  	  break;
						  	}
						  	case 3:
							{
							  int cost=150;
							  System.out.println("1 plate Palaka pannier cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates Palaka pannier is:" +total);
							  break;
							}
						  	case 4:
						  	{
							  int cost=140;
							  System.out.println("1 plate Channamasala cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates Channamasala is:" +total);
							  break;
						  	}
						}
					}
					break;
					case 4:
					{
						System.out.println("menu in Ps4 Resturunt");
						System.out.println("1. idily");
						System.out.println("2.pongal");
						System.out.println("3.porri");
						System.out.println("4.Dosa");
						int items=sc.nextInt();
				  
						switch(items)
						{
							case 1:
							{
							  int cost=70;
							  System.out.println("1 plate idily cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +"idily is:" +total);
							  break;
							}	
							case 2:
							{
							  int cost=50;
							  System.out.println("1 plate pongal cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates pongal is:" +total);
							  break;
							}
							case 3:
							{
							  int cost=40;
							  System.out.println("1 plate porri cost is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates porri is:" +total);
							  break;
							}
							case 4:
							{
							  int cost=40;
							  System.out.println("1 plate Dosa is:"+ cost);
							  System.out.println("Enter how many plates");
							  int plates=sc.nextInt();
							  double total =cost*plates;
							  System.out.println("the total of" + plates +" plates Dosa is:" +total);
							  break;
							}
						}
					}

				
			
				}
		  }
		  break;
		  case 2:
		  {
			System.out.println("************************");
			System.out.println("Avaliable nonveg hotels  ");
			System.out.println("1.Chilles Resturant");
			System.out.println("2.spicy paradies");
			System.out.println("3.Barbeque Nation");
			System.out.println("4.Andhra spicy");
			int menu1=sc.nextInt();
			
			switch(menu1)
			{
				case 1:
				{
					System.out.println("menu in Chilles Resturant");
					System.out.println("1.chicken dum biriyani");
					System.out.println("2.mutton biriyani");
					System.out.println("3.chilli chicken");
					System.out.println("4.fish biriyani");
					int items=sc.nextInt();
			  
					switch(items)
					{
						case 1:  
						{
							int cost=250;
							System.out.println("1 plate chicken dum biriyani cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +" plates chicken dum biriyani is:" +total);
							break;
						}
						case 2:
						{
							int cost=500;
							System.out.println("1 plate mutton biriyani cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +" plates mutton biriyani is:" +total);
							break;
						}
						case 3:
						{
							int cost=200;
							System.out.println("1 plate chilli chicken cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +" plates  chilli chicken is:"+total);
							break;
						}
						case 4:
						{
							int cost=300;
							System.out.println("1 plate fish biriyani cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +" plates fish biriyani is:" +total);
							break;
						}	
					}
				}
				break;
				case 2:
				{
					System.out.println("menu in spicy paradies");
					System.out.println("1.chicken spicy biriyani");
				  	System.out.println("2.egg biriyani");
				  	System.out.println("3.mutton spicy biriyani");
				  	System.out.println("4.special cicken biriyani family pack");
				  	int items=sc.nextInt();
				  
				  	switch(items)
				  	{
				  	case 1:
				  	{
				  		int cost=300;
				  		System.out.println("1 platechicken spicy biriyani cost is:"+ cost);
				  		System.out.println("Enter how many plates");
				  		int plates=sc.nextInt();
				  		double total =cost*plates;
				  		System.out.println("the total of" + plates +" chicken spicy biriyani is:" +total);
				  		break;
				  	}
				  	case 2:
				  	{
				  		int cost=250;
				  		System.out.println("1 plate egg biriyani cost is:"+ cost);
				  		System.out.println("Enter how many plates");
				  		int plates=sc.nextInt();
				  		double total =cost*plates;
				  		System.out.println("the total of" + plates +" plates egg biriyani is:" +total);
				  		break;
				  	}
				  	case 3:
				  	{
				  		int cost=520;
				  		System.out.println("1 plate mutton spicy biriyani cost is:"+ cost);
				  		System.out.println("Enter how many plates");
				  		int plates=sc.nextInt();
				  		double total =cost*plates;
				  		System.out.println("the total of" + plates +" plates mutton spicy biriyani is:" +total);
				  		break;
				  	}
				  	case 4:
				  	{
				  		int cost=450;
				  		System.out.println("1 plate special cicken biriyani family pack cost is:"+ cost);
				  		System.out.println("Enter how many plates");
				  		int plates=sc.nextInt();
				  		double total =cost*plates;
				  		System.out.println("the total of" + plates +" plates special cicken biriyani family pack idly is:" +total);
				  		break;
				  	}
				  }
				}
				break;
				case 3:
				{
					System.out.println("menu in Barbeque Nation Resturant");
					System.out.println("1.france biriyani");
					System.out.println("2.kashimir chicken curry");
					System.out.println("3.peri peri chicken");
					System.out.println("4.butter chicken");
					int items=sc.nextInt();
				  
					switch(items)
					{
				  		case 1:
				  		{
					  		int cost=300;
					  		System.out.println("1 plate france biriyani cost is:"+ cost);
					  		System.out.println("Enter how many plates");
					  		int plates=sc.nextInt();
					  		double total =cost*plates;
					  		System.out.println("the total of" + plates +" france biriyani is:" +total);
					  		break;
				  		}	
						case 2:
						{
							int cost=240;
							System.out.println("1 plate kashimir chicken curry cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +" plates kashimir chicken curry is:" +total);
							break;
						}
						case 3:
						{
							int cost=180;
							System.out.println("1 plate peri peri chicken cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +" plates peri peri chicken is:" +total);
							break;
						}
						case 4:
						{
							int cost=220;
							System.out.println("1 plate butter chicken cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +" plates butter chicken is:" +total);
							break;
						}
					}
					
				}
				break;
				case 4:
				{
					System.out.println("menu in Andhra spicy Resturunt");
					System.out.println("1. Rayalaseema mutton curry");
					System.out.println("2.tandoori chicken");
					System.out.println("3.porri");
					System.out.println("4.Dosa");
					int items=sc.nextInt();
				  
					switch(items)
					{
						case 1:
					  
						{
							int cost=70;
							System.out.println("1 plate idily cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
							System.out.println("the total of" + plates +"idily is:" +total);
							break;
						}	
						case 2:
						{
							int cost=50;
							System.out.println("1 plate pongal cost is:"+ cost);
							System.out.println("Enter how many plates");
							int plates=sc.nextInt();
							double total =cost*plates;
					      	System.out.println("the total of" + plates +" plates pongal is:" +total);
					      	break;
						}
						case 3:
						{
							 int cost=40;
						     System.out.println("1 plate porri cost is:"+ cost);
						     System.out.println("Enter how many plates");
						     int plates=sc.nextInt();
						     double total =cost*plates;
						     System.out.println("the total of" + plates +" plates porri is:" +total);
						     break;
						}
						case 4:
						{
							 int cost=40;
							 System.out.println("1 plate Dosa is:"+ cost);
							 System.out.println("Enter how many plates");
							 int plates=sc.nextInt();
							 double total =cost*plates;
							 System.out.println("the total of" + plates +" plates Dosa is:" +total);
							 break;
						}
					}
				}
			}
		  }
		}
		cancel();
	}
	//PAYMENT CODE
	@Override
	public void payment()
	{
		System.out.println("****Welcome to payments****");
		System.out.println("Enter the Total Bill amount");
		int bill = sc.nextInt();
		System.out.println("Payment Methods");
		System.out.println("1.Upi Payment");
		System.out.println("2.Card Payment");
		//System.out.println("3.Cash Payment");
		
		int payment = sc.nextInt();
		switch(payment)
		{
		//for upi payment
			case 1:
			{
				System.out.println("You have selected Upi payment");
				System.out.println("Enter your number");
				long number = sc.nextLong();
				//System.out.println("Enter the total bill");
				System.out.println("The link of payment is send to this number:"+number);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thank you for order.Have a good Day");
				
				System.out.println("Give the feedback");
			}
			break;
			//for card payment
			case 2:
			{
				System.out.println("You have selected Card payment");
				System.out.println("Enter your card number");
				long card = sc.nextLong();
				System.out.println("Complete the transaction");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thank you for order.Have a good Day");
				
				System.out.println("Give the feedback");
			}
			
//			//for cash payment
//			case 3:
//			{
//				System.out.println("You have Cash Payment");
//				System.out.println("");
//				long number = sc.nextLong();
//				System.out.println("The link of payment is send to this number:"+number);
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println("Thank you for order.Have a good Day");
//				
//				System.out.println("Give the feedback");
//			}
			
		}
		rating();
		
	}
	@Override
	public void cancel() 
	{
		System.out.println("Do you want to Proceed the order");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int cancel = sc.nextInt();
		
		switch(cancel)
		{
			case 1:
			{
				System.out.println("Your Order is been ready");
				break;
			}
			case 2:
			{
				System.out.println("Your order has been Cancelled,Thank you");
				break;
			}
			
		}
		System.out.println();
		payment();
		
	}

	@Override
	public void rating() 
	{
		System.out.println("Give a Rating to Improve Our Services ");
		System.out.println("1.Bad");
		System.out.println("2.Good");
		System.out.println("3.Excellent");
		int rating  = sc.nextInt();
		
		switch(rating)
		{
		case 1:
			{
				System.out.println("Sorry for inconvience,we will improve");
				break;
			}
		case 2:
			{
				System.out.println("Thank you for having us.Have a Great Day");
				break;
			}
		case 3:
			{
				System.out.println("Thank you for using our Application,Have a Great Day");
				break;
			}
			
		}
		
	}
	

}
