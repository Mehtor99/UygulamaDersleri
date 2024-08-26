package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Lig;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.Optional;
import java.util.stream.Collectors;

public class LigDB extends DatabaseManager<Lig> {
	
	private static final LigDB instance = new LigDB();
	
	private LigDB() {
	}
	
	public static LigDB getInstance() {
		return instance;
	}
	
}