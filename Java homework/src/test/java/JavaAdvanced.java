import io.codelex.questions.exercise2.Basket;
import io.codelex.questions.exercise2.BasketEmptyException;
import io.codelex.questions.exercise2.BasketFullException;
import io.codelex.questions.exercise3.Joiner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaAdvanced {




    @Test
    void checkIfEmpt(){
        Basket basket = new Basket();
        if(basket.getItems().isEmpty()){
            assertThrows(BasketEmptyException.class, () -> {basket.removeItems(new Object());});
       }

    }
    @Test
    void checkIfFull(){
        Basket basket = new Basket();
        if(basket.getItems().size() == 10){
            assertThrows(BasketFullException.class, () -> {basket.addItems(new Object());});
        }
    }

    @Test
    void checkIfJoins(){
        Joiner join = new Joiner("-");
        assertEquals("Hello-Bye-4141-23-45-",join.joinThem("Hello","Bye", 4141, 23,45));
    }


}
