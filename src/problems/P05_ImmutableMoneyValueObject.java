package problems;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Problem:
 * Build an immutable Money value object.
 *
 * Requirements:
 * 1) Fields: amount (BigDecimal), currency (Currency).
 * 2) Strict validation: non-null, scale rules (as you define).
 * 3) Operations: add, subtract, multiply.
 * 4) Prevent arithmetic between different currencies.
 * 5) Correct equals/hashCode/toString.
 *
 * Hints:
 * - Make class final, fields private final.
 * - Validate in constructor/factory.
 * - Return new objects for all operations.
 */
public final class P05_ImmutableMoneyValueObject {

    public static final class Money {
        public Money(BigDecimal amount, Currency currency) {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public BigDecimal amount() {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public Currency currency() {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public Money add(Money other) {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public Money subtract(Money other) {
            throw new UnsupportedOperationException("TODO: implement");
        }

        public Money multiply(BigDecimal factor) {
            throw new UnsupportedOperationException("TODO: implement");
        }
    }
}
