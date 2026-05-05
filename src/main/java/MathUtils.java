public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
    // test cache bai 6
    public int subtract(int a, int b) {
        return a - b;
    }
}

/**
 lần 1 36s:
 Creating settings.xml with server-id: github
 Writing to /home/runner/.m2/settings.xml
 maven cache is not found

 lần 2 24s:
 Cache hit for: setup-java-Linux-x64-maven-a5b5a25399cda6d6101818b32771e402e19473f9951dc8ac9dd498406c3ebdfd
 Received 19338773 of 19338773 (100.0%), 43.9 MBs/sec
 Cache Size: ~18 MB (19338773 B)
 /usr/bin/tar -xf /home/runner/work/_temp/0c7ccb1b-27ac-498b-9618-a0840ef6ab73/cache.tzst -P -C /home/runner/work/MathUtils/MathUtils --use-compress-program unzstd
 Cache restored successfully
 Cache restored from key: setup-java-Linux-x64-maven-a5b5a25399cda6d6101818b32771e402e19473f9951dc8ac9dd498406c3ebdfd
 **/