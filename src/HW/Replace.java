package src.HW;
import java.util.Scanner;
// 치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
// String 클래스의 메소드를 이용하시오
// 대소문자 상관없이 개수를 계산하시오

// [실행결과]
// 문자열 입력 : aabba
// 현재 문자열 입력 : aa
// 바꿀 문자열 입력 : dd
// ddbba
// 1번 치환

// 문자열 입력 : aAbbA
// 현재 문자열 입력 : aa
// 바꿀 문자열 입력 : dd
// ddbba
// 1번 치환

// 문자열 입력 : aabbaa
// 현재 문자열 입력 : aa
// 바꿀 문자열 입력 : dd
// ddbbdd
// 2번 치환

// 문자열 입력 : AAccaabbaaaaatt
// 현재 문자열 입력 : aa
// 바꿀 문자열 입력 : dd
// ddccddbbddddatt
// 4개 치환

// 문자열 입력 : aabb
// 현재 문자열 입력 : aaaaa
// 바꿀 문자열 입력 : ddddd
// 입력한 문자열의 크기가 작습니다
// 치환 할 수 없습니다

class Case{
    String _str,now_str,replace_str;
    // 생성자
    public Case(String _str,String now_str,String replace_str){
        this._str = _str;
        this.now_str =now_str;
        this.replace_str=replace_str;
    }

    public String[] replace() {
        int count = 0;
        int tmp = 0;

        while(_str.indexOf(now_str)!=-1){
            // 입력한 문자열의 크기가 작을떄의 경우
            if(_str.length() < now_str.length()){
                tmp =1;
            }
            // 문자열 치환 하고 카운트 1
            _str=_str.replaceFirst(now_str,replace_str);
            count = count+1;
        }
        
        String cnt =Integer.toString(count);

        if(count >0){
            return new String[]{_str,cnt+"번 치환"};
        }
        else if (count == 0 && tmp ==1){
            return new String[]{"입력한 문자열의 크기가 작습니다","치환 할수없습니다."};
        }
        else{
            return new String[]{"치환 할 수 없습니다.",cnt+"번 치환"};
        }
        
    }
}

public class Replace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String _str = scan.nextLine();
        System.out.print("현재문자열 입력 : ");
        String now_str = scan.nextLine();
        System.out.print("바뀔문자열 입력 : ");
        String replace_str = scan.nextLine();
        Case case1= new Case(_str,now_str,replace_str);

        String[] ar = new String[2];
        ar =case1.replace();
        System.out.println(ar[0]);
        System.out.println(ar[1]);
    }
}
