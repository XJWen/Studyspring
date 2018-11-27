package spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

    @Autowired
    FunctionService service;

    public String SayHello(String word){
        return service.sayHello(word);
    }
}
