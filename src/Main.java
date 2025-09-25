public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        TalkingDog talkingDog = new TalkingDog();
        //Instead
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };


        dog.speak();
        talkingDog.speak();
        dog2.speak();
    }
}