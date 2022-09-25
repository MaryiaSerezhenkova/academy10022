package controllers.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import services.StatisticsService;
import services.api.IStatisticsService;

public class SessionListener implements HttpSessionListener {

    private final IStatisticsService statisticsService;

    public SessionListener() {
        this.statisticsService = StatisticsService.getInstance();
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        this.statisticsService.incSessionCount();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        this.statisticsService.decSessionCount();
    }
}