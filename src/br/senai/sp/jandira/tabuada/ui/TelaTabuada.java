package br.senai.sp.jandira.tabuada.ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        stage.setHeight(600);
        stage.setWidth(500);
        stage.setTitle("Tabuada");
        stage.setResizable(false);


//        header
        VBox header = new VBox();
        Label lblTitulo = new Label("Tabuada");
        Label lblTexto = new Label("Crie a Tabuada que a sua imaginação mandar");
        header.getChildren().addAll(
                lblTitulo,
                lblTexto
        );
        header.setStyle("-fx-background-color: #3b3b3b; -fx-padding: 10;");
        lblTitulo.setStyle("-fx-font-size: 18px; -fx-text-fill: #c9c9c9");
        lblTexto.setStyle("-fx-font-size: 14px; -fx-text-fill: #c9c9c9");

//        tabela
        GridPane gridFormulario = new GridPane();
        Label lblMultiplicando = new Label("Multiplicando:");
        Label lblMenorMultiplicador = new Label("Menor Multiplicador:");
        Label lblMaiorMultiplicador = new Label("Maior Multiplicador:");
        TextField tfMultiplicador = new TextField();
        TextField tfMenorMultiplicador = new TextField();
        TextField tfMaiorMultiplicador = new TextField();
        gridFormulario.add(lblMultiplicando,0,0);
        gridFormulario.add(tfMultiplicador, 1, 0);
        gridFormulario.add(lblMenorMultiplicador,0,1);
        gridFormulario.add(tfMenorMultiplicador, 1, 1);
        gridFormulario.add(lblMaiorMultiplicador,0,2);
        gridFormulario.add(tfMaiorMultiplicador, 1, 2);

        gridFormulario.setStyle("-fx-background-color: #707070; -fx-alignment: CENTER; -fx-font-size: 15px; -fx-padding: 15 0 15 0; ");
        gridFormulario.setHgap(10);
        gridFormulario.setVgap(10);
        lblMultiplicando.setStyle("-fx-text-fill: #ffffff");
        lblMenorMultiplicador.setStyle("-fx-text-fill: white");
        lblMaiorMultiplicador.setStyle("-fx-text-fill: white");


//        botões
        HBox boxButtons = new HBox();
        Button btnCalcular = new Button("Calcular");
        Button btnLimpar = new Button("Limpar");
        Button btnSair = new Button("Sair");
        boxButtons.getChildren().addAll(
                btnCalcular,
                btnLimpar,
                btnSair
        );
        boxButtons.setStyle("-fx-background-color: #707070; -fx-alignment: CENTER; -fx-padding: 15 0 15 0; -fx-font-size: 15px;");
        boxButtons.setSpacing(10);
        btnCalcular.setPrefWidth(100);
        btnLimpar.setPrefWidth(100);
        btnSair.setPrefWidth(100);


//      resultado
        VBox boxResultado = new VBox();
        Label lblTabuada = new Label("Tabuada");

        ListView lvResultado = new ListView();
        String[] tabuadas = new String[5];
        tabuadas[0] = "Tabuada";
        tabuadas[1] = "Multiplicador";
        tabuadas[2] = "Menor Multiplicador";
        tabuadas[3] = "Maior Multiplicador";
        tabuadas[4] = "Multiplicando";
        lvResultado.getItems().addAll(tabuadas);

        boxResultado.getChildren().addAll(
                lblTabuada,
                lvResultado
        );
        boxResultado.setStyle("-fx-background-color: #707070; -fx-padding: 0 50 10 50;");
        lblTabuada.setStyle("-fx-text-fill: white; -fx-font-size: 18px");
        lvResultado.setStyle("-fx-background-color: #5b5b5b; -fx-border-color: #3b3b3b; -fx-border-width: 3px; -fx-font-size: 15px");

        //        Componente raiz
        VBox root = new VBox();
        root.getChildren().addAll(
                header,
                gridFormulario,
                boxButtons,
                boxResultado
        );

        root.setStyle("-fx-background-color: #3b3b3b");
        root.setStyle("-fx-padding: 10px;");

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}