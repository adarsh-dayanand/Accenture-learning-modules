public class WeatherInfo implements TodaysWeather,Temperature{
    
    public String getWeather(String location){
        for(int i=0;i<4;i++){
            if(this.location[i].equals(location)){
                String str="The weather in "+location+" is "+weather[i]+" and the temperature is "+temp[i]+" Degrees";
                return str;
            }
        }
        String s="Location "+location+" invalid";
        return s;
    }
}