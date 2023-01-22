package assessment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Wordcount {
	public static void main(String[] args) {
		String inputString = "Hello World Please hhhh" ;
		String  refString = "Helpo";
		ArrayList<Character> arr = new ArrayList<Character>();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i = 0; i < inputString.length(); i++) { 
			Character t = Character.toUpperCase(inputString.charAt(i));
			if (m.containsKey(t)) {
				int count = m.get(t) + 1;
				m.put(t, count);
			} else {
				m.put(t, 1);
			}
//			Character t = inputString.charAt(i);
//			arr.add(Character.toUpperCase(inputString.charAt(i)));	//add as char arr
		}
//		Map<Character,Integer> m = new HashMap<Character,Integer>();
//		for (Character i : arr) {
//			if (m.containsKey(i)) {
//				int count = m.get(i) + 1;
//				m.put(i, count);
//			} else {
//				m.put(i, 1);
//			}
//		}
		for(int i = 0; i < refString.length(); i++) {
			Character t = Character.toUpperCase(refString.charAt(i));
//			if (m.containsKey(t)) {
//				m.get(t);
				System.out.println(t + " = " + m.get(t));
//			}
		}
		
//				for (String temp : m.keySet()) {
//			System.out.println("value " +temp + " is ocurred " +m.get(temp)+ " times");
//		System.out.println(m);
//		}
	}
}
