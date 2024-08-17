package cruxahh.content;


import mindustry.type.*;


import static mindustry.content.Planets.*;


public class sectorset{
    public static SectorPreset
    facility32M,depositedBay,atolls,frigidTundra,taintedWoods,iceboundTributary,sporch,stormingSummit,
    scoutFront,sunkenPier;


	
    public static void load(){
        //region serpulo
        facility32M = new SectorPreset("facility32M", serpulo, 170){{
            captureWave = 26;
            difficulty = 4;
        }};


        depositedBay = new SectorPreset("depositedBay", serpulo, 22){{
            captureWave = 36;
            difficulty = 9;
        }};


        atolls = new SectorPreset("atolls", serpulo, 1){{
            difficulty = 5;
        }};
	    
        frigidTundra = new SectorPreset("frigidTundra", serpulo, 177){{
	    captureWave = 15;
            difficulty = 1;
        }};
	    
        taintedWoods = new SectorPreset("taintedWoods", serpulo, 221){{
	    captureWave = 33;
            difficulty = 5;
        }};


        iceboundTributary = new SectorPreset("iceboundTributary", serpulo, 99){{
	    captureWave = 23;
            difficulty = 4;
        }};
	    
        sporch = new SectorPreset("sporch", serpulo, 62){{
	    captureWave = 46;
            difficulty = 8;
        }};
	    
        stormingSummit = new SectorPreset("stormingSummit", serpulo, 202){{
            difficulty = 5;
        }};


        scoutFront = new SectorPreset("scoutFront", serpulo, 203){{
            difficulty = 2;
        }};


        sunkenPier = new SectorPreset("sunkenPier", serpulo, 111){{
	    captureWave = 50;
            difficulty = 8;
        }};
        //endregion
    }
}