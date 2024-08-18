package cruxahh.type;

import arc.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.Saves.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.ui.*;
import mindustry.world.modules.*;

import static mindustry.Vars.*;

public class Sector{
	
	public String displayThreat(){
    float step = 0.125f;
    String color = Tmp.c1.set(Color.white).lerp(Color.scarlet, Mathf.round(threat, step)).toString();
    String[] threats = {"class I", "class II", "class III", "class IV", "class V", "class VI", "class VII", "class VIII", "class IX"};
    int index = Math.min((int)(threat / step), threats.length - 1);
    return "[#" + color + "]" + Core.bundle.get("threat." + threats[index]);
    }
	
}