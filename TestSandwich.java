//Filename TestSandwich.java
//Tom 2/14/2020

import java.util.Scanner;

public class TestSandwich
{
	public static void main(String[] args)
	{
		Sandwich one = new Sandwich();

		one = getData(one);

		System.out.println("Sandwich details:");
		System.out.println(one.getMain());
		System.out.println(one.getBread());
		System.out.println(one.getPrice());

	}

	public static Sandwich getData(Sandwich food)
	{
		String mainIngredient;
		String bread;
		double price;

		Scanner input = new Scanner(System.in);

		System.out.print("What kind of Sandwich: ");
		mainIngredient = input.nextLine();

		System.out.print("What kind of Bread: ");
		bread = input.nextLine();

		System.out.print("How much: ");
		price = input.nextDouble();

		food.setMain(mainIngredient);
		food.setBread(bread);
		food.setPrice(price);

		return food;
	}
}