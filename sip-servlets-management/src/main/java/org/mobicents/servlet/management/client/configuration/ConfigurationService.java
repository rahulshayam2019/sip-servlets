package org.mobicents.servlet.management.client.configuration;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface ConfigurationService extends RemoteService {
	public static class Util {

		public static ConfigurationServiceAsync getInstance() {

			ConfigurationServiceAsync instance = (ConfigurationServiceAsync) GWT
					.create(ConfigurationService.class);
			ServiceDefTarget target = (ServiceDefTarget) instance;
			target.setServiceEntryPoint(GWT.getModuleBaseURL() + SERVICE_URI);
			return instance;
		}
		
		public static ConfigurationService getSyncInstance() {

			ConfigurationService instance = (ConfigurationService) GWT
					.create(ConfigurationService.class);
			ServiceDefTarget target = (ServiceDefTarget) instance;
			target.setServiceEntryPoint(GWT.getModuleBaseURL() + SYNC_SERVICE_URI);
			return instance;
		}
	}
	public static final String SERVICE_URI = "/ConfigurationService";
	public static final String SYNC_SERVICE_URI = "/ConfigurationServiceSync";
	
	void setQueueSize(int queueSize);
	int getQueueSize();
	public void setMemoryThreshold(int memoryThreshold);
	public int getMemoryThreshold();
	String getConcurrencyControlMode();
	void setConcurrencyControlMode(String mode);
	public String getCongestionControlPolicy();
	public void setCongestionControlPolicy(String congestionControlPolicy);
	public long getCongestionControlCheckingInterval();
	public void setCongestionControlCheckingInterval(long interval);
	void setBaseTimerInterval(int baseTimerInterval);
	int getBaseTimerInterval();
	void setT2Interval(int t2Interval);
	int getT2Interval();
	void setT4Interval(int t4Interval);
	int getT4Interval();
	void setTimerDInterval(int timerDInterval);
	int getTimerDInterval();
	String getLoggingMode();
	void setLoggingMode(String loggingMode);
	String[] listLoggingProfiles();
}
