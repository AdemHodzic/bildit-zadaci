import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		
	}

	public static int[] eliminateDuplicates (int[] list){
		List<Integer> arr = new ArrayList<>();
		int tempArr[];
		for(int x:list){
			arr.add(x);
		}
		for(int i = 0;i<arr.size();i++){
			int temp = arr.get(i);
			for(int j = i+1;j<arr.size();j++){
				if(temp==(arr.get(j))) arr.remove(arr.get(j));
			}
		}
		tempArr = new int[arr.size()];
		int count = 0;
		for(int x:arr){
			tempArr[count] = x;
			count++;
		}
		return tempArr;
	}
	public static String sort (String s){
		 
		char c = s.charAt(0);
		String str = "";
		
		for (int i = 0; i < s.length(); i++){
			char r = s.charAt(i);
			if (c > r){
				char najmanji = c;
				c = r;
				r = najmanji;
				
				str += r;
			}
		}
		return str;
	}
	public static double sumMajorDiagonal(double[][] m){
		int kolona = 0;
		double sum = 0;
		
		for (int i = m.length - 1; i >= 0; i--){
			sum += m[i][kolona];
			kolona++;
		}
		return sum;
	}
}
