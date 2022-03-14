package dk.via.mvvm.view;

import dk.via.mvvm.viewmodel.ViewModelFactory;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class ViewHandler {
    public static final String CREATE = "create";
    public static final String MESSAGE = "message";

    private final Scene currentScene;
    private Stage primaryStage;
    private final ViewFactory viewFactory;

    public ViewHandler(ViewModelFactory viewModelFactory) {
        this.viewFactory = new ViewFactory(this, viewModelFactory);
        this.currentScene = new Scene(new Region());
    }

    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        openView(CREATE);
    }

    public void openView(String id) {
        Region root = switch (id) {
            case CREATE -> viewFactory.loadCreateAccountView();
            case MESSAGE -> viewFactory.loadMessageView();
            default -> throw new IllegalArgumentException("Unknown view: " + id);
        };
        currentScene.setRoot(root);
        if (root.getUserData() == null) {
            primaryStage.setTitle("");
        } else {
            primaryStage.setTitle(root.getUserData().toString());
        }
        primaryStage.setScene(currentScene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public void closeView() {
        primaryStage.close();
    }
}
