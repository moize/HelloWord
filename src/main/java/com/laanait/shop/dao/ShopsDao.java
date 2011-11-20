package com.laanait.shop.dao;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;

import com.laanait.shop.bo.GeoLocalization;
import com.laanait.shop.model.Shops;
import com.laanait.shop.persistence.HibernateUtil;

public class ShopsDao {
	private static ShopsDao instance=null;
	private static Session session;
	
	public static void main(String[] args) {
		Shops myShop=new Shops();
		myShop.setShopName("Test");
		myShop.setShopJoinDate(new Date());
		ShopsDao.getInstance().addShop(myShop);
		ShopsDao.getInstance().getShopById(1);
	}
	private ShopsDao(){
		System.out.println("Maven + Hibernate + MySQL");
		session = HibernateUtil.getSessionFactory().openSession();
	}
	public static ShopsDao getInstance(){
		if(null==instance)
			instance=new ShopsDao();
		return instance;
	}
	public Shops getShopById(int id){
		return (Shops)session.get(Shops.class,id);
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Shops> getShopsByCity(String city){
		session.beginTransaction();
		return (ArrayList<Shops>) session.createQuery("from Shops where city='" + city+"'").list();
	}
	public ArrayList<Shops> getNearShopsByCity(String city,Double distance,double lat,double lon){
		ArrayList<Shops> listNearShops=new ArrayList<Shops>();
		ArrayList<Shops> listShops=new ArrayList<Shops>();
		listShops=getShopsByCity(city);

		for (Shops shop:listShops){
			if((distance>=GeoLocalization.getInstance().getDistanceToShop(lat,lon,Double.valueOf(shop.getShopLat()),Double.valueOf(shop.getShopLon()))))
				listNearShops.add(shop);
		}
		return listNearShops;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Shops> getNearShopsByCoordinates(Double distance,double lat,double lon){
		ArrayList<Shops> listShops=new ArrayList<Shops>();
		ArrayList<Shops> listNearShops=new ArrayList<Shops>();
		ArrayList<double[]> tabCoordinates=GeoLocalization.getInstance().getCoordinatesList(lat, lon, distance);
		double lat1=tabCoordinates.get(0)[0];
		double lat2=tabCoordinates.get(1)[0];
		double lon1=tabCoordinates.get(2)[1];
		double lon2=tabCoordinates.get(3)[1];
		session.beginTransaction();
		listShops=(ArrayList<Shops>) session.createQuery("from Shops where lat<="+ lat1 +" and lat>=" + lat2 + " and lon <=" + lon1 + " and lon>= " + lon2+"").list();
		for (Shops shop:listShops){
			if((distance>=GeoLocalization.getInstance().getDistanceToShop(lat,lon,Double.valueOf(shop.getShopLat()),Double.valueOf(shop.getShopLon()))))
				listNearShops.add(shop);
		}
		return listNearShops;
	}
	public boolean addShop(Shops shop){
		session.beginTransaction();
		session.save(shop);
		session.getTransaction().commit();
		return true;
	}
	public boolean deleteShopById(int id){
		session.beginTransaction();
		session.createQuery("delete from Shops Where id=" + id).executeUpdate();
		session.getTransaction().commit();
		return true;
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Shops> getAllShops(){
		return (ArrayList<Shops>) session.createQuery("from Shops").list();
	}
}
