package ys;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import main.STU;

public class Student {
	
	private ArrayList<STU> list;
	private Scanner input;
	private String stNum;
	private String name;
	private int phoneNum;
	
	public Student() {
		list = new ArrayList<STU>();
		input = new Scanner(System.in);
	}
	
	public void print() {
		int num;
		
		while(true) {
			System.out.println("1. 등록 2. 보기 3. 하나만 보기 4. 종료");
			num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("학번 입력");
				stNum = input.next();
				System.out.println("이름 입력");
				name = input.next();
				System.out.println("전화번호 입력");
				phoneNum = input.nextInt();
				
				STU stu = new STU();
				stu.setStuNo(stNum);
				stu.setName(name);
				stu.setPhoneNo(phoneNum);
				
				list.add(stu);
				break;
			case 2:
				System.out.println("=== 전체 보기 ===");
				for (int i = 0; i <list.size(); i++) {
					System.out.println("학번 : " + list.get(i).getStuNo());
					System.out.println("이름 : " + list.get(i).getName());
					System.out.println("전화번호 : " + list.get(i).getPhoneNo());
					System.out.println("=========================");
				}
				break;
			case 3:
				System.out.println("=== 검색 할 학번을 입력해주세요 ===");
				stNum = input.next();
				
				for (int i = 0; i < list.size(); i++) {
					STU stu02 = list.get(i);
					if (stNum.equals(stu02.getStuNo())) {
						System.out.println("학번 : " + list.get(i).getName());
						System.out.println("이름 : " + list.get(i).getStuNo());
						System.out.println("전화번호 : " + list.get(i).getPhoneNo());
					}
					else if (stu02.getStuNo() == stNum) {
						System.out.println("그런 분은 안계십니다.");
					}
				}
				
				break;
			case 4:
				System.out.println("종료합니다.");
				return;
				}
			}
		
	}
}
