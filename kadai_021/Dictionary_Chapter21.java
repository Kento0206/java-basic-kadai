package text.kadai_021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dictionary_Chapter21 {

			HashMap<String,String> dictionary = new HashMap<String,String>();
			
			List<String> list = Arrays.asList(
					"apple","peach","banana",
					"lemon","pear","kiwi",
					"strawberry","grape","muscat","cherry"
					);
			List<String> list2 = Arrays.asList(
					"アップル","桃","バナナ",
					"レモン","なし","キウイ",
					"いちご","ぶどう","マスカット","さくらんぼ"
					);
			
			public Dictionary_Chapter21() {
				
			
			for(int i = 0; i < list.size(); i++) {
				dictionary.put(list.get(i),list2.get(i));
			}
			
			for(String dic: dictionary.keySet()) {
				System.out.println(dic + ":" + dictionary.get(dic));
				}
			}
			public void serch(String word) {
				if(dictionary.get(word) == null) {
					System.out.println("辞書にはありません");
				}else {
				  System.out.println(word + "の意味は" + dictionary.get(word) + "です");
				}
	}
			
}
