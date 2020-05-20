package finalCollections9;

import java.util.Comparator;

public class DoubleTreeDesc implements Comparator<Double>
{
	 	@Override
	 	public int compare(Double d1, Double d2)
	 	{
	 		return d2.compareTo(d1);
	 	}

}
