package com.fatimaezzahrae.calculator;

    public class Calculator {

        public static  int add(int a, int b) {
            return a + b;
        }
        public static int divide(int opG, int opD) {
          try {
              if (opD == 0) {
                  System.out.println("Division par zéro");
              }
          } catch (Exception e) {
                System.out.println(e.getMessage());
          }

            return opG / opD ;
        }

    }


