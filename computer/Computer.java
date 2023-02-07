public class Computer {
    private String box;
    private WorkingMemory workingMemory;

    public Computer(String box, WorkingMemory workingMemory) {
        this.workingMemory = workingMemory;
        this.box = box;
    }


    public Computer(String box, int height, int width) {
        this.box = box;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }
    
    public String showParameter() {
        return this.box;
    }

}


