package text.kadai_028;

import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter28 {

	// じゃんけんの手をリスト化
	HashMap<String, String> hand = new HashMap<String, String>();
	
	// 初期文の出力とリスト内定義、対戦相手の手を代入
	public Jyanken_Chapter28() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		

		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		
	}
	
	
	// 入力された文字の取得と精査
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		String jyanken = scanner.next();

		if(!(jyanken.equals("r") || jyanken.equals("s") || jyanken.equals("p"))) {
			System.out.println("正しい値を入力してください");
			System.exit(0);
		}
		return jyanken;

	}

	// 対戦相手の手を取得するメソッド
	public String getRandom() {
		String[] opponentHand = {"r", "s", "p"};
		int num = (int)Math.floor(Math.random() * 3);
		return opponentHand[num];
	}
	
	// じゃんけんを実行するメソッド
	public void playGame() {
		String jyanken = getMyChoice();
		System.out.println(jyanken);
		String Hand = getRandom();
		System.out.println("自分の手は" + hand.get(jyanken) + "," + "対戦相手の手は" + hand.get(Hand)); 
				if(jyanken.equals(Hand)) {
					System.out.println("あいこです");
				}else if(jyanken.equals("r") && Hand.equals("s")) {
					System.out.println("自分の勝ちです");
				}else if(jyanken.equals("s") && Hand.equals("p")){
					System.out.println("自分の勝ちです");
				}else if(jyanken.equals("p") && Hand.equals("r")){
					 System.out.println("自分の勝ちです");
				}else {
					System.out.println("相手の勝ちです");
				}
	}

}
