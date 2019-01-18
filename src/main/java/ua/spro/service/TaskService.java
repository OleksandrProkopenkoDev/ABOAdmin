package ua.spro.service;

import javafx.collections.ObservableList;
import ua.spro.entity.client.Client;
import ua.spro.entity.client.History;
import ua.spro.entity.task.Task;

public interface TaskService {

    Integer save(Task task);

    Task getById(Integer id);

    boolean update(Task task);

    boolean updateDone(Task task);

    boolean delete(Task task);

    ObservableList<Task> getAll();

    boolean saveLink(History history, Task task);

    ObservableList<Task> getByClient(Client client);
}
