package cruxahh.content;

import arc.struct.Seq;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.content.UnitTypes;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives;
import mindustry.type.ItemStack;
import mindustry.content.TechTree;

import static mindustry.content.TechTree.*;

public class cruxtechtree {
    public static TechNode context;

    public static void load() {
        margeNode(SectorPresets.groundZero, () -> {
            node(sectorset.firgidTundra, Seq.with(
            new SectorComplete(groundZero),
            new Research(underflowGate),
            new Research(copperWallLarge)
			),() -> {
			
			}
		});
    }


    private static void margeNode(UnlockableContent parent, Runnable children) {
        context = TechTree.all.find(t -> t.content == parent);
        children.run();
    }


    private static void node(UnlockableContent content, ItemStack[] requirements, Seq<Objectives.Objective> objectives, Runnable children) {
        TechNode node = new TechNode(context, content, requirements);
        if (objectives != null) node.objectives = objectives;


        TechNode prev = context;
        context = node;
        children.run();
        context = prev;
    }


    private static void node(UnlockableContent content, ItemStack[] requirements, Runnable children) {
        node(content, requirements, null, children);
    }


    private static void node(UnlockableContent content, Runnable children) {
        node(content, content.researchRequirements(), children);
    }


    private static void node(UnlockableContent block) {
        node(block, () -> {
        });
    }
}
