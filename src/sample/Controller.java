package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import pokemon.MatchChecker;
import pokemon.PokemonTypes;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable{

    @FXML
    public GridPane gridButtons;

    private Map<String, Integer> nameMap = new HashMap<>();

    @FXML
    private TextArea textArea;

    @FXML
    protected void handleNormalButton(ActionEvent event){
        if (event.getSource() instanceof Button){
            Button button = (Button) event.getSource();
            String name = button.getId().substring(6);
            Integer count = nameMap.getOrDefault(name, 0);

            button.setText(name + " [" + ++count + "]");
            nameMap.put(name, count);
        }
    }

    @FXML
    protected void handleCalcAttackButton(ActionEvent event){
        MatchChecker matchChecker = new MatchChecker();
        List<PokemonTypes> types = new ArrayList<>();

        nameMap.forEach((s, integer) -> {
            PokemonTypes pokeType = PokemonTypes.getByName(s);
            for (int i = 0; i < integer; i++) {
                types.add(pokeType);
            }
        });

        matchChecker.checkMatches(types.toArray(new PokemonTypes[0]));
        List<String> result = matchChecker.getMessages();

        textArea.setVisible(true);
        textArea.clear();

        for (String s : result) {
            textArea.appendText(s + "\n");
        }

    }
    @FXML
    protected void handleButtonClear(ActionEvent event){
        textArea.clear();
        textArea.setVisible(false);
        nameMap.clear();

        gridButtons.getChildren().forEach(node -> {
            if (node instanceof Button){
                Button button = (Button) node;
                String name = button.getId().substring(6);
                button.setText(name + " [" + 0 + "]");
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
