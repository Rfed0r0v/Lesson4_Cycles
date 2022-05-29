public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
       int i = 0;
        while (i<10){
            i++;
            System.out.print(i+ " ");
        }
        System.out.println();
        for (;i>0;i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nЗадание 2");
        int j = 3;
        for (;j<32;j=j+7){
            System.out.println("Сегодня пятница, "+j+" число. Необходимо подготовить отчет.");
        }
        System.out.println("\nЗадание 3");
        int year = 2021;
        for (int yearCycle = 1896; yearCycle < year + 100; yearCycle = yearCycle + 79){
            System.out.println(yearCycle);
        }

    }


}