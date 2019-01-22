package com.example.instrument;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class MathRule implements MethodRule {
    @Override
    public Statement apply(final Statement base, FrameworkMethod method, Object target) {

        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("Hello");
                base.evaluate();
                System.out.println("Goodbye");
            }
        };

    }
}
