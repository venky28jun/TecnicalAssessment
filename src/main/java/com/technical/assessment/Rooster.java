package com.technical.assessment;

public class Rooster extends Birds {

	// Static Attributes
	private static final long serialVersionUID = -2797831403668402948L;

	// other ways to model a rooster without using inheritance
	// Composition is used
	private Chicken chicken;
	private LANGUAGE lang;

	public enum LANGUAGE {
		Danish, Dutch, Finnish, French, German, Greek, Hebrew, Hungarian, Italian, Japanese, Portuguese, Russian,
		Swedish, Turkish, Urdu,OTHERS
	}

	/// Constructor
	//////////////
	public Rooster() {
		this.lang = LANGUAGE.OTHERS;
		chicken = new Chicken(getLanguageSpecific());
	}

	public Rooster(LANGUAGE lang) {
		this.lang = lang;
		chicken = new Chicken(getLanguageSpecific());		
	}

	public Rooster(String say) {
		chicken = new Chicken(say);
	}

	// Override Methods
	///////////////////
	@Override
	public void say() {
		chicken.say();
	}

	@Override
	public boolean walk() {
		return chicken.walk();
	}

	@Override
	public boolean sing() {
		return chicken.sing();
	}

	@Override
	public boolean fly() {
		return chicken.fly();
	}
	
	public String getLanguageSpecific() {
		String say;
		switch (lang) {
		case Danish:
			say = "kykyliky";
			break;
		case Dutch:
			say = "kukeleku";
			break;
		case Finnish:
			say = "kukko kiekuu"; 
			break;
		case French:
			say = "cocorico";
			break;
		case German:
			say = "kikeriki"; 
			break;
		case Greek:
			say = "kikiriki";
			break;
		case Hebrew:
			say = "coo-koo-ri-koo";
			break;
		case Hungarian:
			say = "kukuriku";
			break;
		case Italian:
			say = "chicchirichi";
			break;
		case Japanese:
			say = "ko-ke-kok-ko-o"; 
			break;
		case Portuguese:
			say = "cucurucu";
			break;
		case Russian:
			say = "kukareku"; 
			break;
		case Swedish:
			say = "kuckeliku";
			break;
		case Turkish:
			say = "kuk-kurri-kuuu";
			break;
		case Urdu:
			say = "kuklooku";
			break;
		default:
			say = "Cock-a-doodle-doo";
			break;
		}
		return say;
	}

}
