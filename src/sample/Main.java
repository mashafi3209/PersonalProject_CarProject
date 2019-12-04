package sample;

/**
 * @author Mushfique Shafi
 * @Personal_Project Vehicle System
 * @Started October 15th 2019
 * @Finished December 2nd 2019
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {
    public static void main(String[] args) {
        //Printing truck system
        Truck truck = new Truck(2018,"Toyota", "Tacoma", Color.Black,PowerSource.Disel, 6, EngineType.FOUR_CYLINDER,
            GearType.Automatic,Doors.Four,TruckType.PickUp,WheelDrive.ALL_WHEEL_DRIVE,NoOfSeats.five,5);
        System.out.println(truck.toString());

        //Printing Sedan system
        Sedan sedan = new Sedan(2019,"Ford","Focus", Color.Red, PowerSource.Gasoline,GearType.Automatic,SedanType.Compact);
        System.out.println(sedan.toString());

        //Printing Suv system
        Suv suv = new Suv(2016,"Tesla","Model X",Color.Red,PowerSource.Electric,EngineType.Brushless_DC_Motor,GearType.Automatic,Doors.Four,SuvType.Subcompact,WheelDrive.ALL_WHEEL_DRIVE,NoOfSeats.five);
        System.out.println(suv.toString());

        //Printing the Van system
        Van van = new Van(2016,"Toyota","Sienna",Color.Red, PowerSource.Gasoline,EngineType.SIX_CYLINDER,
            GearType.Automatic,VanType.MidSize,Doors.Four,NoOfSeats.five);
        System.out.println(van.toString());


    }
}
