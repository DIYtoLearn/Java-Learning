package AdvancedProblems;

/**
 * Problem:
 * Build a tiny dependency injection container.
 *
 * Requirements:
 * 1) Register interface -> implementation mapping.
 * 2) Resolve class instances recursively using constructor injection.
 * 3) Detect circular dependencies and throw clear error.
 * 4) Support singleton scope for selected bindings.
 *
 * Hints:
 * - Reflection APIs: Constructor, Parameter.
 * - Choose single "injectable" constructor strategy.
 * - Track resolution stack to detect cycles.
 */
public class P07_MiniDependencyInjector {

    public <T> void bind(Class<T> abstraction, Class<? extends T> implementation) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public <T> void bindSingleton(Class<T> abstraction, Class<? extends T> implementation) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public <T> T resolve(Class<T> abstraction) {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
