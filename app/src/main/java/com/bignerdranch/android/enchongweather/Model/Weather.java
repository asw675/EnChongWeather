package com.bignerdranch.android.enchongweather.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    /**
     * cod : 200
     * message : 0.0183
     * cnt : 40
     * list : [{"dt":1537282800,"main":{"temp":286.82,"temp_min":285.418,"temp_max":286.82,"pressure":1018.81,"sea_level":1029.22,"grnd_level":1018.81,"humidity":82,"temp_kf":1.4},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.31,"deg":177.507},"sys":{"pod":"n"},"dt_txt":"2018-09-18 15:00:00"},{"dt":1537293600,"main":{"temp":285.68,"temp_min":284.632,"temp_max":285.68,"pressure":1018.61,"sea_level":1029.2,"grnd_level":1018.61,"humidity":81,"temp_kf":1.05},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.62,"deg":157.506},"sys":{"pod":"n"},"dt_txt":"2018-09-18 18:00:00"},{"dt":1537304400,"main":{"temp":284.89,"temp_min":284.187,"temp_max":284.89,"pressure":1018.7,"sea_level":1029.25,"grnd_level":1018.7,"humidity":83,"temp_kf":0.7},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.66,"deg":145.5},"sys":{"pod":"n"},"dt_txt":"2018-09-18 21:00:00"},{"dt":1537315200,"main":{"temp":292.54,"temp_min":292.186,"temp_max":292.54,"pressure":1019.1,"sea_level":1029.41,"grnd_level":1019.1,"humidity":64,"temp_kf":0.35},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":20},"wind":{"speed":1.98,"deg":125.504},"sys":{"pod":"d"},"dt_txt":"2018-09-19 00:00:00"},{"dt":1537326000,"main":{"temp":297.701,"temp_min":297.701,"temp_max":297.701,"pressure":1018.58,"sea_level":1028.83,"grnd_level":1018.58,"humidity":55,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":48},"wind":{"speed":2.32,"deg":177.501},"sys":{"pod":"d"},"dt_txt":"2018-09-19 03:00:00"},{"dt":1537336800,"main":{"temp":297.646,"temp_min":297.646,"temp_max":297.646,"pressure":1017.44,"sea_level":1027.73,"grnd_level":1017.44,"humidity":49,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":88},"wind":{"speed":3.06,"deg":192.002},"sys":{"pod":"d"},"dt_txt":"2018-09-19 06:00:00"},{"dt":1537347600,"main":{"temp":296.132,"temp_min":296.132,"temp_max":296.132,"pressure":1017.36,"sea_level":1027.52,"grnd_level":1017.36,"humidity":50,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":88},"wind":{"speed":2.26,"deg":186},"sys":{"pod":"d"},"dt_txt":"2018-09-19 09:00:00"},{"dt":1537358400,"main":{"temp":289.24,"temp_min":289.24,"temp_max":289.24,"pressure":1017.82,"sea_level":1028.12,"grnd_level":1017.82,"humidity":83,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":20},"wind":{"speed":1.45,"deg":170.003},"sys":{"pod":"n"},"dt_txt":"2018-09-19 12:00:00"},{"dt":1537369200,"main":{"temp":285.803,"temp_min":285.803,"temp_max":285.803,"pressure":1017.77,"sea_level":1028.2,"grnd_level":1017.77,"humidity":85,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":1.23,"deg":162.004},"sys":{"pod":"n"},"dt_txt":"2018-09-19 15:00:00"},{"dt":1537380000,"main":{"temp":284.686,"temp_min":284.686,"temp_max":284.686,"pressure":1017.31,"sea_level":1027.75,"grnd_level":1017.31,"humidity":84,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":44},"wind":{"speed":1.26,"deg":101.502},"sys":{"pod":"n"},"dt_txt":"2018-09-19 18:00:00"},{"dt":1537390800,"main":{"temp":283.986,"temp_min":283.986,"temp_max":283.986,"pressure":1016.55,"sea_level":1027.05,"grnd_level":1016.55,"humidity":83,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":64},"wind":{"speed":1.32,"deg":99.003},"sys":{"pod":"n"},"dt_txt":"2018-09-19 21:00:00"},{"dt":1537401600,"main":{"temp":291.671,"temp_min":291.671,"temp_max":291.671,"pressure":1016.52,"sea_level":1026.83,"grnd_level":1016.52,"humidity":66,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":1.98,"deg":138.504},"sys":{"pod":"d"},"dt_txt":"2018-09-20 00:00:00"},{"dt":1537412400,"main":{"temp":297.009,"temp_min":297.009,"temp_max":297.009,"pressure":1015.86,"sea_level":1026.04,"grnd_level":1015.86,"humidity":56,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":20},"wind":{"speed":2.91,"deg":186.504},"sys":{"pod":"d"},"dt_txt":"2018-09-20 03:00:00"},{"dt":1537423200,"main":{"temp":298.088,"temp_min":298.088,"temp_max":298.088,"pressure":1013.95,"sea_level":1024.07,"grnd_level":1013.95,"humidity":51,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":5.57,"deg":187.51},"sys":{"pod":"d"},"dt_txt":"2018-09-20 06:00:00"},{"dt":1537434000,"main":{"temp":295.503,"temp_min":295.503,"temp_max":295.503,"pressure":1013.59,"sea_level":1023.83,"grnd_level":1013.59,"humidity":55,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":6.12,"deg":194.001},"rain":{"3h":0.005},"sys":{"pod":"d"},"dt_txt":"2018-09-20 09:00:00"},{"dt":1537444800,"main":{"temp":292.876,"temp_min":292.876,"temp_max":292.876,"pressure":1014.29,"sea_level":1024.59,"grnd_level":1014.29,"humidity":69,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":5.21,"deg":197.501},"rain":{"3h":0.06},"sys":{"pod":"n"},"dt_txt":"2018-09-20 12:00:00"},{"dt":1537455600,"main":{"temp":290.697,"temp_min":290.697,"temp_max":290.697,"pressure":1012.9,"sea_level":1023.23,"grnd_level":1012.9,"humidity":89,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":3.41,"deg":180.5},"rain":{"3h":0.765},"sys":{"pod":"n"},"dt_txt":"2018-09-20 15:00:00"},{"dt":1537466400,"main":{"temp":289.164,"temp_min":289.164,"temp_max":289.164,"pressure":1011.8,"sea_level":1022.13,"grnd_level":1011.8,"humidity":100,"temp_kf":0},"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.07,"deg":250},"rain":{"3h":13.595},"sys":{"pod":"n"},"dt_txt":"2018-09-20 18:00:00"},{"dt":1537477200,"main":{"temp":283.556,"temp_min":283.556,"temp_max":283.556,"pressure":1013.28,"sea_level":1023.54,"grnd_level":1013.28,"humidity":98,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":5.92,"deg":336},"rain":{"3h":10.745},"sys":{"pod":"n"},"dt_txt":"2018-09-20 21:00:00"},{"dt":1537488000,"main":{"temp":284.345,"temp_min":284.345,"temp_max":284.345,"pressure":1012.67,"sea_level":1023.01,"grnd_level":1012.67,"humidity":99,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":24},"wind":{"speed":1.96,"deg":140.5},"rain":{"3h":3.77},"sys":{"pod":"d"},"dt_txt":"2018-09-21 00:00:00"},{"dt":1537498800,"main":{"temp":289.112,"temp_min":289.112,"temp_max":289.112,"pressure":1011.58,"sea_level":1021.85,"grnd_level":1011.58,"humidity":89,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.77,"deg":239.001},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-21 03:00:00"},{"dt":1537509600,"main":{"temp":290.844,"temp_min":290.844,"temp_max":290.844,"pressure":1010.07,"sea_level":1020.23,"grnd_level":1010.07,"humidity":69,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.46,"deg":232.505},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-21 06:00:00"},{"dt":1537520400,"main":{"temp":288.953,"temp_min":288.953,"temp_max":288.953,"pressure":1009.7,"sea_level":1020,"grnd_level":1009.7,"humidity":61,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.32,"deg":231.502},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-21 09:00:00"},{"dt":1537531200,"main":{"temp":285.155,"temp_min":285.155,"temp_max":285.155,"pressure":1010.54,"sea_level":1020.99,"grnd_level":1010.54,"humidity":65,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":4.45,"deg":210},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-09-21 12:00:00"},{"dt":1537542000,"main":{"temp":283.636,"temp_min":283.636,"temp_max":283.636,"pressure":1010.56,"sea_level":1020.92,"grnd_level":1010.56,"humidity":70,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":68},"wind":{"speed":3.57,"deg":214.508},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-09-21 15:00:00"},{"dt":1537552800,"main":{"temp":281.788,"temp_min":281.788,"temp_max":281.788,"pressure":1010.2,"sea_level":1020.66,"grnd_level":1010.2,"humidity":72,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.41,"deg":228.501},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-09-21 18:00:00"},{"dt":1537563600,"main":{"temp":279.848,"temp_min":279.848,"temp_max":279.848,"pressure":1010.4,"sea_level":1020.93,"grnd_level":1010.4,"humidity":71,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":4.11,"deg":215.5},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-09-21 21:00:00"},{"dt":1537574400,"main":{"temp":284.097,"temp_min":284.097,"temp_max":284.097,"pressure":1011.73,"sea_level":1022.15,"grnd_level":1011.73,"humidity":74,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.67,"deg":241.004},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-22 00:00:00"},{"dt":1537585200,"main":{"temp":289.118,"temp_min":289.118,"temp_max":289.118,"pressure":1011.98,"sea_level":1022.29,"grnd_level":1011.98,"humidity":65,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.76,"deg":264.005},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-22 03:00:00"},{"dt":1537596000,"main":{"temp":290.787,"temp_min":290.787,"temp_max":290.787,"pressure":1011.25,"sea_level":1021.44,"grnd_level":1011.25,"humidity":59,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.91,"deg":244},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-22 06:00:00"},{"dt":1537606800,"main":{"temp":287.115,"temp_min":287.115,"temp_max":287.115,"pressure":1011.94,"sea_level":1022.06,"grnd_level":1011.94,"humidity":80,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":3.71,"deg":279.509},"rain":{"3h":0.89},"sys":{"pod":"d"},"dt_txt":"2018-09-22 09:00:00"},{"dt":1537617600,"main":{"temp":283.825,"temp_min":283.825,"temp_max":283.825,"pressure":1013.4,"sea_level":1023.79,"grnd_level":1013.4,"humidity":97,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":0.76,"deg":194.005},"rain":{"3h":5.235},"sys":{"pod":"n"},"dt_txt":"2018-09-22 12:00:00"},{"dt":1537628400,"main":{"temp":281.067,"temp_min":281.067,"temp_max":281.067,"pressure":1013.24,"sea_level":1023.77,"grnd_level":1013.24,"humidity":94,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":0},"wind":{"speed":2.15,"deg":130.5},"rain":{"3h":0.175},"sys":{"pod":"n"},"dt_txt":"2018-09-22 15:00:00"},{"dt":1537639200,"main":{"temp":277.867,"temp_min":277.867,"temp_max":277.867,"pressure":1013.47,"sea_level":1024.04,"grnd_level":1013.47,"humidity":91,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.07,"deg":189.5},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-09-22 18:00:00"},{"dt":1537650000,"main":{"temp":276.629,"temp_min":276.629,"temp_max":276.629,"pressure":1013.92,"sea_level":1024.68,"grnd_level":1013.92,"humidity":87,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":24},"wind":{"speed":1.3,"deg":193.004},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-09-22 21:00:00"},{"dt":1537660800,"main":{"temp":280.943,"temp_min":280.943,"temp_max":280.943,"pressure":1015.44,"sea_level":1026.12,"grnd_level":1015.44,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":32},"wind":{"speed":1.96,"deg":270.501},"rain":{"3h":0.039999999999999},"sys":{"pod":"d"},"dt_txt":"2018-09-23 00:00:00"},{"dt":1537671600,"main":{"temp":286.744,"temp_min":286.744,"temp_max":286.744,"pressure":1015.69,"sea_level":1026.11,"grnd_level":1015.69,"humidity":96,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":0},"wind":{"speed":2.24,"deg":290},"rain":{"3h":0.0049999999999955},"sys":{"pod":"d"},"dt_txt":"2018-09-23 03:00:00"},{"dt":1537682400,"main":{"temp":288.833,"temp_min":288.833,"temp_max":288.833,"pressure":1014.57,"sea_level":1024.98,"grnd_level":1014.57,"humidity":79,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":20},"wind":{"speed":2.96,"deg":285.504},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-23 06:00:00"},{"dt":1537693200,"main":{"temp":287.646,"temp_min":287.646,"temp_max":287.646,"pressure":1015.2,"sea_level":1025.59,"grnd_level":1015.2,"humidity":67,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":64},"wind":{"speed":2.11,"deg":295.003},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-09-23 09:00:00"},{"dt":1537704000,"main":{"temp":284.357,"temp_min":284.357,"temp_max":284.357,"pressure":1017.11,"sea_level":1027.66,"grnd_level":1017.11,"humidity":85,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":2.01,"deg":332.005},"rain":{"3h":0.64},"sys":{"pod":"n"},"dt_txt":"2018-09-23 12:00:00"}]
     * city : {"id":2034937,"name":"Shenyang","coord":{"lat":41.8045,"lon":123.4278},"country":"CN","population":3512192}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 2034937
         * name : Shenyang
         * coord : {"lat":41.8045,"lon":123.4278}
         * country : CN
         * population : 3512192
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            /**
             * lat : 41.8045
             * lon : 123.4278
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1537282800
         * main : {"temp":286.82,"temp_min":285.418,"temp_max":286.82,"pressure":1018.81,"sea_level":1029.22,"grnd_level":1018.81,"humidity":82,"temp_kf":1.4}
         * weather : [{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}]
         * clouds : {"all":0}
         * wind : {"speed":1.31,"deg":177.507}
         * sys : {"pod":"n"}
         * dt_txt : 2018-09-18 15:00:00
         * rain : {"3h":0.005}
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private SysBean sys;
        private String dt_txt;
        private RainBean rain;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 286.82
             * temp_min : 285.418
             * temp_max : 286.82
             * pressure : 1018.81
             * sea_level : 1029.22
             * grnd_level : 1018.81
             * humidity : 82
             * temp_kf : 1.4
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 0
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 1.31
             * deg : 177.507
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class SysBean {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class RainBean {
            /**
             * 3h : 0.005
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : clear sky
             * icon : 01n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
