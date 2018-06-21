package eslam.example.com.sqlwithroom.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM tasks ORDER BY priority")
    List<TaskEntry>loadAllTasks();

    @Insert()
    void insertTask(TaskEntry taskEntry);

    @Update()
    void updateTask(TaskEntry taskEntry);

    @Delete()
    void deletTask(TaskEntry taskEntry);

}
