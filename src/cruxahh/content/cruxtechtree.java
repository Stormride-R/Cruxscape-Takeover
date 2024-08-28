package cruxahh.content;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import arc.struct.*;
import mindustry.content.Planets;
import mindustry.content.TechTree;
import mindustry.game.Objectives.*;
import mindustry.type.ItemStack;
import cruxahh.content.*;
import cruxahh.content.sectorset.*;
import static mindustry.content.Blocks.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;
import static mindustry.content.SectorPresets.*;

public class cruxtechtree {
    public static void load(){
        nodeRoot("Cruxscape-serpulo", coreShard, false, () -> {
            node(sectorset.frigidTundra, Seq.with(
            new SectorComplete(groundZero),
	    new Research(copperWallLarge),
            new Research(underflowGate)
	    ), () -> {
	    });
            node(sectorset.facility32M, Seq.with(
            new Research(pneumaticDrill)
	    ), () -> {
	    });
   	 });
    };
};
