package xyz.skycat.work.crudtool.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import xyz.skycat.work.crudtool.Main;

/**
 * Created by SS on 2016/07/18.
 */
public class FxApp extends Application {

    TextField sqlDirTField;
    TextField outTsvTField;

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
            String f = sqlDirTField.getText();
            String o = outTsvTField.getText();
            Main.main(f, o);
        });

        // Pane
        FlowPane pane = new FlowPane();
        pane.getChildren().add(sqlDirExplain);
        pane.getChildren().add(sqlDirTField);
        pane.getChildren().add(outTsvExplain);
        pane.getChildren().add(outTsvTField);
        pane.getChildren().add(parseBtn);

        // Scene
        Scene scene = new Scene(pane);

        // Stage
        stage.setScene(scene);
        stage.show();
    }

}
