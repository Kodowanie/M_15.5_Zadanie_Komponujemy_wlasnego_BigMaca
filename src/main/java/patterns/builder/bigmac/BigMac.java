package patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {

    private final String bun;
    private final Integer burgers;
    private final String sauce;
    private final List <String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private Integer burgers;
        private String sauce;
        private List <String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }
        public BigMacBuilder burgers(Integer burgers){
            this.burgers = burgers;
            return this;
        }
        public BigMacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public BigMacBuilder ingredients(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build(){
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }


    private BigMac(String bun, Integer burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
