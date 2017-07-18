package com.company;

public class Main {

    public static void main(String[] args) {
        for (int a=1;a<6;a++){
            for (int b=0;b<10-a;b++){
                System.out.printf(" ");
            }
            for (int c=0;c<a;c++){
                System.out.printf("* ");
            }
            System.out.println("");
        }
        for (int d=1;d<10;d++){
            for (int e=0;e<6;e++){
                System.out.printf(" ");
            }
            for (int f=0;f<4;f++){
                System.out.printf("* ");
            }
            System.out.println("");
        }
        for (int g=1;g<4;g++){
            for (int h=0;h<2+g;h++){
                System.out.printf(" ");
            }
            for (int i=0;i<8-g;i++){
                System.out.printf("* ");
            }
            System.out.println("");
        }
        for (int j=1;j<5;j++){
            for (int k=0;k<6;k++){
                System.out.printf(" ");
            }
            for (int l=0;l<4;l++){
                System.out.printf("* ");
            }
            System.out.println("");
        }
    }
}
