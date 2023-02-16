package sungjuk;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

	public void menu(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		int num;

		while (true) {

			System.out.println();
			System.out.println("********************");
			System.out.println("  1. 총점으로 내림차순");
			System.out.println("  2. 이름으로 오름차순");
			System.out.println("  3. 이전 메뉴");
			System.out.println("********************");
			System.out.print("   번호 : ");
			num = scan.nextInt();
			if (num == 3)
				break;

			Comparator<SungJukDTO> com = null;
			if (num == 1) {
				com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						// 총점으로 내림차순
						if (s1.getTot() < s2.getTot())
							return 1;
						else if (s1.getTot() > s2.getTot())
							return -1;
						else
							return 0;
					}
				};

			} else if (num == 2) {
				com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						// 이름으로 오름차순
						return s1.getName().compareTo(s2.getName());
					}
				};
			} else {
				System.out.println("1 ~ 3번까지만 입력하세요");
				continue;
			}

			Collections.sort(arrayList, com);

			new SungJukList().execute(arrayList);

		} // while
	}

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		this.menu(arrayList);
	}

}
