package model.dominio;

public class DevException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public DevException(String msg) {
	System.err.println(msg);
    }

}
