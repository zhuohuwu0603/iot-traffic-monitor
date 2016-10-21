package com.iot.app.spark.vo;

import com.google.gson.Gson;
import com.iot.app.spark.vo.IoTData;

import java.util.Date;

/**
 * Created by kevinwu on 2016-10-20.
 */
public class IoTDataTest {
    public static void main(String[] args) {
        System.out.println("Hello Cassandra.");

        String vehicleId = "52f08f03-cd14-411a-8aef-ba87c9a99997";

        String vehicleType = "Public Transport";

        String routeId = "route-43";

        String latitude = "-85.583435";

        String longitude = "38.892395";

        Date timestamp = new Date(1465471124373L);

        double speed = 80.0;

        double fuelLevel = 28.0;

        IoTData ioTData = new IoTData(vehicleId, vehicleType, routeId, latitude, longitude, timestamp, speed, fuelLevel);

        System.out.println(ioTData.toString());

        //{"vehicleId":"e670f335-ecc2-4272-8401-f3a3ef0a708f","vehicleType":"Small Truck","routeId":"Route-43","longitude":"-97.7076","latitude":"35.694485","timestamp":"2016-10-20 13:56:40","speed":20.0,"fuelLevel":17.0}
        System.out.println(new Gson().toJson(ioTData));

    }
}
