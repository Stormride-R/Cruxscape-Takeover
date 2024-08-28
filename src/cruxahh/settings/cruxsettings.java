package cruxahh.settings;

import arc.Core;
import arc.graphics.g2d.TextureRegion;
import arc.struct.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.meta.*;
import arc.*;
import arc.scene.style.*;
import arc.scene.ui.layout.*;
import arc.util.*;
import mindustry.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.ui.*;
import mindustry.ui.dialogs.SettingsMenuDialog.*;
import mindustry.ui.dialogs.SettingsMenuDialog.SettingsTable.*;

public class cruxsettings {
  public static void init() {
    //Each you turn on or off those setting you need to restart the game for it to take effect. (Theyre BOTH enabled by default.)
    Vars.ui.settings.addCategory(Core.bundle.get("cruxahh-settings"), "cruxahh-setting-icon", cruxs -> {
      cruxs.checkPref("cruxahh-launchpad", true);
      cruxs.checkPref("cruxahh-sim", true);
    });

        if (Core.settings.getBool("cruxahh-launchpad") == true){
            Blocks.launchPad.buildVisibility=BuildVisibility.editorOnly;
        }
        if (Core.settings.getBool("cruxahh-sim") == true){
            Planets.serpulo.allowWaveSimulation=false;
        }
        
  }
}