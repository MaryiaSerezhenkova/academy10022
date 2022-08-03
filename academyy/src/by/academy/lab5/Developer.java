package by.academy.lab5;
public class Developer {
    private String name;
    private int daysOfwork;
    
    
    public Developer(String name, int daysOfwork) {
        super();
        this.name = name;
        this.daysOfwork = daysOfwork;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getDaysOfwork() {
        return daysOfwork;
    }
 
    public void setDaysOfwork(int daysOfwork) {
        this.daysOfwork = daysOfwork;
    }
 
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Developer [name=");
        builder.append(name);
        builder.append(", daysOfwork=");
        builder.append(daysOfwork);
        builder.append("]");
        return builder.toString();
    }    
}
 