package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, stNum;
		int num;
		System.out.println("--학생 관리 프로그램 시작--");
		while (true) {
			System.out.println("1.생성 2.전체보기 3.하나만 보기 4.수정 5.삭제");
			num = scan.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
					System.out.println("삭제하실 회원이름을 입력해주세요.");
					String delName = scan.next();
					while(true) {
						ArrayList arrayList = new ArrayList();
						arrayList.remove(delName);
						System.out.println();
					
					}
				
			}break;
		}
	}
}
