package KMS;

import LHJ.Person;

public class KMS extends Person{
	public KMS(String Name) {
		super(Name);
		// TODO Auto-generated constructor stub
	}

	// 잠자기, 재정의
	public void sleep() {
		System.out.println("꿀잠자기~~");
	}
}
