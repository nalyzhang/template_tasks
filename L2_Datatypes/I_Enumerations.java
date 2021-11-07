package L2_Datatypes;

public class I_Enumerations {
    public static void main(String[] args) {
        enum SchoolSubjects {
            Math,
            Russian,
            Informatics,
            Physics,
            English,
            German,
            Astronomy,
            Chemistry,
            Literature,
            History
        }
        SchoolSubjects lesson1 = SchoolSubjects.History;
        SchoolSubjects lesson2 = SchoolSubjects.Literature;
        SchoolSubjects lesson3 = SchoolSubjects.Literature;
        SchoolSubjects lesson4 = SchoolSubjects.Math;
        SchoolSubjects lesson5 = SchoolSubjects.Math;
        SchoolSubjects lesson6 = SchoolSubjects.Physics;
        SchoolSubjects lesson7 = SchoolSubjects.English;
        System.out.println("Расписание уроков");
        System.out.println("1. " + lesson1);
        System.out.println("2. " + lesson2);
        System.out.println("3. " + lesson3);
        System.out.println("4. " + lesson4);
        System.out.println("5. " + lesson5);
        System.out.println("6. " + lesson6);
        System.out.println("7. " + lesson7);
    }
}
