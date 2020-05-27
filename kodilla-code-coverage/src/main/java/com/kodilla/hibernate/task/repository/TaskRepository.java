package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

//w nawiasach podajemy dyp danych, ktrego dot kontroler repozytorium oraz typ danych uzywanych jako identyfikator, czyli klucz główny encji
// klucz musi byc obiektem, stad Integer

@Repository // interfejs jest Beanem
@Transactional
// metoda ma wyszukac task po czasie jego trwania
public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
