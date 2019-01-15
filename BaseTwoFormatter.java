/**
 * @author Krisi Hristova
 *PD 6
 *Number Formatter
 */
public class BaseTwoFormatter implements NumberFormatter
{
	private int num;
	private String stringNum = "";
	private String baseNum;
	public String format(int num)
	{
		this.num = num;
		stringNum = Integer.toString(num);
		for(int i = 0; i< stringNum.length(); i++)
		{
			if(num % 2 == 0 &&  i != 0)
			{
				baseNum += "0";
			}
			else
				baseNum += "1";
			baseNum += stringNum.charAt(i);		  

		}
		return baseNum;
		
	}
}
