package xyz.skycat.work.crudtool.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import xyz.skycat.work.crudtool.Argument;
import xyz.skycat.work.crudtool.Executor;
import xyz.skycat.work.crudtool.config.ConfiguratiionManager;

/**
 * Created by SS on 2016/07/18.
 */
public class FxApp extends Application {

    TextField sqlDirTField;
    TextField outTsvTField;
    Label errorLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // Component
        Label sqlDirExplain = new Label();
        sqlDirExplain.setText("解析対象SQLファイル格納ルートディレクトリをフルパスで入力：");

        sqlDirTField = new TextField();

        Label outTsvExplain = new Label();
        outTsvExplain.setText("出力TSVファイルをフルパスで入力：");

        outTsvTField = new TextField();
        outTsvTField.setText("crud.tsv");

        Button parseBtn = new Button();
        parseBtn.setText("CRUD解析！");
        parseBtn.setOnAction(actionEvent -> {
            try {
                new Executor().run(new Argument(sqlDirTField.getText(), outTsvTField.getText()), ConfiguratiionManager.getConfiguration());
            } catch (Throwable t) {
                errorLabel.setText(t.getMessage());
            }
        });

        errorLabel = new Label();

        // Pane
        VBox pane = new VBox(10d);
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.getChildren().add(sqlDirExplain);
        pane.getChildren().add(sqlDirTField);
        pane.getChildren().add(outTsvExplain);
        pane.getChildren().add(outTsvTField);
        pane.getChildren().add(parseBtn);
        pane.getChildren().add(errorLabel);

        // Scene
        Scene scene = new Scene(pane);

        // Stage
        stage.setScene(scene);
        stage.setTitle("CRUD解析ツール");
        stage.show();
    }

}
