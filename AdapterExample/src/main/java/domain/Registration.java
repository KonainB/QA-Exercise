package domain;

public class Registration {
	Course photography;
	Course journalism;
	Course cooking;
	public Registration() {
		super();
		this.photography=new Photography();
		this.journalism=new Journalism();
		this.cooking=new Cooking();
	}
	public void getDurationOfPhotography() 
	{
		photography.getDuration();
	}
	public void getDurationOfJournalism() 
	{
		journalism.getDuration();
	}
	public void getDurationOfCooking() 
	{
		cooking.getDuration();
	}

}
