package CodeTeaching;

class Clock {

  private int hour;
  private int min;
  private int sec;

  public Clock() {}

  public Clock(int hour, int min, int sec) {
    this.hour = hour;
    this.min = min;
    this.sec = sec;
  }

  public int getHour() {
    return hour;
  }

  private void setHour() {
    if (this.hour >= 24) {
      this.hour = 0;
    }

    this.hour++;
  }

  public int getMin() {
    return min;
  }

  private void setMin() {
    if (this.min == 60) {
      this.min = 0;
      this.setHour();
    }
    this.min++;
  }

  public int getSec() {
    return sec;
  }

  public void setSec() {
    if (this.sec == 60) {
      this.sec = 0;
      this.setMin();
    }
    this.sec++;
  }
}

public class ClockSimulation {
  public static void main(String[] args) {
    Clock clock = new Clock(0, 0, 0);

    for (int i = 0; i < 62; i++) {
      clock.setSec();
    }

    System.out.println("hour: "+ clock.getHour() + " min: " + clock.getMin() + " sec: " + clock.getSec());
  }
}
