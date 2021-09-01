package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<STU> al = new ArrayList<STU>();
		String name = null, stuNo;
		int phoneNo;
		int num;
		System.out.println("--학생 관리 프로그램 시작--");
		while (true) {
			System.out.println("1.생성 2.전체보기 3.하나만 보기 4.수정 5.삭제");
			num = scan.nextInt();
			switch (num) {
			case 1: 
				System.out.println("학번 입력 ");
			stuNo = scan.next();
			System.out.println("이름 입력 ");
			name = scan.next();
			System.out.println("전화번호 입력 ");
			phoneNo = scan.nextInt();		
			
			STU s = new STU();
			s.setStuNo(stuNo);
			s.setName(name);
			s.setPhoneNo(phoneNo);
			
			al.add(s);
				break;
			case 2:System.out.println("----학생 전체 보기----");
			for(int i =0; i<al.size();i++) {
				System.out.println("학생 이름: "+al.get(i).getName());
				System.out.println("학생 학번: "+al.get(i).getStuNo());
				System.out.println("학생 번호: "+al.get(i).getPhoneNo());
				System.out.println("---------------");}
				break;
			case 3:
				System.out.println("=== 검색 할 학번을 입력해주세요 ===");
			stuNo = scan.next();

			for (int i = 0; i < al.size(); i++) {
				STU stu02 = al.get(i);
				if (stuNo.equals(stu02.getStuNo())) {
					System.out.println("학생 이름 : " + al.get(i).getStuNo());
					System.out.println("학생 학번 : " + al.get(i).getName());
					System.out.println("학생 번호 : " + al.get(i).getPhoneNo());
				}
				if (stuNo.contains(stuNo) != true) {
					System.out.println("존재하지 않는 학번입니다.");
				}
			}

				break;
			case 4:
				break;
			case 5:
					
					while(true) {
						System.out.println("삭제하실 회원이름을 입력해주세요.");
						String delName = scan.next();
						if(delName.contains(name)) {
						al.remove(delName);
						System.out.println(delName+"의 정보가 삭제되었습니다.");
						} else {
							System.out.println("존재하지 않는 회원입니다.");
							break;
						}break;
					}
			}
		}
	}
}	
	