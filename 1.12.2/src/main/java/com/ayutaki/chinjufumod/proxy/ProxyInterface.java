package com.ayutaki.chinjufumod.proxy;

/* CommonProxyで扱うメソッドを約束
 * Promises methods to handle in CommonProxy. */
public interface ProxyInterface {

	default void preInit() {};

	default void init() {};

	default void postInit() {};

	boolean isSinglePlayer();

	boolean isDedicatedServer();

}
