package dk.via.session4.exercise4_1.view;

import dk.via.session4.exercise4_1.viewmodel.MessageViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;

public class MessageViewController {
    @FXML public Label userCount;
    @FXML public Label lastUserInfo;
    private ViewHandler viewHandler;
    private MessageViewModel messageViewModel;
    private Region root;

    @FXML
    public void okButtonPressed() {
        viewHandler.openView(ViewHandler.GOODBYE);
    }

    @FXML
    public void continueButtonPressed() {
        viewHandler.openView(ViewHandler.CREATE);
    }

    public void init(ViewHandler viewHandler, MessageViewModel messageViewModel, Region root) {
        this.viewHandler = viewHandler;
        this.messageViewModel = messageViewModel;
        this.root = root;

        messageViewModel.bindMessage(userCount.textProperty());
        messageViewModel.bindLastUserInfo(lastUserInfo.textProperty());
    }

    public Region getRoot() {
        return root;
    }

    public void reset() {
        messageViewModel.reset();
    }
}
