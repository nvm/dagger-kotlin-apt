package dev.unick;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Component(
        modules = {JavaModule.class, TestModule.class})
public interface TestComponent {

    IA a();
    String str();
}

@Module()
class JavaModule{

    @Provides
    String str(){
        return "test";
    }
}


class ComponentProxy {
    static TestComponent getComponent() {
        return DaggerTestComponent.create();
    }
}