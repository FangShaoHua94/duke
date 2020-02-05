package core;

import command.Command;
import dukexception.DukeException;
import javafx.scene.control.Label;


/**
 * The main driver of the program.
 */
public class Duke {

    private Ui ui;
    private Common common;
    private Parser parser;

    /**
     * Constructor to initialize essential components of the program.
     */
    public Duke() {
        ui = new Ui();
        try {
            parser = new Parser();
            common = new Common();
        } catch (DukeException e) {
            ui.errorLog(e.getMessage());
        }
    }

    /**
     * runs the program.
     */
    public void run() {

        ui.preLog();

        boolean isExit = false;

        while (!isExit) {
            String userInput = ui.getInput();
            try {
                Command command = parser.parse(userInput);
                command.execute(common, ui);
                isExit = command.isExit();
            } catch (DukeException e) {
                ui.errorLog(e.getMessage());
            }
        }

    }

    public static void main(String[] args) {
        Duke duke = new Duke();
        duke.run();
    }

    /**
     * You should have your own function to generate a response to user input.
     * Replace this stub with your completed method.
     */
    public String getResponse(String input) {
        try {
            Command command = parser.parse(input);
            command.execute(common, ui);
            return ui.getResponse();
        } catch (DukeException e) {
            return e.getMessage();
        }
    }


}
