import java.util.ArrayList;
import java.util.Scanner;
public class RecipeRunner
	{
	    static double people;
		static double serveSize;
		static double modifier;
		static int fC;
		public static void main(String[] args)
			{
				AddRecipe.addRecipe();
				people = askPeople();
				String recipe1 = askRecipe(people);
				serveSize = AddRecipe.recipe.get(fC-1).getServSize();
				 modifier = people/serveSize;
				System.out.println("Modifier: " + modifier);
				tellIng();
//				String measurement = askMeasuremnts(recipe1)
			}

		public static double askPeople()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many people are you serving?");
				double sS = userInput.nextInt();
				return sS;
			}
			
		public static String askRecipe(double people2)
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What would you like to cook?");
			System.out.println("1.) Cheesecake 2.) Cookies 3.) Lasagna");
			 fC = userInput.nextInt();
			return AddRecipe.recipe.get(fC-1).getName();
		}
		
		public static double convert(double d)
		{
			System.out.println("Modifier: " + modifier);

			return d*modifier;
		}
		
			public static void tellIng()
			{
				System.out.println("Modifier: " + modifier);

			
				System.out.println("You need " + convert(AddRecipe.recipe.get(fC-1).getIngNum1()) 
					+ ", " + convert(AddRecipe.recipe.get(fC-1).getIngNum2()) + ", and " 
					+ convert(AddRecipe.recipe.get(fC-1).getIngNum3()));
			}
		
	
//		public static String askMeasuremnts(String r)
//		{
//			Scanner userInput = new Scanner(System.in);
//			System.out.println("Are you using Metric or Imperial?");
//			return userInput.nextLine();
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	