package cl.previred.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.previred.taskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}