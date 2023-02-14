package com.zoo;

public class Zoo {
    // public 만 접근이 가능하다
    public void tiger() {
        System.out.println("호랑이");
    }

    // 접근 불가
    protected void giraffe() {
        System.out.println("기린");
    }

    // 접근 불가
    void elephant() {
        System.out.println("코끼리");
    }

    // 접근 불가
    private void lion() {
        System.out.println("사자");
    }
}
