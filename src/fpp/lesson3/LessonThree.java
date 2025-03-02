package fpp.lesson3;

enum Size {
    SMALL,
    MEDIUM,
    LARGE
}

public class LessonThree {
    static int count = 0;
    //    int count = 0;
    String name;

    LessonThree(String name) {
        count++;
        this.name = name;
    }

    public static void main(String[] args) {
        LessonThree instance = null;
        for (int i = 0; i < 5; i++) {
            instance = new LessonThree("John " + i);
        }
        System.out.println("count: " + instance.getCount());
    }

    public String getCount() {
        return "Name: " + this.name + ", Count: " + LessonThree.count;
    }

}




