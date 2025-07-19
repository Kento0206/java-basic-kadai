package text.kadai_021;

import java.util.ArrayList;



public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter21 dictional = new Dictionary_Chapter21();
		
		ArrayList<String> array = new ArrayList<String>();
		
		for(String dic:dictional.dictionary.keySet()) {
			array.add(dic);
		}
		System.out.println("");
		
		dictional.serch("apple");
		dictional.serch("banana");
		dictional.serch("grape");
		dictional.serch("orange");
		
	}
	
}
