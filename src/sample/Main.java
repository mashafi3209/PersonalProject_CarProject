package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {



    public static void main(String[] args) {

        Truck truck = new Truck(2018,"Toyota", "Tacoma", Color.Black,PowerSource.Disel, 6, EngineType.FOUR_CYLINDER,
            GearType.Automatic,Doors.Four,TruckType.PickUp,WheelDrive.ALL_WHEEL_DRIVE,NoOfSeats.five,5);
        System.out.println(truck.toString());
        Sedan sedan = new Sedan(2019,"Ford","Focus", Color.Red, PowerSource.Gasoline,EngineType.FOUR_CYLINDER,GearType.Automatic,SedanType.Compact);
        System.out.println(sedan.toString());

        Suv suv = new Suv(2016,"GMC","Sports",Color.Red,PowerSource.Gasoline,EngineType.SIX_CYLINDER,GearType.Automatic,Doors.Four,SuvType.Subcompact,NoOfSeats.five);
        System.out.println(suv.toString());
        Van van = new Van(2016,"GMC","NULL",Color.Red, PowerSource.Gasoline,EngineType.SIX_CYLINDER,
            GearType.Automatic,VanType.MidSize,Doors.Four,NoOfSeats.five);
        System.out.println(van.toString());


    }
}
