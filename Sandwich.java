//Filename Sandwich.java
//Tom 2/14/2020

public class Sandwich
{
	String mainIngredient;
	String bread;
	double price;

	public Sandwich()
	{
		mainIngredient = "Ham";
		bread = "Rye";
		price = 4.99;
	}

	public void setBread(String b)
	{
		bread = b;
	}

	public void setMain(String mI)
	{
		mainIngredient = mI;
	}

	public void setPrice(Double p)
	{
		price = p;
	}

	public String getBread()
	{
		return bread;
	}

	public String getMain()
	{
		return mainIngredient;
	}

	public double getPrice()
	{
		return price;
	}
}
