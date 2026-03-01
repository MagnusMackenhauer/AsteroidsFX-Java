package dk.sdu.cbse;

import dk.sdu.cbse.common.GameData;
import dk.sdu.cbse.common.services.IEntityProcessingService;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Game {

    private final GameData gameData = new GameData();
    private final Pane gameWindow = new Pane();

    public void start(Stage window) {
        gameWindow.setPrefSize(gameData.getDisplayWidth(), gameData.getDisplayHeight());

        Scene scene = new Scene(gameWindow);

        window.setScene(scene);
        window.setTitle("Asteroids");
        window.setResizable(false);
        window.show();
    }
    /*
    private final GameData gameData = new GameData(); // screensize and keys

    private final World world = new World(); //list of entities

    private final Map<Entity, Polygon> polygons = new ConcurrentHashMap<>();

    private final Pane gameWindow = new Pane();

    private final List<IGamePluginService> gamePluginServices;

    private final List<IEntityProcessingService> entityProcessingServiceList;

    private final List<IPostEntityProcessingService> postEntityProcessingServices;

    Game(List<IGamePluginService> gamePluginServices, List<IEntityProcessingService> entityProcessingServiceList, List<IPostEntityProcessingService> postEntityProcessingServices) {
        this.gamePluginServices = gamePluginServices;
        this.entityProcessingServiceList = entityProcessingServiceList;
        this.postEntityProcessingServices = postEntityProcessingServices;
    }

    Text text = new Text(10, 20, "Destroyed asteroids: 0");
    gameWindow.setPrefSize(gameData.GetDisplayWidth(), gameData.getDisplayHeight());
    gameWindow.GetChildren().add(text);

    Scene scene = new Scene(gameWindow);
        scene.setOnKeyPressed(event -> {
        if (event.getCode().equals(KeyCode.A)) {
            gameData.getKeys().setKey(GameKeys.LEFT, true);
        }
        if (event.getCode().equals(KeyCode.D)) {
            gameData.getKeys().setKey(GameKeys.RIGHT, true);
        }
        if (event.getCode().equals(KeyCode.W)) {
            gameData.getKeys().setKey(GameKeys.UP, true);
        }
        if (event.getCode().equals(KeyCode.S)) {
            gameData.getKeys().setKey(GameKeys.DOWN, true);
        }
        if (event.getCode().equals(KeyCode.SPACE)) {
            gameData.getKeys().setKey(GameKeys.SPACE, true);
        }
    });
        scene.setOnKeyReleased(event -> {
        if (event.getCode().equals(KeyCode.LEFT)) {
            gameData.getKeys().setKey(GameKeys.LEFT, false);
        }
        if (event.getCode().equals(KeyCode.RIGHT)) {
            gameData.getKeys().setKey(GameKeys.RIGHT, false);
        }
        if (event.getCode().equals(KeyCode.UP)) {
            gameData.getKeys().setKey(GameKeys.UP, false);
        }
        if (event.getCode().equals(KeyCode.SPACE)) {
            gameData.getKeys().setKey(GameKeys.SPACE, false);
        }

    });

     */
}
