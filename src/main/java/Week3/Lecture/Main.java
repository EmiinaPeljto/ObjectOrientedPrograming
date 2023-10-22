package Week3.Lecture;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.Character.getName;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataStructures data = new DataStructures();
        DbConnect db=new DbConnect();

        //1.getALL
        List<User> allUsers = data.getAll();
        for (User user : allUsers) {
            System.out.println(user.getName() + " " + user.getGender() + " " + user.getAge());
        }

        //2.getByName
        Optional<User> userOptional = data.getByName("Emina");
        if (userOptional.isPresent()) {
            User findUser = userOptional.get();
            System.out.println(findUser);
        } else {
            System.out.println("User not found");
        }

        //3.findAgeGreaterThan
        List<User> userAbove = data.findAgeGreaterThan(105);
        for (User user : userAbove) {
            System.out.println(user.getName()+" "+user.getAge());
        }

        //4.multiplyAge
        List<Integer> ma=data.multiplyAge();
        for (Integer number:ma){
            System.out.print(number+" ");
        }
        System.out.println();

        //5.multiplyAgeAndPrint
        data.multiplyAgeAndPrint();
        System.out.println();

        //6.multiplyAgeReturnUserAndPrint
        List<User> setMultiplyAge=data.multiplyAgeReturnUserAndPrint();
        for (User u:setMultiplyAge){
            System.out.print(u.getAge()+" ");
        }
        System.out.println();

        //7.getbyGender
        data.getbyGender(Gender.MALE);

        //8.getAllCustomers
        db.getAllCustomers();
        System.out.println();

        //9.getCustomerById
        db.getCustomerById(335);

    }

}
