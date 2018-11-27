package spring4.ch1.javaConfig_test;

public class UseFunctionService {

    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
