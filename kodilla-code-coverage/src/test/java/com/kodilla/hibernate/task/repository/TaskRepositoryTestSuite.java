package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
// adnotacje sa potzrebne gdyz przed uruchomieniem testów musi byc zainicjowany kontener Springa
//pole Taskrepository taskRepository przechowuje referencję do kontrolera repozytorium
public class TaskRepositoryTestSuite {

    @Autowired
    private TaskRepository taskRepository;

    // dodajemy stałą
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void taskTaskRepositorySave() {
        //given
        // tworzymy obiekt klasy Task, który jako description ma ustawioną wartość określona przez stałą DESCRIPTION
        Task task = new Task(DESCRIPTION, 7);

        //when
        // tu odbywa sie właściwy test czyli wywołanie metody save(T entiity) interfejsu kontrolera repozytorium
        // oczekujemy, że po tej operacji w bazie danych zostanie zapisany obiekt task
        taskRepository.save(task);

        //then
        // sprawdzamy czy operacja sie powiodła - sprawdzamy jaki identyfikator został nadany obiektowi task przez wywołanie gettera getId()
        // za pomocą metody findById z konrtolera repozytorium pobieramy obiekt o wskazanym id
        // metoda zwraca Optional<Task>
        int id = task.getId();
        Optional<Task> readTask = taskRepository.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //cleanUp
        // sprzątamy po teście, testy musza byc idempotentne czyli stan systemu musi byc taki jak przed wykonaniem testów
        taskRepository.deleteById(id);
    }

    // test sprawdzający czy metoda kontrolera repozytorium działa pomimo:
    // braku implementacji metody
    // i braku powołania do zycia obiektu implementującego interfejs TaskRepository
    // wszystkim tym zajęły się Hibernate i SpringBoot
    @Test
    public void testTaskRepositoryFindByDuration() {
        //given
        //tworzymy obiekt task, zapisujemy go w bazie i zapamiętujemy ile wynosi
        Task task = new Task(DESCRIPTION, 7);
        taskRepository.save(task);
        int duration = task.getDuration();

        //when
        List<Task> readTasks = taskRepository.findByDuration(duration);

        //then
        Assert.assertEquals(1, readTasks.size());

        //cleanUp
        int id = readTasks.get(0).getId();
        taskRepository.deleteById(id);
    }

    @Test
    public void testTaskRepositorySaveWithFinancialDetails() {
        //given
        // tworzymy nowy obiekt klasy Task,
        // a nastepnie do jego właściwości taskFinancialDetails przypisywany jest nowy obiekt klasy TaskFinancialDetails
        Task task = new Task(DESCRIPTION, 30);
        TaskFinancialDetails financialDetails = new TaskFinancialDetails(new BigDecimal(120), false);
        task.setTaskFinancialDetails(financialDetails);

        //when
        // wywołujemy metodę save(Task task) kontrolera repozytorium
        // zapamiętujemy id który został nadany obiektowi klasy Task przez Hibernata
        taskRepository.save(task);
        int id = task.getId();

        //then
        Assert.assertNotEquals(0, id);

        //cleanUp
        taskRepository.deleteById(id);
    }

}
