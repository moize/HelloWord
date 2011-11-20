package com.laanait.shop.bo;

import java.util.ArrayList;


public class GeoLocalization {

	private static GeoLocalization instance=null;
	private int[] tabBearing={360,180,90,-90};
	public static void main(String[] args) {
		System.out.println();
	}

	private GeoLocalization(){	
	}

	public static GeoLocalization getInstance(){
		if(null==instance)
			instance=new GeoLocalization();
		return instance;
	}

	public double getDistanceToShop(double lat1 ,double lon1,double lat2 ,double lon2){
		int R = 6371; // km
		lat1=Math.toRadians(lat1);
		lon1=Math.toRadians(lon1);
		lat2=Math.toRadians(lat2);
		lon2=Math.toRadians(lon2);

		double distance = Math.acos(Math.sin(lat1)*Math.sin(lat2) + 
				Math.cos(lat1)*Math.cos(lat2) *
				Math.cos(lon2-lon1)) * R;
		return distance;
	}

	public ArrayList<double[]> getCoordinatesList(double lat1,double lon1
												 ,double distance){
		distance=distance/1000;
		ArrayList<double[]> tabCoordinates=new ArrayList<double[]>();
		for(int bearing:tabBearing)
			tabCoordinates.add(getCoordinatesForBearing(lat1,lon1,distance
													   ,Math.toRadians(bearing)));
		return tabCoordinates;
	}

	public double[] getCoordinatesForBearing(double lat1,double lon1
											,double distance,double bearing){
		double[]coordinates=new double[2];		
		lat1=Math.toRadians(lat1);
		lon1=Math.toRadians(lon1);
		double dLat=distance*Math.cos(bearing);
		double lat2=lat1+dLat;
		double dPhi=Math.log(Math.tan(lat2/2+Math.PI/4)/Math.tan(lat1/2+Math.PI/4));
		double q=0;
		q= dLat/dPhi;
		if(Double.isInfinite(q))
			q=Math.cos(lat1);
		double dLon= distance*Math.sin(bearing)/q;
		if (Math.abs(lat2) > Math.PI/2) lat2 = lat2>0 ? Math.PI-lat2 : -(Math.PI-lat2);
		double lon2 = (lon1+dLon+Math.PI)%(2*Math.PI) - Math.PI;

		coordinates[0]=Math.toDegrees(lat2);
		coordinates[1]=Math.toDegrees(lon2);

		return coordinates;
	}

}
