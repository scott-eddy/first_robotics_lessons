public interface IAnimal {
    public String speak();
}

class Cat implements IAnimal {
    public String speak() {
        return "Meow";
    }
}

class Dog implements IAnimal {
    public String speak() {
        return "Bark";
    }
}

class FrenchCat extends Cat {
    @Override
    public String speak() {
        return "How you say, Le " + super.speak();
    }
}

