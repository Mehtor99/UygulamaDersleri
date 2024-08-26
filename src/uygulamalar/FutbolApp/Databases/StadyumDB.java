package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Stadyum;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

public class StadyumDB extends DatabaseManager<Stadyum> {
	
	private static final StadyumDB instance = new StadyumDB();
	
	private StadyumDB() {
	}
	
	public static StadyumDB getInstance() {
		return instance;
	}
}