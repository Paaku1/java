package test;

public class getSet {
    private String test = "test 1";
    
    public String getTest() {
        return test;
    }

    public void setTest(String newTest){
        this.test = newTest;
    }

    public static void main(String[] args) {
        getSet obj = new getSet();
        System.out.println(obj.test);
    }
}
