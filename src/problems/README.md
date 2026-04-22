# Advanced Java Problem Tracker

Use this tracker to solve the problems in a progression that builds depth step by step.

Legend:
- Difficulty: `M` = Medium, `H` = Hard, `VH` = Very Hard
- Expected time = focused implementation time (excluding deep refactor rounds)

| Order | File | Difficulty | Expected Time | Prerequisite Topics |
|---|---|---|---|---|
| 1 | `P05_ImmutableMoneyValueObject.java` | M | 60-90 min | OOP, `final`, `equals/hashCode`, `BigDecimal`, `Currency` |
| 2 | `P01_LRUCacheDesign.java` | H | 2-3 hrs | HashMap, doubly linked list, invariants, API design |
| 3 | `P02_ThreadSafeBlockingQueue.java` | H | 2-3 hrs | Threads, synchronization, `wait/notifyAll`, race conditions |
| 4 | `P12_CacheWithTTLAndCleanup.java` | H | 2-4 hrs | `ConcurrentHashMap`, time APIs, schedulers, safe shutdown |
| 5 | `P09_RetryWithExponentialBackoff.java` | M-H | 90-150 min | Exceptions, `Callable`, retry strategy, interruption handling |
| 6 | `P03_CustomCollectorTopKFrequent.java` | H | 2-4 hrs | Streams, Collector contract, map/reduce, ordering |
| 7 | `P10_LogParserWithRegexAndStreams.java` | H | 2-4 hrs | Regex (`Pattern/Matcher`), file streaming, collectors |
| 8 | `P04_GenericTypeSafeEventBus.java` | H | 2-4 hrs | Generics (`<T>`), variance basics, functional interfaces |
| 9 | `P06_TransactionalFileUpdater.java` | H | 2-4 hrs | NIO (`Path`, temp files), atomic move, failure recovery |
| 10 | `P08_ProducerConsumerWithBackpressure.java` | VH | 3-5 hrs | Bounded queues, lifecycle management, metrics, graceful stop |
| 11 | `P11_ConcurrentWebCrawler.java` | VH | 4-7 hrs | Concurrency, URL normalization, parsing pipeline, limits |
| 12 | `P07_MiniDependencyInjector.java` | VH | 5-8 hrs | Reflection, constructor injection, graph traversal, cycle detection |

---

## Completion Checklist

- [ ] `P05_ImmutableMoneyValueObject.java`
- [ ] `P01_LRUCacheDesign.java`
- [ ] `P02_ThreadSafeBlockingQueue.java`
- [ ] `P12_CacheWithTTLAndCleanup.java`
- [ ] `P09_RetryWithExponentialBackoff.java`
- [ ] `P03_CustomCollectorTopKFrequent.java`
- [ ] `P10_LogParserWithRegexAndStreams.java`
- [ ] `P04_GenericTypeSafeEventBus.java`
- [ ] `P06_TransactionalFileUpdater.java`
- [ ] `P08_ProducerConsumerWithBackpressure.java`
- [ ] `P11_ConcurrentWebCrawler.java`
- [ ] `P07_MiniDependencyInjector.java`

---

## How To Use This Tracker

- Solve in order first; do not jump unless you are already comfortable with prerequisites.
- After each solution, refactor once for readability and once for robustness.
- For concurrency-heavy files, run multiple stress scenarios (high producer/consumer counts, forced interruptions).
- Keep a short "postmortem" note after each problem: bug found, design trade-off, and one improvement.

---

## Mastery Milestones

- **Milestone 1 (Problems 1-4):** Strong object design + thread-safe basics.
- **Milestone 2 (Problems 5-8):** Production-style utility design (retry/streams/regex/generics).
- **Milestone 3 (Problems 9-12):** Advanced systems thinking: reliability, concurrency control, reflection-based architecture.
