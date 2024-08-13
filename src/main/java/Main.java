import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем людей
        Person john = new Person("John Doe", "1950-01-01", null);
        Person jane = new Person("Jane Doe", "1955-02-02", null);
        Person child1 = new Person("Child One", "1980-03-03", null);
        Person child2 = new Person("Child Two", "1982-04-04", null);

        // Создаем дерево и добавляем людей
        FamilyTree familyTree = new FamilyTree();
        familyTree.addPerson(john);
        familyTree.addPerson(jane);
        familyTree.addPerson(child1);
        familyTree.addPerson(child2);

        // Устанавливаем родственные связи
        john.addChild(child1);
        john.addChild(child2);
        jane.addChild(child1);
        jane.addChild(child2);

        // Получаем всех детей Джона
        List<Person> johnsChildren = john.getChildren();
        for (Person child : johnsChildren) {
            System.out.println(child.getName());
        }

        // Получаем всех потомков Джона
        List<Person> johnsDescendants = familyTree.getDescendants(john);
        for (Person descendant : johnsDescendants) {
            System.out.println(descendant.getName());
        }
    }
}

