package controllers;

import models.Station;
import play.Logger;
import play.mvc.Controller;
import utils.LatestWeather;

public class StationCtrl extends Controller {

    public static void index(Long id) {

        Logger.info("Rendering Station Info.");

        Station stations = Station.findById(id);
        stations = LatestWeather.getLatestReadings(stations);

        Logger.info ("Station ID = " + id);
        render ("stations.html", stations);
    }

    public static void addStation(String name) {
        Station station = new Station(name);
        Logger.info ("Adding a new Station called " + name);
        station.save();
        redirect ("/dashboard");
    }
}
