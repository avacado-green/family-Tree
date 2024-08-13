import java.util.ArrayList;
import java.util.List;

class FamilyTree {
    private List<Person> members;

    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.members.add(person);
    }

    public Person findPersonByName(String name) {
        for (Person person : members) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getDescendants(Person person) {
        List<Person> descendants = new ArrayList<>();
        getDescendantsHelper(person, descendants);
        return descendants;
    }

    private void getDescendantsHelper(Person person, List<Person> descendants) {
        for (Person child : person.getChildren()) {
            descendants.add(child);
            getDescendantsHelper(child, descendants);
        }
    }
}