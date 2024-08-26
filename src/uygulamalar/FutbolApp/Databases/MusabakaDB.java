package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Musabaka;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MusabakaDB extends DatabaseManager<Musabaka> {
	
	private static final MusabakaDB instance = new MusabakaDB();
	
	private MusabakaDB() {
	}
	
	public static MusabakaDB getInstance() {
		return instance;
	}
	
}