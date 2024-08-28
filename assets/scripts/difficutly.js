Events.on(EventType.ClientLoadEvent, () => {
    if(Core.settings.getBool("cruxahh-diff")==true){
        Planets.serpulo.allowWaveSimulation=false;
        Blocks.launchPad.buildVisibility=BuildVisibility.editorOnly;
    }else{
        Planets.serpulo.allowWaveSimulation=true;
        Blocks.launchPad.buildVisibility=BuildVisibility.campaignOnly;
    }
    Vars.ui.menufrag.addButton("@cruxahh-difficulty-button",Icon.logic,() => {
        // let buf = Core.settings.getBool("cruxahh-diff");
        // buf=!buf;
        // Core.settings.put("cruxahh-diff", buf);
        let diffString="";
        Core.settings.getBool("cruxahh-diff")==0?diffString=Core.bundle.get("cruxahh-difficulty-normal")
                                                :diffString=Core.bundle.get("cruxahh-difficulty-hard");
        const CSprompt = new BaseDialog("@cruxahh-difficulty-title");
        CSprompt.cont.add(Core.bundle.get("cruxahh-difficulty-description")+diffString).row();
        CSprompt.cont.button("@cruxahh-difficulty-normal",()=>{
            Core.settings.put("cruxahh-diff",false);
            Planets.serpulo.allowWaveSimulation=true;
            Blocks.launchPad.buildVisibility=BuildVisibility.campaignOnly;
            CSprompt.hide();
        }).size(600,75).row();
        CSprompt.cont.button("@cruxahh-difficulty-hard",()=>{
            Core.settings.put("cruxahh-diff",true);
            Planets.serpulo.allowWaveSimulation=false;
            Blocks.launchPad.buildVisibility=BuildVisibility.editorOnly;
            CSprompt.hide();
        }).size(600,75);
        CSprompt.show();
    })});