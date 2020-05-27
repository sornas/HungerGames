package tk.shanebee.hg.commands;

import tk.shanebee.hg.game.Game;
import tk.shanebee.hg.util.Util;

public class BorderStartCmd extends BaseCmd {

    public BorderStartCmd() {
        cmdName = "borderstart";
        forceInGame = true;
        argLength = 2;
        usage = "<arena-name>";
    }

    @Override
    public boolean run() {
        Game game = gameManager.getGame(args[1]);
        if (game != null) {
            game.startBorder = true;
            game.msgAll("Border going up!");
        }
        return true;
    }

}
