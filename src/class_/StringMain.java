package src.class_;

public class StringMain {
    public static void main(String[] args) {
        String a = "apple"; //literal 생성 가능 new 필요없음
        String b = "apple";
    
        if(a==b){
            System.out.println("참조값 : a=b");
        }
        else{
            System.out.println("참조값 : a!=b");
        }
        if(a.equals(b)){
            System.out.println("문자열 : a=b");
        }
        else{
            System.out.println("문자열 : a!=b");
        }
        
        String c = new String("apple");
        String d = new String("apple");
        if(c==d){
            System.out.println("참조값 : c=d");
        }
        else{
            System.out.println("참조값 : c!=d");
        }
        if(c.equals(d)){
            System.out.println("문자열 : c=d");
        }
        else{
            System.out.println("문자열 : c!=d");
        }

        String e = "오늘 날짜는"+2023+2+10;
        System.out.println("e = "+e);

        System.out.println("문자열의 크기 : "+e.length());

        for(int i = 0 ; i <e.length();i++){
            System.out.print(i +":"+ e.charAt(i)+"  ");
        }
        System.out.println();
        System.out.println("부분 문자열 추출 = "+e.substring(7,11));
        System.out.println("부분 문자열 추출 = "+e.substring(7,11));
        
        System.out.println("대문자 변경= " +"Hello".toUpperCase());
        System.out.println("소문자 변경= " +"Hello".toLowerCase());
        
        System.out.println("문자열 검색 = "+e.indexOf("짜"));
        System.out.println("문자열 검색 = "+e.indexOf("날짜"));
        System.out.println("문자열 검색 = "+e.indexOf("개발"));
        
        System.out.println("문자열 치환 = "+e.replace("날짜","일짜"));
    }
}
