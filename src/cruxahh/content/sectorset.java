package cruxahh.content;

import mindustry.type.*;

import static mindustry.content.Planets.*;

public class sectorset{
    public static SectorPreset
    facility32M,depositedBay,atolls,frigidTundra,taintedWoods,iceboundTributary,sporch,stormingSummit,
    scoutFront,sunkenPier,bombardmentWarzone,erodedSierra,
    remnant0025,jut;


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


        sunkenPier = new SectorPreset("sunkenPier", serpulo, 3){{
	    captureWave = 50;
            difficulty = 8;
        }};
	
	bombardmentWarzone = new SectorPreset("bombardmentWarzone", serpulo, 228){{
	    captureWave = 145;
            difficulty = 12;
        }};

	erodedSierra = new SectorPreset("erodedSierra", serpulo, 100){{
	    captureWave = 25;
            difficulty = 10;
        }};

	remnant0025 = new SectorPreset("remnant0025", serpulo, 94){{
	    captureWave = 30;
            difficulty = 10;
        }};

	jut = new SectorPreset("jut", serpulo, 33){{
	    captureWave = 101;
            difficulty = 10;
        }};
        //endregion
    }
}
