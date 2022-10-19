import io.codelex.questions.exercise2.Apple;
import io.codelex.questions.exercise2.Basket;
import io.codelex.questions.exercise2.BasketEmptyException;
import io.codelex.questions.exercise2.BasketFullException;
import io.codelex.questions.exercise3.Joiner;
import io.codelex.questions.exercise5.Exercise5;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JavaAdvanced {




    @Test
    void checkIfEmpty(){
        Basket<Apple> basket = new Basket<>();
        assertThrows(BasketEmptyException.class, () -> {basket.removeItems(new Apple());});
    }
    @Test
    void checkIfFull(){
        Basket<Apple> basket = new Basket<>();
        if(basket.getItems().size() == 10){
            assertThrows(BasketFullException.class, () -> {basket.addItems(new Apple());});
        }
    }


    @Test
    void checkThePercentage(){
        List<String> list = Arrays.asList("Hello","you","Have","his","they","she");
        double percentage = Exercise5.partOf(list,(a)-> a.contains("h")||a.contains("H"));
        assertThat(percentage, equalTo((double)5/6));
    }

    @Test
    void joinerTest(){
        Joiner<String> joiner = new Joiner<>("-");
        String result = joiner.joinThem("Hello", "my","name","slim-shady");
        assertEquals("Hello-my-name-slim-shady", result);
    }


}
