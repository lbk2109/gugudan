package gugudan;

public class GuguDan {
	static void prtResult(int[] result) {
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + "\t");
		System.out.println("");
	}

	static int[] CalResult(int first, int last) {
		System.out.println("**(" + first+","+last + ")단***");

		int[] result = new int[last];
		for (int i = 0; i < result.length; i++)
			result[i] = first * (i + 1);

		return result;
	}

}
