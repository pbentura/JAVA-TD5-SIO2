module com.sio.javatd5sio2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sio.javatd5sio2 to javafx.fxml;
    exports com.sio.javatd5sio2;
}