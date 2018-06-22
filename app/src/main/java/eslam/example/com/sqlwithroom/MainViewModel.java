package eslam.example.com.sqlwithroom;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import eslam.example.com.sqlwithroom.database.AppDatabase;
import eslam.example.com.sqlwithroom.database.TaskEntry;

public class MainViewModel extends AndroidViewModel {

    private LiveData<List<TaskEntry>> task;

    public MainViewModel(@NonNull Application application) {
        super(application);
        AppDatabase database = AppDatabase.getsInstance(this.getApplication());
        task = database.taskDao().loadAllTasks();
    }

    public LiveData<List<TaskEntry>> getTask() {
        return task;
    }
}
