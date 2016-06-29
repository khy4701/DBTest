package Login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import DBCollection.Database;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class controller_login implements Initializable{

	@FXML private TextField id_txtField;
	@FXML private PasswordField pw_PwField;

	@FXML private Button btnLogin;
	@FXML private Button btnAssign;
	@FXML private Button btnCancel;
	
	private Database db ;

	
	private Stage primaryStage;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		db = new Database();
		btnLogin.setOnAction(event->btnLoginAction());
	}
	
	public void btnLoginAction()
	{
		if( db.CheckIsUser( id_txtField.getText(), pw_PwField.getText()))
		{
			//System.out.println("로그인 됨");
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);   // Modal ����( ���� â�� ��� ) 
			dialog.initOwner(primaryStage);
									
			AnchorPane anchorPane;
			try {
				anchorPane = (AnchorPane) FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
				
//				Label txtTitle = (Label) anchorPane.lookup("#txtTitle");
//				txtTitle.setText("Ȯ���ϼ̽��ϱ�"); 
//				
//				Button btnOk = (Button) anchorPane.lookup("#btnOk");
//				btnOk.setOnAction(event->dialog.close());
				
				Scene scene = new Scene(anchorPane);
				dialog.setScene(scene);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			dialog.setResizable(false);
			dialog.show();
			
		}
	}
	
	public void btnAssignAction()
	{
		//db.AddUserInfo(id, pw, ip, port);
	}
	
	public void btnCancelAction()
	{
		Platform.exit();
	}
	
	public void setPrimaryStage(Stage primaryStage)
	{
		this.primaryStage = primaryStage;
	}
}
