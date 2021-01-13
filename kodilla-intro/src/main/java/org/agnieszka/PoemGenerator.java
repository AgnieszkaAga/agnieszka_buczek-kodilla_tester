package org.agnieszka;

import java.util.Random;


public class PoemGenerator {


        public static void main(String[] args) {
            PoemGenerator firstWord = new PoemGenerator();
            int newWord = firstWord.getTheWordNumber();
            System.out.println(newWord);
        }

        public int getTheWordNumber() {
            Random randomGenerator = new Random();
            int wordNumber = randomGenerator.nextInt(10);

            return wordNumber;
        }

        public class Subject extends PoemGenerator {
            String[] subjects = new String[]{"on", "miłość", "świat"};
            int subLength = subjects.length;


            public class Predicate extends PoemGenerator {
            }

            public class Adverbial extends PoemGenerator {
                public class AdverbialTime extends Adverbial {
                }

                public class AdverbialPlace extends Adverbial {
                }

                public class AdverbialWay extends Adverbial {
                }
            }
        }
    }
