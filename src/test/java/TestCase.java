import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Manager.class,Utils.class})
public class TestCase {

    @Test
    public void test()throws Exception{
        PowerMockito.mockStatic(Utils.class);
        // use Mockito to set up your expectation
        Mockito.when(Utils.isDebug()).thenReturn(true);


        Operator operator = mock(Operator.class);
        Mockito.when(operator.getName()).thenReturn("mock");
        whenNew(Operator.class).withAnyArguments().thenReturn(operator);

        Manager manager = new Manager();
        assert "mock".equals(manager.doSomething());
    }
}
