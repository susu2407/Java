package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	
	private List<Account> accounts = new ArrayList<>(); // 계좌 리스트
	private Scanner scanner = new Scanner(System.in); // 입력 스캐너 객체
	
	// 프로그램 메인 메서드
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		
		System.out.println("프로그램 종료");
	}

	public void start() {
		boolean running = true;
		
		while (running) {
			printMenu();
			System.out.print("선택> "); 
			int choice = Integer.parseInt(scanner.next());
			
			switch (choice) {
				case 1 -> createAccount();
				case 2 -> listAccounts();
				case 3 -> depositAccount();
				case 4 -> withdrawAccount();
				case 5 -> {
					running = false;
				}
				default -> System.out.println("올바른 번호를 선택하세요.");
			}
		}
	}

	public void printMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금 ㅣ 4.출금 ㅣ 5.종료");
		System.out.println("--------------------------------------------------");
	}

	// 1. 계좌 생성
	public void createAccount() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("예금주: ");
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.next());
		
		Account acc = new Account(ano, owner, balance);
		accounts.add(acc);
		System.out.println("계좌가 생성되었습니다.");
	}

	// 2. 계좌 목록 출력
	public void listAccounts() {
		System.out.println("-------- 계좌 목록 --------");
		for (Account acc : accounts) {
			System.out.printf("계좌번호: %s | 예금주: %s | 잔고: %d%n", 
				acc.getAno(), acc.getOwner(), acc.getBalance());
		}
	}

	// 3. 입금
	public void depositAccount() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("입금액: ");
		int amount = Integer.parseInt(scanner.next());

		Account acc = findAccount(ano);
		if (acc != null) {
			int newBalance = acc.getBalance() + amount;
			acc.setBalance(newBalance);
			System.out.println("입금 완료. 현재 잔고: " + acc.getBalance());
		} else {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		}
	}

	// 4. 출금
	public void withdrawAccount() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("출금액: ");
		int amount = Integer.parseInt(scanner.next());

		Account acc = findAccount(ano);
		if (acc != null) {
			if (acc.getBalance() >= amount) {
				int newBalance = acc.getBalance() - amount;
				acc.setBalance(newBalance);
				System.out.println("출금 완료. 현재 잔고: " + acc.getBalance());
			} else {
				System.out.println("잔고가 부족합니다. 현재 잔고: " + acc.getBalance());
			}
		} else {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		}
	}

	// 5. 계좌 검색
	public Account findAccount(String ano) {
		for (Account acc : accounts) {
			if (acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}
}
