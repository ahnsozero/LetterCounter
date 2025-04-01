package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 생성
        System.out.println("문자를 입력해 주세요.: ");
        String text = sc.nextLine(); // 사용자한테 문자열 입력
        System.out.println("문자수: " + LetterCounter.countLetters(text));
    }
}