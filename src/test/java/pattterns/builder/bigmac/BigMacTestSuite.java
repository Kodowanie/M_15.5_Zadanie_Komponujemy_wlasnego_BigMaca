package pattterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.builder.bigmac.BigMac;

import static org.junit.jupiter.api.Assertions.*;

public class BigMacTestSuite {

    @Test
    void bigMacNewTest(){
        //given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("classic")
                .burgers(2)
                .sauce("BigMac sauce")
                .ingredients("Onions")
                .ingredients("Cheese")
                .ingredients("Salad")
                .build();
        System.out.println(bigMac);
        //when
        int howManyIngredients = bigMac.getIngredients().size();
        //then
        assertEquals(3, howManyIngredients);
    }
}
