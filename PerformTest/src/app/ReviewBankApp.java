package app;

import java.util.ArrayList;
import java.util.Scanner;

// ReviewBankApp 클래스 - 은행 시스템 실행 및 사용자 입력 처리
public class ReviewBankApp {
    
    private Scanner scanner = new Scanner(System.in);                        // 입력 스캐너 객체
    private ArrayList<ReviewAccount> accounts = new ArrayList<>();          // 계좌 리스트

    // 메인 메서드: 프로그램 시작점
    public static void main(String[] args) {
        ReviewBankApp app = new ReviewBankApp();
        app.start(); // start 메서드 실행
        System.out.println("프로그램 종료");
    }

    // 프로그램 실행 루프 및 메뉴 처리
    public void start() {
        boolean running = true;

        while (running) {
            printMenu(); // 메뉴 출력
            System.out.print("선택> ");
            
            try {
                int choice = Integer.parseInt(scanner.next());

                switch (choice) {
                    case 1 -> createAccount();     // 계좌 생성
                    case 2 -> listAccounts();      // 계좌 목록
                    case 3 -> depositAccount();    // 입금
                    case 4 -> withdrawAccount();   // 출금
                    case 5 -> running = false;     // 종료
                    default -> System.out.println("올바른 번호를 선택하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
            }
        }
    }

    // 메뉴 출력 메서드
    public void printMenu() {
        System.out.println("-------------------------------------------");
        System.out.println("1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금 ㅣ 4.출금 ㅣ 5.종료");
        System.out.println("-------------------------------------------");
    }

    // 계좌 생성 메서드
    public void createAccount() {
    	System.out.println("----------------- 계좌생성 -------------------");
        try {
            System.out.print("계좌번호: ");
            String ano = scanner.next();

            System.out.print("예금주: ");
            String owner = scanner.next();

            System.out.print("초기입금액: ");
            int balance = Integer.parseInt(scanner.next());

            ReviewAccount acc = new ReviewAccount(ano, owner, balance);
            accounts.add(acc);
            System.out.println("계좌가 생성되었습니다.");
        } catch (NumberFormatException e) {
            System.out.println("입금액은 숫자만 입력 가능합니다.");
        }
    }

    // 계좌 목록 출력 메서드
    public void listAccounts() {
    	System.out.println("----------------- 계좌목록 -------------------");
        for (ReviewAccount acc : accounts) {
            System.out.printf("계좌번호: %s | 예금주: %s | 잔고: %d%n", 
                acc.getAno(), acc.getOwner(), acc.getBalance());
        }
    }

    // 계좌 검색 메서드
    public ReviewAccount findAccount(String ano) {
        for (ReviewAccount acc : accounts) {
            if (acc.getAno().equals(ano)) {
                return acc;
            }
        }
        return null; // 없으면 null 반환
    }

    // 입금 처리 메서드
    public void depositAccount() {
    	System.out.println("------------------- 예금 --------------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("입금액: ");
        int amount = Integer.parseInt(scanner.next());

        ReviewAccount acc = findAccount(ano);
        if (acc == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        try {
            if (acc.deposit(amount)) {
                System.out.println("입금 완료. 현재 잔고: " + acc.getBalance());
            } else {
                System.out.println("입금에 실패했습니다. (음수 금액 입력 불가)");
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력 가능합니다.");
        }
    }

    // 출금 처리 메서드
    public void withdrawAccount() {
    	System.out.println("------------------- 출금 --------------------"); 
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int amount = Integer.parseInt(scanner.next());

        ReviewAccount acc = findAccount(ano);
        if (acc == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        try {
            if (acc.withdraw(amount)) {
                System.out.println("출금 완료. 현재 잔고: " + acc.getBalance());
            } else {
                System.out.println("출금 실패 (금액이 음수이거나 잔액 부족)");
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력 가능합니다.");
        }
    }
}

