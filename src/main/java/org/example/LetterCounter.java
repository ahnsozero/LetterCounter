package org.example;


/**
 * 입력된 문자열에서 문자의 개수를 반환합니다.
 *
 * @param input 사용자한테 입력받은 문자열
 * @return 입력받은 문자의 개수를 반환
 */
public class LetterCounter {

    public static int countLetters(String input) {
        if (input == null)
            return 0;

        return input.length();
    }
}
