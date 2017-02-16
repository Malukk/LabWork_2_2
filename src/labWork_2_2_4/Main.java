package labWork_2_2_4;

/**
 * Created by Bulik on 14.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        String [] arrGender={"Man", "Women"};
        String [] arrFirstName={"Василь", "Іван", "Симен", "Андрій", "Валінтін"};
        String [] arrLastName= {"Сидоров", "Іванов", "Петров", "Стьопочкін", "Козлов"};


        Person[] arrayP = new Person[5];
        for (int i = 0; i < arrayP.length; i++) {
            Person object = new Person();
            object.setFirstName(arrFirstName [(0 + (int) (Math.random() * ((4 - 0) + 1)))]);
            object.setLastName(arrLastName [(0 + (int) (Math.random() * ((4 - 0) + 1)))]);
            object.setAge(18 + (int) (Math.random() * ((65 - 18) + 1)));
            object.setGender(arrGender [(0 + (int) (Math.random() * ((1 - 0) + 1)))]);
            object.setPhoneNumber(670000000 + (int) (Math.random() * ((990000000 - 670000000) + 1)));
            arrayP[i] = object;
        }
        for (Person element : arrayP) {
            element.view();

        }
    }
}
