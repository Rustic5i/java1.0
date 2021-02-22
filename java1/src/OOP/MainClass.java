package OOP;

import OOP.animal.Animal;

public class MainClass {
    public static void main(String[] args) {

        Cat c1 = new Cat("Murka",6, "black");
       // Cat c = new Cat ("Barsik", 5, "red");
       // c.setAge(8);
       // Cat c1 = new Cat(c);

       // c.PrintInfo();
       // c1.PrintInfo();
        Sigletone q1 = new Sigletone("Rus");
        Sigletone q2 = new Sigletone("Andry");

        q1.PrintInfo();
        q2.PrintInfo();
        Animal.add(1);
        Animal.add(1,2,3);
        Animal.add(1,2,3,4.5);
        c1.voic();



        Workman [] arrayWorkman = new Workman[5];
        arrayWorkman[0]= new Workman("Ruslan","programist",25);
        arrayWorkman[1]= new Workman("Oleg","programist",30);
        arrayWorkman[2]= new Workman("Masha","programist",45);
        arrayWorkman[3]= new Workman("Andrey","programist",55);
        arrayWorkman[4]= new Workman("Radik","programist",56);

        for (int i = 0; i < arrayWorkman.length; i++) {
            arrayWorkman[i].FilterMan();
            }
        arrayWorkman[1].voic();

        }


      //  Cat [] cats = new Cat[3];
       // cats[0] = new Cat("Tim", 1,"BLACK");
        //cats[1] = new Cat("Tim2", 1,"BLACK");
        //cats[2] = new Cat("Tim3", 1,"BLACK");
        //for (int i = 0; i < cats.length; i++) {
          //  cats[i].PrintInfo();
        //}
        //for (Cat c : cats) {
          //  c.PrintInfo();
      //  }



        //c.PrintInfo();

       // System.out.println(Cat.catCounter);

   // }
}
