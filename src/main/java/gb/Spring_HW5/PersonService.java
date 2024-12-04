package gb.Spring_HW5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        personRepository.save(new Person(null, "Андрей", 28));
        personRepository.save(new Person(null, "Борис", 30));
        personRepository.save(new Person(null, "Влад", 19));
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).get();
    }
}
