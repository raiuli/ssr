package se.ltu.ssr.adapter.interfaces;

import java.util.concurrent.Callable;

public interface RetriverAdapterInterface {
	
	public DataPacket dataRetrieved();
	public int getThresholdPerMinute();
	public void setThresholdPerMinute(int i);
}
