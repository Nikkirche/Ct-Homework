package expression;

import expression.parser.ExpressionParser;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new ExpressionParser().parse(
                        "-x"
                )
        );
    }
}
