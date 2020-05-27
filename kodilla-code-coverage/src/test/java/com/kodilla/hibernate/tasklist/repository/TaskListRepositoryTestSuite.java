package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: TaskLists";

    @Test
    public  void testFindByListName() {
        //given
        TaskList taskList = new TaskList("ToDo", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //when
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);

        //then
        Assert.assertEquals(1, readTaskList.size());

        //cleanUp
        int id = readTaskList.get(0).getId();
        taskListRepository.existsById(id);
    }

    @Test
    public void testTaskListRepositorySaveWithTasks() {
        //given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("New list", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //when
        taskListRepository.save(taskList);
        int id = taskList.getId();

        //then
        Assert.assertNotEquals(0, id);

        //cleanUp
        taskListRepository.deleteById(id);
    }


}
