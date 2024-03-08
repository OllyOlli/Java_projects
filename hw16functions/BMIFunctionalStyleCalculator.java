package cz.robodreams.javadeveloper.homeworks.hw16functions;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BMIFunctionalStyleCalculator {

    /**
     * Implement according to https://cs.wikipedia.org/wiki/Index_t%C4%9Blesn%C3%A9_hmotnosti table "BMI podle WHO"
     * <p>
     * <p>
     * Requirement: only one if is allowed
     * <p>
     * Category 	BMI (kg/m2)
     * od 	do
     * Velmi vážná podvýživa 	-inf	15
     * Vážná podvýživa 	15 	16
     * Podvýživa 	16 	18,5
     * Normální 	18,5 	25
     * Nadváha 	25 	30
     * Nadváha I. stupně (Střední obezita) 	30 	35
     * Nadváha II. stupně (Vážná obezita) 	35 	40
     * Nadváha III. stupně (Velmi vážná obezita) 	40 	+inf
     * <p>
     * 1st weight in kilograms
     * 2nd height in cm
     * <p>
     * Note:
     * bmi <= 15;
     * bmi > 15 && bmi<=16;
     * bmi > 16 && bmi<=18.5;
     * bmi > 18.5 && bmi<=25;
     * bmi > 25 && bmi<=30;
     * bmi > 30 && bmi<=35;
     * bmi > 35 && bmi<=40;
     * bmi > 40;
     */
    public static BiFunction<Integer, Integer, String> getBMIFunction() {
        return (weight, height) -> {
            double bmi = weight / Math.pow(height / 100.0, 2); // Výpočet BMI

            // Predicate pro testování kategorií BMI
            Predicate<Double> inCategory = bmiValue -> bmi <= bmiValue;

            // Supplier pro vrácení kategorie, pokud test platí
            Supplier<String> categorySupplier = () -> {
                if (inCategory.test(15.0)) return "Velmi vážná podvýživa";
                else if (inCategory.test(16.0)) return "Vážná podvýživa";
                else if (inCategory.test(18.5)) return "Podvýživa";
                else if (inCategory.test(25.0)) return "Normální";
                else if (inCategory.test(30.0)) return "Nadváha";
                else if (inCategory.test(35.0)) return "Nadváha I. stupně (Střední obezita)";
                else if (inCategory.test(40.0)) return "Nadváha II. stupně (Vážná obezita)";
                else return "Nadváha III. stupně (Velmi vážná obezita)";
            };

            return categorySupplier.get();
        };
    }
}
