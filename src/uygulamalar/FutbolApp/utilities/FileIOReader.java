package uygulamalar.FutbolApp.utilities;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.MenajerDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.Futbolcu;
import uygulamalar.FutbolApp.entities.Lig;
import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.entities.Takim;

import java.io.*;
import java.util.List;

public class FileIOReader {
	private static final File dosya =new File("C:\\FutbolAppDatabase");
	
	public static void futbolcuDosyasiniOku(FutbolcuDB futbolcuDB){
		File inputFile = new File(dosya,"futbolcuDB.bin");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {
			futbolcuDB.saveAll((List<Futbolcu>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void takimDosyasiniOku(TakimDB takimDB){
		File inputFile= new File(dosya,"takimDB.bin");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {
			takimDB.saveAll((List<Takim>) ois.readObject());
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void ligDosyasiniOku(LigDB ligDB){
		File inputFile= new File(dosya,"ligDB.bin");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))){
			ligDB.saveAll((List<Lig>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void menajerDosyasiniOku(MenajerDB menajerDB){
		File inputFile= new File(dosya,"menajerDB.bin");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {
			menajerDB.saveAll((List<Menajer>) ois.readObject());
		}
		
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void nesneleriOku(FutbolcuDB futbolcuDB,TakimDB takimDB,LigDB ligDB,MenajerDB menajerDB){
		futbolcuDosyasiniOku(futbolcuDB);
		takimDosyasiniOku(takimDB);
		ligDosyasiniOku(ligDB);
		menajerDosyasiniOku(menajerDB);
	}
}