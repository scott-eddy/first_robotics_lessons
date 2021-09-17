import java.util.LinkedList;
import java.util.List;

public class ObjectOriented {
        public static void main(String[] args)
        {
            List<IAnimal> noahs_ark = new LinkedList<IAnimal>();
            noahs_ark.add(new Cat());
            noahs_ark.add(new Dog());
            noahs_ark.add(new FrenchCat());

            for(IAnimal animal : noahs_ark) {
                System.out.println(animal.speak());
            }

        }
}
