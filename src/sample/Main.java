package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {



    public static void main(String[] args) {

        Truck truck = new Truck(2018,"Toyota", "Tacoma", VheicleType.SEDAN, Color.Black,PowerSource.Disel, 6, EngineType.FOUR_CYLINDER,
            GearType.Automatic,Doors.Four,TruckType.PickUP,WheelDrive.ALL_WHEEL_DRIVE,5);
        truck.toString();
        Sedan sedan = new Sedan(2019,"Ford","Focus",VheicleType.SEDAN, Color.Red, PowerSource.Gasoline,EngineType.FOUR_CYLINDER,GearType.Automatic,Doors.Two,SedanType.Compact);
        sedan.toString();


    }
}
