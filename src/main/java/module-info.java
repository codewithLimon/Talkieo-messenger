module com.talkio.files.talkio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires MaterialFX;


    opens com.talkio.files.talkio.Frontend to javafx.fxml;
    exports com.talkio.files.talkio.Frontend;

    opens com.talkio.files.talkio.Frontend.welcome to javafx.fxml;
    exports com.talkio.files.talkio.Frontend.welcome;

    exports com.talkio.files.talkio.Frontend.Login;
    opens com.talkio.files.talkio.Frontend.Login to javafx.fxml;

}