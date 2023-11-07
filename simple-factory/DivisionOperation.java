public class DivisionOperation extends Operation{
    public Double operation(){
        if (getInputSecond()==0){
            throw new RuntimeException("被除数不能为0");
        }
        return getInputFirst()/getInputSecond();
    }
}
