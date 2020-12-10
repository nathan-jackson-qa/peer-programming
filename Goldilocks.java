
public class Goldilocks {

	private int weight;
	private int temp;
	private Seat seatCheck;
	
	public Goldilocks(int weight, int temp)
	{
		this.weight = weight;
		this.temp = temp;
	}
	
	public boolean checkSeat(Seat check)
	{
		seatCheck = check;
		if(checkWeight(seatCheck.weight) && checkTemp(seatCheck.temp))
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkWeight(int weight)
	{
		if(weight > this.weight)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkTemp(int temp)
	{
		if(temp < this.temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
