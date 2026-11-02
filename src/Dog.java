public class Dog extends Animals {

    @Override
    public void speak() {
        System.out.println(name + " says Woof");
    }

    public void fetch(String item){
        System.out.println(name + " fetched the " + item);
    }
}
