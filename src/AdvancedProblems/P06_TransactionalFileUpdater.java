package AdvancedProblems;

import java.io.IOException;
import java.nio.file.Path;
import java.util.function.UnaryOperator;

/**
 * Problem:
 * Implement transactional text-file update.
 *
 * Requirements:
 * 1) Read file content.
 * 2) Apply user-provided transform function.
 * 3) Write changes atomically (no partial file on failure).
 * 4) Keep backup and rollback if write fails.
 *
 * Hints:
 * - Write to temp file in same directory.
 * - Use atomic move where available.
 * - Preserve charset and line endings carefully.
 */
public class P06_TransactionalFileUpdater {

    public static void updateFileAtomically(Path target, UnaryOperator<String> transform) throws IOException {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
