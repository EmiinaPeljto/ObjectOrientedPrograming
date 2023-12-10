package Week10.Lab.Task1;

import Week10.Lab.Task1.Annotations.CanSendMessage;
import Week10.Lab.Task1.Annotations.RequiresPermission;
import Week10.Lab.Task1.Annotations.UserPermission;

public class TheMessagingSystem {
    @CanSendMessage
    @RequiresPermission(adminPermission = true)
    public static void sendMessage(Object object, String message){
        if(object.getClass().isAnnotationPresent(UserPermission.class)){
            UserPermission up=object.getClass().getAnnotation(UserPermission.class);
            if(up.adminPermission()){
                System.out.println("Message from admin: "+message);
            }else{
                System.out.println("You are not allowed to send messages");
            }
        }
    }
}

