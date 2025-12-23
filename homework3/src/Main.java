//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println ("HW3 начало выполнения");
        // Объявляем переменные

byte a;
short b;
long c;
double d;
int e;
float f;

        System.out.println ("HW3 задача 2");

a = 126;
b = 2712;
c = 98767896L;
d = 2.786;
e = 1122233322;
f = -1.775f;

        System.out.println ("Значение переменной a с типом byte:" +  a );
        System.out.println ("Значение переменной b с типом short:" +  b );
        System.out.println ("Значение переменной c с типом long:" +  c );
        System.out.println ("Значение переменной d с типом double:" +  d );
        System.out.println ("Значение переменной e с типом int:" +  e );
        System.out.println ("Значение переменной f с типом float:" +  f );

        System.out.println ("HW3 задача 3");

byte lydmilaPavlovna = 23;
byte annaSergeevna = 27;
byte ekaterinaAndreevna = 30;
int allStudent = lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
int paperList = 480;
int listToStudent = paperList/allStudent;
// три нижних строчки пришлось заменить переменную на int, так как почему то на short выдавалось сообщение, что нужно сменить тип

        System.out.println ("На каждого ученика рассчитано " + listToStudent + " листов бумаги");

        System.out.println ("HW3 задача 4");

byte bottleQuantity = 16;
byte time16Bottle = 2;
int bottle20min = (bottleQuantity/time16Bottle)*20;
int bottlePer1Hour = (bottleQuantity/time16Bottle)*60;
int bottlePer24Hour = bottlePer1Hour+24;
int bottlePer3Days = bottlePer24Hour*3;
int bottlePer1Month = bottlePer24Hour*30;

        System.out.println ("За 20 минут машина произвела " + bottle20min + " штук бутылок");
        System.out.println ("За сутки машина произвела " + bottlePer24Hour + " штук бутылок");
        System.out.println ("За 3 дня машина произвела " + bottlePer3Days + " штук бутылок");
        System.out.println ("За 1 месяц машина произвела " + bottlePer1Month + " штук бутылок");

        System.out.println ("HW3 задача 5");

byte allPaintBank = 120;
byte paintWhite = 2;
byte paintBrown = 4;
int classRooms = allPaintBank/(paintWhite+paintBrown);
int allWhiteBank = classRooms*2;
int allBrownBank = classRooms*4;

        System.out.println ("В школе, где " + classRooms + " классов, нужно " + allWhiteBank + " банок белой краски и " + allBrownBank + " банок коричневой краски");

        System.out.println ("HW3 задача 6");

byte weightBanana = 80;
short volumeMilk = 200;
int weightMilk = (105/100)*volumeMilk;
int iceCreamWeight = 2*100;
byte eggWeight = 70;
int eggToRecipe =eggWeight*4;
int sportFoodWeight = (weightBanana*5) + weightMilk + iceCreamWeight + eggToRecipe;
float sportFoodWeightKg = sportFoodWeight/1000f;

        System.out.println ("Вес спортзавтрака " + sportFoodWeight + " грамм");
        System.out.println ("Вес спортзавтрака " + sportFoodWeightKg + " килограмм");

        System.out.println ("HW3 задача 7");

short weightTarget = 7000;
int progress1 = weightTarget/250;
int progress2 = weightTarget/500;

        System.out.println ("Достижение цели по весу за " + progress1 + " дней");
        System.out.println ("Достижение цели по весу за " + progress2 + " дней");

        System.out.println ("HW3 задача 8");

int masha = 67760;
int denis = 83690;
int christina = 76230;

int mashaNewSalary = masha + ((masha*10)/100);
int denisnewSalary = denis + ((denis*10)/100);
int christinanewSalary = christina + ((christina*10)/100);

        System.out.println ("Маша теперь получает " + mashaNewSalary + " рублей, годовой доход вырос на " + (mashaNewSalary-masha) + " рублей." );
        System.out.println ("Денис теперь получает " + denisnewSalary + " рублей, годовой доход вырос на " + (denisnewSalary-denis) + " рублей." );
        System.out.println ("Кристина теперь получает " + christinanewSalary + " рублей, годовой доход вырос на " + (christinanewSalary-christina) + " рублей." );
    }
}