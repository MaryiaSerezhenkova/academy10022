package services.api;

import java.util.Map;

public interface IStatisticsService {
	long incSessionCount();

	long decSessionCount();

	long getSessionCount();

	Map<String, Object> getStats();
}
