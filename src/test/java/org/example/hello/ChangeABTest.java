package org.example.hello;

import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
public class ChangeABTest {

    ChangeAB changeAB = new ChangeAB();

    ErrorCollector errorCollector = new ErrorCollector();

    public void givenTwoIntegersWhenChangeNumbersThenSuccess() {
        //Prepare
        //Создаются мок файлы и специфические для текущего теста данные
        int a = 10;
        int b = 5;

        //Act
        changeAB.changeVar(a, b);

        //Assert
        assertEquals(a, 5);
        assertEquals(b, 10);
    }
}
