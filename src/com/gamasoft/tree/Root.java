package com.gamasoft.tree;

value public class Root implements Node {

   final private String name = "root"; //does not compile without a field

    @Override
    public String walkToRoot() {
        return "Root " + name;
    }
}

/*
strange error in intellij not able to reproduce it...

Warning:java: Class dependency information may be incomplete! Error parsing generated class /home/uberto/svi/java/testValueTypes/out/production/testValueTypes/com/gamasoft/tree/Root.class
Error: Corrupted .class file: /home/uberto/svi/java/testValueTypes/out/production/testValueTypes/com/gamasoft/tree/Root.class
java.lang.RuntimeException: Corrupted .class file: /home/uberto/svi/java/testValueTypes/out/production/testValueTypes/com/gamasoft/tree/Root.class
	at org.jetbrains.jps.builders.java.dependencyView.ClassfileAnalyzer.analyze(ClassfileAnalyzer.java:849)
	at org.jetbrains.jps.builders.java.dependencyView.Mappings$5.associate(Mappings.java:2762)
	at org.jetbrains.jps.builders.java.dependencyView.Mappings$5.associate(Mappings.java:2790)
	at org.jetbrains.jps.incremental.java.OutputFilesSink.save(OutputFilesSink.java:100)
	at org.jetbrains.jps.incremental.java.JavaBuilder$ClassProcessingConsumer.lambda$save$1(JavaBuilder.java:1260)
	at org.jetbrains.jps.incremental.java.JavaBuilder.lambda$submitAsyncTask$1(JavaBuilder.java:669)
	at com.intellij.util.concurrency.BoundedTaskExecutor.doRun(BoundedTaskExecutor.java:226)
	at com.intellij.util.concurrency.BoundedTaskExecutor.access$100(BoundedTaskExecutor.java:26)
	at com.intellij.util.concurrency.BoundedTaskExecutor$2$1.run(BoundedTaskExecutor.java:199)
	at com.intellij.util.ConcurrencyUtil.runUnderThreadName(ConcurrencyUtil.java:229)
	at com.intellij.util.concurrency.BoundedTaskExecutor$2.run(BoundedTaskExecutor.java:193)
	at org.jetbrains.jps.service.impl.SharedThreadPoolImpl.lambda$executeOnPooledThread$0(SharedThreadPoolImpl.java:42)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:832)
Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
	at org.jetbrains.org.objectweb.asm.ClassReader.readCode(ClassReader.java:1494)
	at org.jetbrains.org.objectweb.asm.ClassReader.readMethod(ClassReader.java:1126)
	at org.jetbrains.org.objectweb.asm.ClassReader.accept(ClassReader.java:698)
	at org.jetbrains.org.objectweb.asm.ClassReader.accept(ClassReader.java:500)
	at org.jetbrains.jps.builders.java.dependencyView.ClassfileAnalyzer.analyze(ClassfileAnalyzer.java:846)
	... 16 more
 */
