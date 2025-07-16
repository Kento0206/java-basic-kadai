package text.kadai_18;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName = "";
	public String adress = "";

	abstract void setGivenName();
	
	public void commonIntroduce() {
		String name = familyName + givenName;
		System.out.println("私の名前は" + name + "です");
		
	}
	abstract void eachIntroduce();

	public void execIntroduce() {
		commonIntroduce();
		System.out.println("住所は" + adress + "です");
		eachIntroduce();
	}


}
