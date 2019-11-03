package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Truck truck = new Truck(2018,"Toyota", "Tacoma",Color.Black, new TrucksCharecteristics(6,EngineType.FOUR_CYLINDER,GearType.Automatic,Doors.Four,TruckType.PickUP,WheelDrive.ALL_WHEEL_DRIVE));
        truck.toString();
    }
}
