package gb.Spring_HW5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).get();
    }
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
