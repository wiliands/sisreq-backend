package br.com.sisreq.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public final class MessagesUtil {
	
	private static final MessagesUtil INSTANCE = new MessagesUtil();
	private final ResourceBundle resources;
	
	private MessagesUtil() {
		super();
		this.resources = ResourceBundle.getBundle("messages.messages", Locale.getDefault());
	}
	
	public static MessagesUtil getInstance() {
		return INSTANCE;
	}
	
	public String getMessage(String key) {
		return resources.getString(key);
	}
	
	public String getMessage(String key, Object... args) {
		return MessageFormat.format(resources.getString(key), args);
	}
	

}
