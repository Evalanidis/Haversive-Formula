/*
* @author Valanidis Efstathios
* @literal evalanidis@gmail.com
* @since 24/10/2017
* */

static double earthRadius = 6371.0;
static double lat1,lat2,latitude1,latitude2,longitude1,longitude2,dLat,dLong,hav1,hav2,sum,d;

public static void haversiveFormula(){
        System.out.print("What is the latitude of the first location in degrees? ");
        latitude1 = input.nextDouble();
        System.out.print("What is the longitude of the first location in degrees? ");
        longitude1 = input.nextDouble();
        System.out.print("What is the latitude of the second location in degrees? ");
        latitude2 = input.nextDouble();
        System.out.print("What is the longitude of the second location in degrees? ");
        longitude2 = input.nextDouble();
        
        lat1=latitude1;
        lat2=latitude2;
        
        dLat = Math.toRadians(latitude2 - latitude1);
        dLong = Math.toRadians(longitude2 - longitude1);
        latitude1 = Math.toRadians(latitude1);
        latitude2 = Math.toRadians(latitude2);

        hav1 = Math.pow(Math.sin(dLat/2),2);
        hav2 = Math.pow(Math.sin(dLong/2),2);

        sum = hav1 + Math.cos(latitude1) * Math.cos(latitude2) * hav2;
        d = 2 * Math.atan2(Math.sqrt(sum),Math.sqrt(1-sum));
        d = (float)(d * earthRadius);

        System.out.print("The first location's latitude is "+latitude1+" and longitude is "+longitude1+"\n");
        System.out.print("The second location's latitude is "+latitude2+" and longitude is "+longitude2+"\n");
        System.out.printf("Using the Haversive formula the distance between the two locations is %.2f km",d);

    }
