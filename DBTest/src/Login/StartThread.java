package Login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartThread extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
		Parent root = loader.load();
		
		controller_login control = loader.getController();
		
		// ��Ʈ�ѷ�����  Stage�� �Ѱ��־� ��Ʈ�ѷ����� ���ο� Dialog ���� ����.
		control.setPrimaryStage(primaryStage);
		
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
	}

}
