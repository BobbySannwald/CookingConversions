import java.util.ArrayList;

public class AddRecipe
	{
		static ArrayList <Rec> recipe = new ArrayList<Rec>();

	public static void addRecipe()
		{
		recipe.add(new Rec("Cheesecake", "eggs", 4, "cream cheese", 8, "sugar", 3/2, 8));
		recipe.add(new Rec("Cookies", "Chocolate Chips", 12, "Baking Soda",1, "Butter",1, 6));
		recipe.add(new Rec("Lasagna", "Cheese", 32, "Pasta", 9, "Tomato Sauce",6, 8));
		}
	
	}
	