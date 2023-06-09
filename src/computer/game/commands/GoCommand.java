package computer.game.commands;

import computer.game.commands.ICommand.BaseCommand;

public class GoCommand extends BaseCommand {
  private String direction;

  public GoCommand() {
  }

  /*
   * Calls triggerEvent with the event type "go" and the direction as the event
   * data
   */
  @Override
  public void execute() {
    triggerEvent("go", direction);
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public String getDirection() {
    return direction;
  }

  @Override
  public void parse(String[] words) {
    if (words.length == 2) {
      direction = words[1];
      execute();
    }
  }
}
