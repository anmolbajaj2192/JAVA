import javax.swing.plaf.synth.SynthSpinnerUI;

public class OOPS{
    public static void main(String args[]){  //Complier main function par he ayega

/*         Pen p1 = new Pen(); //created a pen object as p1
        
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Red";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount(); //Created an object
        myAcc.username="Shradhakapra";  //set---->username
     //   myAcc.password="abcdefgi";      //set---->password (see the error)

        myAcc.setPassword("abcdefghi");
 */

        Tuna shortfish = new Tuna();
        shortfish.fins = 5;
        System.out.println(shortfish.fins);

        Tuna tailTuna = new Tuna();
        tailTuna.tailsize = 10;
        System.out.println(tailTuna.tailsize);

        Human anmol = new Human();
        anmol.brain();

        Peacock green = new Peacock();
        green.legs();

    }
}

/* class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd) //Funtion create
    {
        password=pwd;
    }

}

class Pen{  //blueprint bana diya pen ka  >>>> Pen-->Object
//Properties + Functions
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;  //Properties
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int math){ //Function
        percentage=(phy+chem+math)/3;

  
    }
}
 */
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}

    class Tuna extends Fish{
    int tailsize;
    void size(){
        System.out.println("small in size");
    }
}

class Shark extends Fish{

    void size(){
        System.out.println("large in size");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}

class Peacock extends Bird{
    void legs(){
        System.out.println("short legs");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Dog extends Mammals{
    void bark(){
        System.out.println("Barks");
    }
}

class Cat extends Mammals{
    void meow(){
        System.out.println("meows");
    }
}

class Human extends Mammals{
    void brain(){
        System.out.println("humans have BRAINS");
    }
}





 