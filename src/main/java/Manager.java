public class Manager{
    public String doSomething(){
        if (Utils.isDebug()) {
            Operator operator = new Operator();
            return (operator.getName());
        }else{
            return "not_debug";
        }
    }
}