package ys;
import main.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		HashMap<String, String> map = new HashMap<String, String>();
		ArrayList<STU> list = new ArrayList<STU>();
		
		int num;
		int phoneNum = 0;
		String name, stNum = null;
		
		
		while(true) {
			System.out.println("1. 등록 2. 보기 3. 종료");
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
//				System.out.println(stu.getName());
//				System.out.println(stu.getStuNo());
//				System.out.println(stu.getPhoneNo());
//				System.out.println(list.get(0).getName());
				System.out.println(stu.getName());
				
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				
				break;
			case 2:
				System.out.println("=== 하나만 보기 ===");
				System.out.println("=== 찾으실 분의 학번을 입력해 주세요. ===");
				stNum = input.next();
				
				
//				if (list.contains(stNum) == true) {
//					System.out.println("찾으시는 사람은 없네요...");
//				} else {
//					for (int i = 0; i < list.size(); i++) {
//						System.out.println("이름 : " + list.get(i).getName());
//						System.out.println("학번 : " + list.get(i).getStuNo());
//						System.out.println("전화번호 : " + list.get(i).getPhoneNo());
//					}
//					System.out.println("이름 : " + list.get(0).getName());
//					System.out.println("학번 : " + list.get(0).getStuNo());
//					System.out.println("전화번호 : " + list.get(0).getPhoneNo());
//				}
				
				break;
		}
			
		}
	}

}	
