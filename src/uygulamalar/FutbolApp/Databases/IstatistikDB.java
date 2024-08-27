package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Istatistik;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

public class IstatistikDB extends DatabaseManager<Istatistik> {
	
	private  static final IstatistikDB instace=new IstatistikDB();
	
	private IstatistikDB(){
	}
	
	public static IstatistikDB getInstance(){
		return instace;
	}
}