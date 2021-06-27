import java.util.Iterator;
import java.util.Scanner;

public class Program13
	{

		public static void main(String[] args)
			{
				String s = "";
				int solution = 0;
				Scanner keyboard = new Scanner(System.in);
				String[] testArray = {"CCLXII","CCLXIII","CCLXIV","CCLXV","CCLXVI","CCLXVII","CCLXVIII","CCLXIX","CCLXX","CCLXXI","CCLXXII","CCLXXIII","CCLXXIV","CCLXXV","CCLXXVI","CCLXXVII","CCLXXVIII","CCLXXIX","CCLXXX","CCLXXXI","CCLXXXII","CCLXXXIII","CCLXXXIV","CCLXXXV","CCLXXXVI","CCLXXXVII","CCLXXXVIII","CCLXXXIX","CCXC","CCXCI","CCXCII","CCXCIII","CCXCIV","CCXCV","CCXCVI","CCXCVII","CCXCVIII","CCXCIX","CCC","CCCI","CCCII","CCCIII","CCCIV","CCCV","CCCVI","CCCVII","CCCVIII","CCCIX","CCCX","CCCXI","CCCXII","CCCXIII","CCCXIV","CCCXV","CCCXVI","CCCXVII","CCCXVIII","CCCXIX","CCCXX","CCCXXI","CCCXXII","CCCXXIII","CCCXXIV","CCCXXV","CCCXXVI","CCCXXVII","CCCXXVIII","CCCXXIX","CCCXXX","CCCXXXI","CCCXXXII","CCCXXXIII","CCCXXXIV","CCCXXXV","CCCXXXVI","CCCXXXVII","CCCXXXVIII","CCCXXXIX","CCCXL","CCCXLI","CCCXLII","CCCXLIII","CCCXLIV","CCCXLV","CCCXLVI","CCCXLVII","CCCXLVIII","CCCXLIX","CCCL","CCCLI","CCCLII","CCCLIII","CCCLIV","CCCLV","CCCLVI","CCCLVII","CCCLVIII","CCCLIX","CCCLX","CCCLXI","CCCLXII","CCCLXIII","CCCLXIV","CCCLXV","CCCLXVI","CCCLXVII","CCCLXVIII","CCCLXIX","CCCLXX","CCCLXXI","CCCLXXII","CCCLXXIII","CCCLXXIV","CCCLXXV","CCCLXXVI","CCCLXXVII","CCCLXXVIII","CCCLXXIX","CCCLXXX","CCCLXXXI","CCCLXXXII","CCCLXXXIII","CCCLXXXIV","CCCLXXXV","CCCLXXXVI","CCCLXXXVII","CCCLXXXVIII","CCCLXXXIX","CCCXC","CCCXCI","CCCXCII","CCCXCIII","CCCXCIV","CCCXCV","CCCXCVI","CCCXCVII","CCCXCVIII","CCCXCIX","CD","CDI","CDII","CDIII","CDIV","CDV","CDVI","CDVII","CDVIII","CDIX","CDX","CDXI","CDXII","CDXIII","CDXIV","CDXV","CDXVI","CDXVII","CDXVIII","CDXIX","CDXX","CDXXI","CDXXII","CDXXIII","CDXXIV","CDXXV","CDXXVI","CDXXVII","CDXXVIII","CDXXIX","CDXXX","CDXXXI","CDXXXII","CDXXXIII","CDXXXIV","CDXXXV","CDXXXVI","CDXXXVII","CDXXXVIII","CDXXXIX","CDXL","CDXLI","CDXLII","CDXLIII","CDXLIV","CDXLV","CDXLVI","CDXLVII","CDXLVIII","CDXLIX","CDL","CDLI","CDLII","CDLIII","CDLIV","CDLV","CDLVI","CDLVII","CDLVIII","CDLIX","CDLX","CDLXI","CDLXII","CDLXIII","CDLXIV","CDLXV","CDLXVI","CDLXVII","CDLXVIII","CDLXIX","CDLXX","CDLXXI","CDLXXII","CDLXXIII","CDLXXIV","CDLXXV","CDLXXVI","CDLXXVII","CDLXXVIII","CDLXXIX","CDLXXX","CDLXXXI","CDLXXXII","CDLXXXIII","CDLXXXIV","CDLXXXV","CDLXXXVI","CDLXXXVII","CDLXXXVIII","CDLXXXIX","CDXC","CDXCI","CDXCII","CDXCIII","CDXCIV","CDXCV","CDXCVI","CDXCVII","CDXCVIII","CDXCIX","D","DI","DII","DIII","DIV","DV","DVI","DVII","DVIII","DIX","DX","DXI","DXII","DXIII","DXIV","DXV","DXVI","DXVII","DXVIII","DXIX","DXX","DXXI","DXXII","DXXIII","DXXIV","DXXV","DXXVI","DXXVII","DXXVIII","DXXIX","DXXX","DXXXI","DXXXII","DXXXIII","DXXXIV","DXXXV","DXXXVI","DXXXVII","DXXXVIII","DXXXIX","DXL","DXLI","DXLII","DXLIII","DXLIV","DXLV","DXLVI","DXLVII","DXLVIII","DXLIX","DL","DLI","DLII","DLIII","DLIV","DLV","DLVI","DLVII","DLVIII","DLIX","DLX","DLXI","DLXII","DLXIII","DLXIV","DLXV","DLXVI","DLXVII","DLXVIII","DLXIX","DLXX","DLXXI","DLXXII","DLXXIII","DLXXIV","DLXXV","DLXXVI","DLXXVII","DLXXVIII","DLXXIX","DLXXX","DLXXXI","DLXXXII","DLXXXIII","DLXXXIV","DLXXXV","DLXXXVI","DLXXXVII","DLXXXVIII","DLXXXIX","DXC","DXCI","DXCII","DXCIII","DXCIV","DXCV","DXCVI","DXCVII","DXCVIII","DXCIX","DC","DCI","DCII","DCIII","DCIV","DCV","DCVI","DCVII","DCVIII","DCIX","DCX","DCXI","DCXII","DCXIII","DCXIV","DCXV","DCXVI","DCXVII","DCXVIII","DCXIX","DCXX","DCXXI","DCXXII","DCXXIII","DCXXIV","DCXXV","DCXXVI","DCXXVII","DCXXVIII","DCXXIX","DCXXX","DCXXXI","DCXXXII","DCXXXIII","DCXXXIV","DCXXXV","DCXXXVI","DCXXXVII","DCXXXVIII","DCXXXIX","DCXL","DCXLI","DCXLII","DCXLIII","DCXLIV","DCXLV","DCXLVI","DCXLVII","DCXLVIII","DCXLIX","DCL","DCLI","DCLII","DCLIII","DCLIV","DCLV","DCLVI","DCLVII","DCLVIII","DCLIX","DCLX","DCLXI","DCLXII","DCLXIII","DCLXIV","DCLXV","DCLXVI","DCLXVII","DCLXVIII","DCLXIX","DCLXX","DCLXXI","DCLXXII","DCLXXIII","DCLXXIV","DCLXXV","DCLXXVI","DCLXXVII","DCLXXVIII","DCLXXIX","DCLXXX","DCLXXXI","DCLXXXII","DCLXXXIII","DCLXXXIV","DCLXXXV","DCLXXXVI","DCLXXXVII","DCLXXXVIII","DCLXXXIX","DCXC","DCXCI","DCXCII","DCXCIII","DCXCIV","DCXCV","DCXCVI","DCXCVII","DCXCVIII","DCXCIX","DCC","DCCI","DCCII","DCCIII","DCCIV","DCCV","DCCVI","DCCVII","DCCVIII","DCCIX","DCCX","DCCXI","DCCXII","DCCXIII","DCCXIV","DCCXV","DCCXVI","DCCXVII","DCCXVIII","DCCXIX","DCCXX","DCCXXI","DCCXXII","DCCXXIII","DCCXXIV","DCCXXV","DCCXXVI","DCCXXVII","DCCXXVIII","DCCXXIX","DCCXXX","DCCXXXI","DCCXXXII","DCCXXXIII","DCCXXXIV","DCCXXXV","DCCXXXVI","DCCXXXVII","DCCXXXVIII","DCCXXXIX","DCCXL","DCCXLI","DCCXLII","DCCXLIII","DCCXLIV","DCCXLV","DCCXLVI","DCCXLVII","DCCXLVIII","DCCXLIX","DCCL","DCCLI","DCCLII","DCCLIII","DCCLIV","DCCLV","DCCLVI","DCCLVII","DCCLVIII","DCCLIX","DCCLX","DCCLXI","DCCLXII","DCCLXIII","DCCLXIV","DCCLXV","DCCLXVI","DCCLXVII","DCCLXVIII","DCCLXIX","DCCLXX","DCCLXXI","DCCLXXII","DCCLXXIII","DCCLXXIV","DCCLXXV","DCCLXXVI","DCCLXXVII","DCCLXXVIII","DCCLXXIX","DCCLXXX","DCCLXXXI","DCCLXXXII","DCCLXXXIII","DCCLXXXIV","DCCLXXXV","DCCLXXXVI","DCCLXXXVII","DCCLXXXVIII","DCCLXXXIX","DCCXC","DCCXCI","DCCXCII","DCCXCIII","DCCXCIV","DCCXCV","DCCXCVI","DCCXCVII","DCCXCVIII","DCCXCIX","DCCC","DCCCI","DCCCII","DCCCIII","DCCCIV","DCCCV","DCCCVI","DCCCVII","DCCCVIII","DCCCIX","DCCCX","DCCCXI","DCCCXII","DCCCXIII","DCCCXIV","DCCCXV","DCCCXVI","DCCCXVII","DCCCXVIII","DCCCXIX","DCCCXX","DCCCXXI","DCCCXXII","DCCCXXIII","DCCCXXIV","DCCCXXV","DCCCXXVI","DCCCXXVII","DCCCXXVIII","DCCCXXIX","DCCCXXX","DCCCXXXI","DCCCXXXII","DCCCXXXIII","DCCCXXXIV","DCCCXXXV","DCCCXXXVI","DCCCXXXVII","DCCCXXXVIII","DCCCXXXIX","DCCCXL","DCCCXLI","DCCCXLII","DCCCXLIII","DCCCXLIV","DCCCXLV","DCCCXLVI","DCCCXLVII","DCCCXLVIII","DCCCXLIX","DCCCL","DCCCLI","DCCCLII","DCCCLIII","DCCCLIV","DCCCLV","DCCCLVI","DCCCLVII","DCCCLVIII","DCCCLIX","DCCCLX","DCCCLXI","DCCCLXII","DCCCLXIII","DCCCLXIV","DCCCLXV","DCCCLXVI","DCCCLXVII","DCCCLXVIII","DCCCLXIX","DCCCLXX","DCCCLXXI","DCCCLXXII","DCCCLXXIII","DCCCLXXIV","DCCCLXXV","DCCCLXXVI","DCCCLXXVII","DCCCLXXVIII","DCCCLXXIX","DCCCLXXX","DCCCLXXXI","DCCCLXXXII","DCCCLXXXIII","DCCCLXXXIV","DCCCLXXXV","DCCCLXXXVI","DCCCLXXXVII","DCCCLXXXVIII","DCCCLXXXIX","DCCCXC","DCCCXCI","DCCCXCII","DCCCXCIII","DCCCXCIV","DCCCXCV","DCCCXCVI","DCCCXCVII","DCCCXCVIII","DCCCXCIX","CM","CMI","CMII","CMIII","CMIV","CMV","CMVI","CMVII","CMVIII","CMIX","CMX","CMXI","CMXII","CMXIII","CMXIV","CMXV","CMXVI","CMXVII","CMXVIII","CMXIX","CMXX","CMXXI","CMXXII","CMXXIII","CMXXIV","CMXXV","CMXXVI","CMXXVII","CMXXVIII","CMXXIX","CMXXX","CMXXXI","CMXXXII","CMXXXIII","CMXXXIV","CMXXXV","CMXXXVI","CMXXXVII","CMXXXVIII","CMXXXIX","CMXL","CMXLI","CMXLII","CMXLIII","CMXLIV","CMXLV","CMXLVI","CMXLVII","CMXLVIII","CMXLIX","CML","CMLI","CMLII","CMLIII","CMLIV","CMLV","CMLVI","CMLVII","CMLVIII","CMLIX","CMLX","CMLXI","CMLXII","CMLXIII","CMLXIV","CMLXV","CMLXVI","CMLXVII","CMLXVIII","CMLXIX","CMLXX","CMLXXI","CMLXXII","CMLXXIII","CMLXXIV","CMLXXV","CMLXXVI","CMLXXVII","CMLXXVIII","CMLXXIX","CMLXXX","CMLXXXI","CMLXXXII","CMLXXXIII","CMLXXXIV","CMLXXXV","CMLXXXVI","CMLXXXVII","CMLXXXVIII","CMLXXXIX","CMXC","CMXCI","CMXCII","CMXCIII","CMXCIV","CMXCV","CMXCVI","CMXCVII","CMXCVIII","CMXCIX","M"};
				
				for (int i = 0; i < testArray.length; i++)
					{
						solution = romanToInt(testArray[i]);
						
						System.out.println("The roman numeral is " + testArray[i]  + "  is    "  + solution);
					}
				
				
				
				
			}

		private static int romanToInt(String s)
			{
				int tempInt = 0;
				String ones = "";
				String tens = "";
				String hundreds = "";
				String thousands = "";
			
			//Ones calculation
				
			if (s.contains("I") || s.contains("V"))
				{
					if (s.contains("IX"))
						{
							ones = s.substring(s.indexOf("IX"));
						}
					
				    else if (s.contains("IV"))
						{
							ones = s.substring(s.indexOf("IV"));
						}
					else if (s.contains("V")) {
						ones = s.substring(s.indexOf("V"));
					   }
					else if (s.contains("I")) {
						ones = s.substring(s.indexOf("I"));
					   }
					
					if (ones.contains("IX"))
						{
							tempInt = tempInt + 9;
						}
				
					if (ones.contains("IV"))
						{
							tempInt = tempInt - 1;
							
						}
					
					if (ones.contains("V"))
						{
							tempInt = tempInt + 5;
							
						}
					if (ones.contains("I") && ones.contains("IV") == false && ones.contains("IX") == false)
						{
							
							for (int i = 0; i < ones.length(); i++)
								{
									if (ones.charAt(i) == 'I')
										{
											tempInt = tempInt + 1;
										}
								}	
				
						}
			
				}	
				
				
			//ten's calculation 
			
			if (ones == "")
				{
					
					
				}
			else  {
				s = s.substring(0,s.indexOf(ones));
			}
			
			
			if (s.contains("XC"))
				{
					tens = s.substring(s.indexOf("XC"));
				}
			
		    else if (s.contains("XL"))
				{
					tens = s.substring(s.indexOf("XL"));
				}
			else if (s.contains("L")) {
				tens = s.substring(s.indexOf("L"));
			   }
			else if (s.contains("X")) {
				tens = s.substring(s.indexOf("X"));
			   }
			
			System.out.println("tens:   " + tens);
			
				
			if (tens.contains("X") || s.contains("L"))
				{
					
					
					

					if (tens.contains("XC"))
						{
							tempInt = tempInt + 90;
						}
				
					
					
					
				
					if (tens.contains("XL"))
						{
							tempInt = tempInt - 10;
							
						}
					
					if (tens.contains("L"))
						{
							tempInt = tempInt + 50;
							
						}
					if (tens.contains("X") && tens.contains("XL") == false && tens.contains("XC") == false )
						{
							
							for (int i = 0; i < tens.length(); i++)
								{
									if (tens.charAt(i) == 'X')
										{
											tempInt = tempInt + 10;
										}
								}	
				
						}
			
				}	
				
			
			
			
			
			
				
				
		    //hundred's calculation 
				
			if (tens == "")
				{
					
					
				}
			else  {
				s = s.substring(0,s.indexOf(tens));
			}
			
			
			if (s.contains("CM"))
				{
					hundreds = s.substring(s.indexOf("CM"));
				}
			
		    else if (s.contains("CD"))
				{
				hundreds = s.substring(s.indexOf("CD"));
				}
			else if (s.contains("D")) {
				hundreds = s.substring(s.indexOf("D"));
			   }
			else if (s.contains("C")) {
				hundreds = s.substring(s.indexOf("C"));
			   }
			
			
			System.out.println("hundreds start:    " + hundreds );
				
			if (hundreds.contains("C") || s.contains("D"))
				{
					
					
					

					if (hundreds.contains("CM"))
						{
							tempInt = tempInt + 900;
						}
				
					
					
					
				
					if (hundreds.contains("CD"))
						{
							tempInt = tempInt - 100;
							
						}
					
					if (hundreds.contains("D"))
						{
							tempInt = tempInt + 500;
							
						}
					if (hundreds.contains("C") && hundreds.contains("CD") == false && hundreds.contains("CM") == false)
						{
							
							for (int i = 0; i < hundreds.length(); i++)
								{
									if (hundreds.charAt(i) == 'C')
										{
											tempInt = tempInt + 100;
										}
								}	
				
						}
			
				}	
						
				
				
			
			//thousand's calculation 
			
			if (hundreds == "")
				{
					
					
				}
			else  {
				s = s.substring(0,s.indexOf(hundreds));
			}
			
			
			if (s.contains("M"))
				{
					thousands = s.substring(s.indexOf("M"));
				}
			
		   
			
			
			System.out.println("hundreds start:    " + thousands );
				
			if (thousands.contains("M"))
				{
					
					
					

					
					if (thousands.contains("M") )
						{
							
							for (int i = 0; i < thousands.length(); i++)
								{
									if (thousands.charAt(i) == 'M')
										{
											tempInt = tempInt + 1000;
										}
								}	
				
						}
			
				}			
				
				
				
				
				
				
				
				
				
				
				
				return tempInt;
			}

	}
