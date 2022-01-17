package com.server.dao;

import java.util.List;


import com.server.models.GPSTracker;

public interface IGPSTracker  {
	public void ajouter(GPSTracker obj);
	public void modifier(GPSTracker obj);
	public void supprimer(GPSTracker obj);
	public GPSTracker findById(int id);
	public List<GPSTracker> findAll();
}
