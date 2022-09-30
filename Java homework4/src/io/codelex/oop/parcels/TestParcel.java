package io.codelex.oop.parcels;

public class TestParcel {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(35, 35, 35, 25);
        Parcel parcel2 = new Parcel(110, 90, 120, 25);

        parcel2.vlidatatable();
        parcel1.vlidatatable();
    }
}
