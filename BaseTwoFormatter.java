/**
 * @author Krisi Hristova
 *PD 6
 *Number Formatter
 */

//i have no idea what base two means 
public class BaseTwoFormatter implements NumberFormatter
{
	private int num;
	private String newNum;
	public BaseTwoFormatter(int num)
	{
		this.num = num;
		newNum = Integer.toString(num, 2);
	
	}
	public String format(int num)
	{
		return newNum;
	}
	
}
