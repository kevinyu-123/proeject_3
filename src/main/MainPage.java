package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = null, stNum;
		int num;
		System.out.println("--학생 관리 프로그램 시작--");
		while (true) {
			System.out.println("1.생성 2.전체보기 3.하나만 보기 4.수정 5.삭제");
			num = scan.nextInt();
			switch (num) {
			case 1: while(true) {
				System.out.println("이름입력");
				ArrayList arr = new ArrayList();
				name = scan.next();
				System.out.println(name+"님의 정보가 입력되었습니다.");
			break;
			}
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
					
					while(true) {
						System.out.println("삭제하실 회원이름을 입력해주세요.");
						String delName = scan.next();
						
						if(delName == name) {
						ArrayList<DelN> arr = new ArrayList<DelN>();
						arr.remove(name);
						System.out.println(delName+"의 정보가 삭제되었습니다.");
						} else {
							System.out.println("존재하지 않는 회원입니다.");
						}break;
					}
			}
		}
	}
}	
	