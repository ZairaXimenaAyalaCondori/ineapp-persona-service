package pe.ineapp.ineapppersonaservice.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Person> getAll(){

        LocalDate date = LocalDate.of(1992, Month.SEPTEMBER, 5);

        Person person = Person.builder()
                .id(1L)
                .name("Eduardo")
                .lastname("Zuñiga")
                .dni("75142657")
                .email("abc@isil.pe")
                .birthDate(date).build();

        return List.of(person);
    }

    @RequestMapping("/getbyid") //para poner que recurso va a ser
    public Person getById(){
        LocalDate date = LocalDate.of(1992, Month.SEPTEMBER, 5);

        Person person = Person.builder()
                .id(1L)
                .name("Eduardo")
                .lastname("Zuñiga")
                .dni("75142657")
                .email("abc@isil.pe")
                .birthDate(date).build();
        return person;
    }
}
