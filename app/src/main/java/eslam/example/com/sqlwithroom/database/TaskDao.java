package eslam.example.com.sqlwithroom.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM tasks ORDER BY priority")
    LiveData<List<TaskEntry>>loadAllTasks();

    @Insert()
    void insertTask(TaskEntry taskEntry);

    @Update()
    void updateTask(TaskEntry taskEntry);

    @Delete()
    void deleteTask(TaskEntry taskEntry);

    @Query("SELECT * FROM tasks WHERE id = :id")
    TaskEntry loadTaskById(int id);
}
