package AdvancedProblems;

import java.net.URI;
import java.util.Set;

/**
 * Problem:
 * Build a concurrent domain-limited web crawler.
 *
 * Requirements:
 * 1) Start from seed URL.
 * 2) Crawl only within same host/domain.
 * 3) Visit each URL at most once.
 * 4) Respect max depth and max pages limit.
 * 5) Use multiple worker threads safely.
 *
 * Hints:
 * - Thread-safe visited set + work queue.
 * - Normalize URLs before deduplication.
 * - Separate fetch, parse, and schedule stages.
 */
public class P11_ConcurrentWebCrawler {

    public Set<URI> crawl(URI seed, int maxDepth, int maxPages, int workerCount) {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
