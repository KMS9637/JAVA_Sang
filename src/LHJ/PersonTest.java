package LHJ;

import KMS.KMS;
import LeeYeonsu.Leeyeonsu_ExtendsPerson;
import LSJ.LEESOOJIN;
import NGY.NamGwiYeon;

public class PersonTest {

	public static void main(String[] args) {
		Person [] PersonTest = new Person[5];
		
		
		PersonTest[0] = new Person("i");
		PersonTest[1] = new Person("KMS");
		PersonTest[2] = new Person("NGY");
		PersonTest[3] = new Person("LSJ");
		PersonTest[4] = new Person("LeeYeonsu");

		for (int i = 0; i < PersonTest.length; i++) {
//			System.out.println("상속테스트 :" + PersonTest[i].walk());
		}
	}

}
