package uniandes.algorithms.coinchange;

public class VorazCoinChangeAlgorithm implements CoinChangeAlgorithm {

	@Override
	public int[] calculateOptimalChange(int totalValue, int[] denominations) {
		int[] result = new int[denominations.length];
		int val = 0;
		
		for (int i=(denominations.length -1); i>=0;i--) {
			val = totalValue/denominations[i];
			if(val>0) {
				result[i] = val;
				totalValue %= denominations[i];
			}
		}
		
		return result;
	}

}
