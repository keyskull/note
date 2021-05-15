



public class Thermostat {
    class TemperatureOutofRange extends Exception{}
    class TemperatureTooHigh extends TemperatureOutofRange{}
    class TemperatureTooLow extends TemperatureOutofRange{}

    int min,max,t;
    public Thermostat(int min,int max){
        this.min=min;
        this.max=max;
    }

    public void setTemp(int n) throws TemperatureOutofRange{
        if(n<min) throw new TemperatureTooLow();
        if(n>max) throw new TemperatureTooHigh();
        this.t=n;
    }
}



