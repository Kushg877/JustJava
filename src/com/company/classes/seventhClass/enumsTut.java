package com.company.classes.seventhClass;

public class enumsTut {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        //  These are enum constants
        // public,static and final
        // since its final you cannot create child constants
        // type is Week
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Friday;

        Week[] values = Week.values();
        for (int i = 0 ; i < values.length; i++) {
            Week day = values[i];
            System.out.println(day);
        }
    }
}
