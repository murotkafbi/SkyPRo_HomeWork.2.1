import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a=1;
        System.out.println("Значение переменой а с типом int равно " + a );
        byte b =127;
        System.out.println("Значение переменой b с типом byte равно " + b );
        short c = 1024;
        System.out.println("Значение переменой c с типом short равно " + c);
        long d = 1000000;
        System.out.println("Значение переменой d с типом long равно " + d );
        float e =3.6f;
        System.out.println("Значение переменой e с типом float равно " + e );
        double f = 5.56594;
        System.out.println("Значение переменой f с типом double равно " + f );
        // Задача 2
        System.out.println("Задача 2 ");
        byte cat = 67;
        System.out.println("Значение переменой cat с типом byte равно " + cat);
        short dog = 569;
        System.out.println("Значение переменой dog с типом short равно " + dog );
        int bired = 27897;
        System.out.println("Значение переменой bired с типом ing равно " + bired );
        long flowers = 98767549;
        System.out.println("Значение переменой flowers с типом flowers равно " + flowers );
        float yellow = 27.12f;
        System.out.println("Значение переменой yellow с типом yellow равно " + yellow );
        double green = 2.786;
        System.out.println("Значение переменой green с типом green равно " + green);
        short dogDog = -159;
        System.out.println("Значение переменой dogDog с типом dogDog равно " + dogDog );
        // Задача 3
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int secondClass = 27;
        int thidrd= 30;
        int count= 480;

        int total= pupilsInFirstClass + secondClass + thidrd;
        int papers=count/total;
        System.out.println("На каждого ученика расчитано " + papers+ " листов бумаги ");
        // Задача 4
        System.out.println("Задача 4");
        int bottels = 16;
        int minutes = 2;
        int allTime = bottels / minutes;
        int bottelsPer20minutes = allTime * 20;
        int bottelsHoures = bottelsPer20minutes * 3;
        int bottelPerDay =bottelsHoures * 24;
        int bottlePer3days = bottelPerDay * 3;
        int bottlePerMonth = bottlePer3days * 10;
        System.out.println("За 20 м машина произвела " + bottelsPer20minutes + " штук бутылок");
        System.out.println("За 1 час  машина произвела " + bottelsHoures + " штук бутылок");
        System.out.println("За 3 д  машина произвела " + bottlePer3days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");
        // Задание 5
        System.out.println("Задание 5");
        int totalCans = 120;
        int white = 2;
        int brown = 4;
        int totalClasses = totalCans / (white+brown);
        int totalWhite = white * totalClasses;
        int totalBrown = brown * totalClasses;
        System.out.println("В школе где " +totalClasses+" классов,нужно "+totalWhite+" банок белой краски и " + totalBrown + " банок кориченовой краски");
    // Задание 6
        System.out.println("Задание 6 ");
        int banana = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        int weightBananaUnit = 80;
        int weightMilkUnit =  105 ;
        int weightIceCreamUnit = 100 ;
        int weightEggsUnit = 70 ;
        int totalWeightInGrams = banana * weightBananaUnit + milk * weightMilkUnit + iceCream * weightIceCreamUnit + eggs * weightEggsUnit;
       double totalWeightKg = totalWeightInGrams / 1_000D;
        System.out.println("Общий вес в граммах "+ totalWeightInGrams + ",в кг " + totalWeightKg);
        // Задание 7
        System.out.println("Задание 7");
        int weightForLossInGram = 7_000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double maxDayCount=(double)  weightForLossInGram /lossWeightPerDayMin;
        double minDayCount= (double) weightForLossInGram / lossWeightPerDayMax;
        double lossWeightPerDayAverage = (lossWeightPerDayMin + lossWeightPerDayMax) / 20 ;
        double averageDaysCount = weightForLossInGram / lossWeightPerDayAverage;
        System.out.println("Минимальное кол-во дней  для похудания " + minDayCount );
        System.out.println("Максимальое  кол-во дней  для похудания " + maxDayCount );
        System.out.println("Среднее кол-во дней  для похудания " + averageDaysCount );
        // Задание 8
        System.out.println("Задаине 8");
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        double procent = 1.1;
        double mashaNewCash= masha * procent;
        double denisNewCash= denis * procent;
        double kristinaNewCash= kristina * procent;
        double mashaYear= 12 * mashaNewCash;
        double mashaAll=12* masha;
        double denisYear= 12 * denisNewCash;
        double denisAll= 12 * denis;
        double kristinaYear = 12 *kristinaNewCash;
        double kristinaAll = 12 *kristina;
        System.out.println("Маша теперь получает " +mashaNewCash + " рублей. Годовой доход вырос на "+ (mashaYear-mashaAll) + "Рублей ");
        System.out.println("Денис  теперь получает " +denisNewCash + " рублей. Годовой доход вырос на "+ (denisYear-denisAll) + "Рублей ");
        System.out.println("Кристина  теперь получает " +kristinaNewCash + " рублей. Годовой доход вырос на "+ (kristinaYear-kristinaAll) + "Рублей ");


    }
}