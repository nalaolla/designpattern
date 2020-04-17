package com.nalaolla.strategy;

import java.util.Scanner;

public class ChickenInfoEngine {
    Chicken chicken;
    int token;
    String exitToken;

    public void chickenChooser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("치킨정보시스템");
        System.out.println("-------------------");
        System.out.println();

        do {
            System.out.println("원하는 치킨의 정보를 입력하세요..");
            System.out.println("메뉴 1)후라이드 치킨, 2)갈릭치킨, 3)양념치킨, 4)오븐치킨 ");
            token = sc.nextInt();

            switch (token) {
                case 1:
                    chicken = new FriedChicken();
                    break;

                case 2:
                    chicken = new GarlicChicken();
                    break;

                case 3:
                    chicken = new SpicyChicken();
                    break;

                case 4:
                    chicken = new OvenChicken();
                    break;

            }

            chicken.cooking();

            chicken.display();

            chicken.flavor();

            chicken.number();

            System.out.println("-----------------");
            System.out.println();
            System.out.println("계속진행하시겠습니까? Y/N");
            exitToken = sc.next();
        } while (exitToken.equalsIgnoreCase("y"));

        System.out.println("종료되었습니다.");
    }
}
