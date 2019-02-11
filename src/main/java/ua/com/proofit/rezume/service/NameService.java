package ua.com.proofit.rezume.service;

/**
 * 
 * @author 
 * @see 
 */
public class NameService {

	public static NameService getInstance(){
		return new NameService();
	}

	public String convertName(String name) {
		return name.toUpperCase();
	}
}
