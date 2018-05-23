package controllers;

import mws.Logger;
import mws.mvc.After;
import mws.mvc.Before;
import mws.mvc.Catch;
import mws.mvc.Controller;
import mws.mvc.Finally;

/**
 * 拦截器
 */
public class Handler extends Controller {
	
	@Before
	public static void onBefore() {
		Logger.info("@Before run");
	}
	
	@Catch(Exception.class)
	public static void onException (Throwable throwable) {
		Logger.info("@Catch Exception: " + throwable.getMessage());
		renderJSON("Error Page");
	}
	
	@After
	public static void onAfter() {
		Logger.info("@After run");
	}
	
	@Finally
	public static void onFinally() {
		Logger.info("@Finally run");
	}
}