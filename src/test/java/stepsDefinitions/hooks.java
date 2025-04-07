package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("**********************");
		System.out.println("setup the enteries in netbanking database");
	}
	
	@After
	public void teardown()
	{
		System.out.println("clear the enteries");
	}
	@Before("@Mortgage")
	public void mortgageSetup()
	{
		System.out.println("**********************");
		System.out.println("setup the enteries in mortgage database");
	}
	// Before->Background->Scenario->After
	
}

