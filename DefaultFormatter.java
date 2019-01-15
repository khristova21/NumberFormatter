/**
 * @author Krisi Hristova
 * Pd.6
 *
 */
public class DefaultFormatter implements NumberFormatter
{

private int num;
private String stringNum;
private String commaNum;
	public String format(int num)
	{	
		this.num = num;
		stringNum = Integer.toString(num);
		commaNum = "";
		for(int i = 0; i < stringNum.length(); i++)
		{
			if((stringNum.length()-i) % 3 == 0 && i !=0)
			{
				commaNum += ",";
			}
			commaNum += stringNum.charAt(i);		  
		} 
		return commaNum;
	}
	
	
	
}