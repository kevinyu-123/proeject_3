package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<STU> al = new ArrayList<STU>();
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
				System.out.println("----학생 전체 보기----");
				for(int i =0; i<al.size();i++) {
					System.out.println("학생 이름: "+al.get(i).getName());
					System.out.println("학생 학번: "+al.get(i).getStuNo());
					System.out.println("학생 번호: "+al.get(i).getPhoneNo());
					System.out.println("---------------");
				}
				break;
			case 3:
				System.out.println("=== 검색 할 학번을 입력해주세요 ===");
				stNum = scan.next();
				
				for (int i = 0; i < al.size(); i++) {
					STU stu02 = al.get(i);
					if (stNum.equals(stu02.getStuNo())) {
						System.out.println("학생 이름 : " + al.get(i).getStuNo());
						System.out.println("학생 학번 : " + al.get(i).getName());
						System.out.println("학생 번호 : " + al.get(i).getPhoneNo());
					}
					if (stNum.contains(stNum) != true) {
						System.out.println("존재하지 않는 학번입니다.");
					}
				}
				
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}
	}
}
