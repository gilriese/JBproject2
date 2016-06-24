package com.gilriz.jbproject2;

/**
 * Created by michal on 24/06/2016.
 */
public class Place {
    String Icon;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {

        return Name;
    }

    String Name;
    String Location;
    String Address;

    public Place(String icon,String name,String location,String address) {
        Icon=icon;
        Name=name;
        Location=location;
        Address=address;

    }
}
