package main.java;

public class InjectionMain {
	
	public static void main(String[] args) {
		String inputStr = "<script>alert('HA HA HA')</script>";
		
		String inputStrNew = filtrarInput(inputStr);
		
		System.out.println(inputStrNew);
	}
	
	public static String filtrarInput(String inputStr) {
		String inputStrNew = inputStr.toLowerCase();
		
		String[] removeStrArr = new String[] { "</", ">", "<", "'", "document.", "(", ")" };
		
		for (String removeStr : removeStrArr) {
			inputStrNew = inputStrNew.replace(removeStr, "");
		}
		
		return inputStrNew;
	}
}
