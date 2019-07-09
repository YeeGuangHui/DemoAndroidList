package com.example.demoandroidlist;

public class AndroidVersion {

    String Name;
    String version;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AndroidVersion(String name, String version) {
        Name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                "Name='" + Name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

}
