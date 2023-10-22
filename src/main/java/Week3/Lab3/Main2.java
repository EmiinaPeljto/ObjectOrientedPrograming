package Week3.Lab3;

import java.sql.SQLException;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        DataStructure ds=new DataStructure();
        DataConnect dc=new DataConnect();

        //1.getAllObjects
        for (TaskItem o:ds.getAllObjects()){
            System.out.println(o.getTaskid()+", "+o.getTaskDescription()+", "+o.getStatus());
        }

        //2.getByStatus
        ds.getByStatus(taskStatus.TO_DO);

        //3.idParameterGreaterThanOrEqual
        List<TaskItem> ti=ds.idParameterGreaterThanOrEqual();
        for (TaskItem taskItem:ti){
            System.out.println(taskItem);
        }

        //4.printDescripton
       ds.printTaskDescription();
        System.out.println();

        //5.DATA
        dc.getAll();
        dc.getByStatus(taskStatus.TO_DO);
        dc.idGreaterThanTwo();
        dc.printTaskDescription();
    }
}
