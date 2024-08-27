package cruxahh;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import cruxahh.content.*;

public class cruxahh extends Mod{

    public cruxahh(){
        Log.info("Cruxscape Takeover initializing.");
    }

    @Override
    public void loadContent(){
        Log.info("DIEDIEDIEDIEDIE");
        sectorset.load();
        cruxtechtree.load();
    }

}
