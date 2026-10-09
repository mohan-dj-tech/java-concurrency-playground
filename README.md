# Java Concurrency & Multithreading Benchmarks

A hands-on collection of Java concurrency, multithreading, and performance-tuning examples. This repository demonstrates core concurrency concepts, thread signaling patterns, high-concurrency bottlenecks, deadlock mitigation strategies, and modern features like Virtual Threads.

---

## 📌 Topics & Examples Covered

### 1. Modern Java Concurrency
* **Java Virtual Thread Example**
    * Demonstrates lightweight, high-throughput concurrency using Project Loom / Virtual Threads (`Executors.newVirtualThreadPerTaskExecutor()`) vs. platform threads.

### 2. Deadlocks & Mitigation
* **Java Deadlock**
    * Demonstrates how circular waiting and mismatched lock ordering lead to thread deadlocks.
* **Java Deadlock Prevention - Timeout Backoff**
    * Shows how to prevent permanent deadlocks using `ReentrantLock.tryLock()` with time-outs and exponential backoff.

### 3. Memory & Hardware Performance
* **Java False Sharing Example**
    * Demonstrates how multiple threads modifying adjacent variables on the same CPU cache line cause cache invalidation thrashing, and how to resolve it using `@Contended` padding.

### 4. Thread Congestion & Queue Architectures
* **Java Thread Congestion - Shared BlockingQueue Example**
    * Illustrates performance bottlenecks when multiple producer and consumer threads contend for a single, shared `BlockingQueue`.
* **Java Thread Congestion - Separate BlockingQueue Example**
    * Resolves queue contention by partitioning workloads across distinct queues (e.g., actor model or single-producer/single-consumer lanes).

### 5. Thread Signaling Patterns
* **Java Thread Signaling Example 1 (Basic `wait()` / `notify()`)**
    * Low-level signaling using intrinsic monitors and `Object.wait()` / `Object.notify()`.
* **Java Thread Signaling Example 2 (`Condition` Variables)**
    * Modern signaling using `ReentrantLock` and explicit `Condition` instances (`await()` / `signal()`).
* **Java Thread Signaling Example 3 (`CountDownLatch`)**
    * One-shot barrier signaling allowing one or more threads to wait until a set of operations completes.
* **Java Thread Signaling Example 4 (`Phaser` / `CyclicBarrier`)**
    * Reusable, phased barrier signaling for multi-stage concurrent task coordination.

### 6. Parallel Computing with ForkJoinPool
* **Java ForkJoinPool Example 1 (Divide and Conquer with `RecursiveTask`)**
    * Parallelizing computational workloads using work-stealing algorithms to compute results.
* **Java ForkJoinPool Example 2 (`RecursiveAction` & Custom Thread Pools)**
    * Side-effect, result-less parallel processing and executing tasks on isolated `ForkJoinPool` instances.

---

## 🛠️ Prerequisites

* **JDK 21+** (Required for Virtual Threads)

